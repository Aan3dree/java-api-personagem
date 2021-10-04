import { Component, OnInit } from '@angular/core';
import { Classe } from '../models/classe';
import { DataService } from 'src/app/data.service';

@Component({
  selector: 'app-classe',
  templateUrl: './classe.component.html',
  styleUrls: ['./classe.component.scss']
})
export class ClasseComponent implements OnInit {

  /*
  classes: Classe[] = [
    {_id: 1, nome: 'Guerreiro', pericias:'Agarrar'},
    {_id: 2, nome: 'Mago', pericias:'Agarrar'}
  ];
  displayedColumns = ['nome', 'pericias'];
  dataSource = this.classes;
  */
  displayedColumns = ['nome', 'pericias', 'botoes'];

  Classe: any = [];
  dataSource = this.Classe;

  constructor(private dataService: DataService) {
    //this.classes = [];
   }

  ngOnInit(): void {
    this.loadClasses()
  }

  loadClasses() {
    return this.dataService.getClasses().subscribe((data: {}) => {
      this.Classe = data;
      console.log(data);
    })
  }

}

