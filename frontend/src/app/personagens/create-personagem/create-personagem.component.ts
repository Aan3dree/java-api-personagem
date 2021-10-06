import { Component, OnInit, Input, Inject } from '@angular/core';
import { FormControl, FormGroup  } from '@angular/forms';
import { MatFormFieldControl, MatHint, MatLabel } from '@angular/material/form-field';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { DataService } from 'src/app/data.service';
import { Classe } from '../models/classe';
import { Personagem } from '../models/personagem';

@Component({
  selector: 'app-create-personagem',
  templateUrl: './create-personagem.component.html',
  styleUrls: ['./create-personagem.component.scss']
})

export class CreatePersonagemComponent implements OnInit {

  //personagem: Personagem;


  personagemForm = new FormGroup({
    nome: new FormControl(),
    racaName: new FormControl(),
    classeName: new FormControl(),
    nivel: new FormControl(),
    exp: new FormControl(),
    gold: new FormControl(),
    forca: new FormControl(),
    inteligencia: new FormControl(),
    constituicao: new FormControl(),
    sabedoria: new FormControl(),
    carisma: new FormControl(),
    destreza: new FormControl()
  })


  classeList: string[] = ['L', '', '', '', ''];


  classeSelect = new FormControl();

  toppings = new FormControl();

  toppingList: string[] = ['Extra cheese', 'Mushroom', 'Onion', 'Pepperoni', 'Sausage', 'Tomato'];

  //@Input() personagemDetails = {nome: '', raca: undefined, }


  @Input() personagem: Personagem = {
    nome: "Miraki Dot",
    classeName: "Mago",
    racaName: "Elfo",
    nivel: 2,
    exp: 230,
    gold: 100.00,
    forca: 16,
    inteligencia: 10,
    constituicao: 12,
    sabedoria: 12,
    carisma: 10,
    destreza: 16
  }


  constructor(
    //public personagem: Personagem,
    public dataService: DataService,
    public actRoute: ActivatedRoute,
    public router: Router
  ) { }

  ngOnInit(): void {
    //this.loadClasses();
  }

  /*
  addPersonagem(dataPersonagem: any){
    this.dataService.createPersonagem(this.personagemForm).subscribe((data: {}) => {
      this.router.navigate([''])
    })
  }
  */


  testPost(){

    return this.dataService.createPersonagem(this.personagemForm.value).subscribe((data: {}) => {
      console.log(data);
      console.log(this.personagemForm.value);
      this.router.navigate(['']);
    })

  }


  /*
  loadClasses() {
    return this.dataService.getClasses().subscribe((data: {}) => {
      this.classeList = data;
      console.log(this.classeList[0].nome);
      console.log(this.classeSelect);
    })
  }
  */

}
