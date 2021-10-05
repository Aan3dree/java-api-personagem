import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/data.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-get-personagem',
  templateUrl: './get-personagem.component.html',
  styleUrls: ['./get-personagem.component.scss']
})
export class GetPersonagemComponent implements OnInit {

  id = this.actRoute.snapshot.params['id'];
  personagemData: any = {};

  constructor(
    public dataService: DataService,
    public actRoute: ActivatedRoute,
    public router: Router
    ) { }

  ngOnInit(): void {
    this.loadPersonagem();
  }

  loadPersonagem(){
    this.dataService.getPersonagem(this.id).subscribe((data: {}) => {
      this.personagemData = data;
      console.log(data);
    })
  }

}
