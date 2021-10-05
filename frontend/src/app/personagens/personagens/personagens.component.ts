import { Component, OnInit } from '@angular/core';
import { Personagem } from '../models/personagem';
import { DataService } from 'src/app/data.service';

@Component({
  selector: 'app-personagens',
  templateUrl: './personagens.component.html',
  styleUrls: ['./personagens.component.scss']
})
export class PersonagensComponent implements OnInit {

  Personagem: any = [];
  dataSource = this.Personagem;
  displayedColumns = ['nome', 'nivel', 'raca', 'classe', 'exp', 'gold', 'botoes'];

  constructor(private dataService: DataService) { }

  ngOnInit(): void {
    this.loadPersonagens();
  }

  loadPersonagens() {
    return this.dataService.getPersonagens().subscribe((data: {}) => {
      this.Personagem = data;
      console.log(data);
    })
  }

  addData(){

  }

}
