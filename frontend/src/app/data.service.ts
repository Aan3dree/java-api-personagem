import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError, retry } from 'rxjs/operators';
import { Classe } from './personagens/models/classe'

@Injectable({
  providedIn: 'root'
})
export class DataService {



  private REST_API_SERVER = "http://localhost:8080/api";

  constructor(private http: HttpClient) {

   }

   httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
      'Access-Control-Allow-Origin': 'http://localhost:4200',
      'Access-Control-Allow-Credentials': 'true'
    })
  }

  handleError(error: any) {
    let errorMessage = '';
    if(error.error instanceof ErrorEvent) {
      // Get client-side error
      errorMessage = error.error.message;
    } else {
      // Get server-side error
      errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;
    }
    window.alert(errorMessage);
    return throwError(errorMessage);
 }

  getClasses(): Observable<Classe> {
    return this.http.get<Classe>(this.REST_API_SERVER + '/classes')
    .pipe(
      retry(1),
      catchError(this.handleError)
    )
  }

}
