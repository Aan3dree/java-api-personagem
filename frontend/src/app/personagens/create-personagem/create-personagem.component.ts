import { Component, OnInit, Input } from '@angular/core';
import { FormControl, FormGroup  } from '@angular/forms';
import { MatFormFieldControl, MatHint, MatLabel } from '@angular/material/form-field';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { DataService } from 'src/app/data.service';
import { Classe } from '../models/classe';


@Component({
  selector: 'app-create-personagem',
  templateUrl: './create-personagem.component.html',
  styleUrls: ['./create-personagem.component.scss']
})

export class CreatePersonagemComponent implements OnInit {


  /*
  personagemForm = new FormGroup({
    nome: new FormControl(''),
    raca: new FormGroup({
      id: new FormControl(undefined)
    }),
    classe: new FormGroup({
      id: new FormControl(undefined)
    }),
    nivel: new FormControl(undefined),
    exp: new FormControl(undefined),
    gold: new FormControl(undefined),
    forca: new FormControl(undefined),
    inteligencia: new FormControl(undefined),
    constituicao: new FormControl(undefined),
    sabedoria: new FormControl(undefined),
    carisma: new FormControl(undefined),
    destreza: new FormControl(undefined)
  })
  */

  classeList: any = [];


  classeSelect = new FormControl();

  toppings = new FormControl();

  toppingList: string[] = ['Extra cheese', 'Mushroom', 'Onion', 'Pepperoni', 'Sausage', 'Tomato'];

  //@Input() personagemDetails = {nome: '', raca: undefined, }

  constructor(
    public dataService: DataService,
    public actRoute: ActivatedRoute,
    public router: Router
  ) { }

  ngOnInit(): void {
    this.loadClasses();
  }

  /*
  addPersonagem(dataPersonagem: any){
    this.dataService.createPersonagem(this.personagemForm).subscribe((data: {}) => {
      this.router.navigate([''])
    })
  }
  */

  loadClasses() {
    return this.dataService.getClasses().subscribe((data: {}) => {
      this.classeList = data;
      console.log(this.classeList[0].nome);
      console.log(this.classeSelect);
    })
  }

}
