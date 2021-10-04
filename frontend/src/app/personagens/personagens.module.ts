import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PersonagensRoutingModule } from './personagens-routing.module';
import { PersonagensComponent } from './personagens/personagens.component';
import {MatTableModule} from '@angular/material/table';
import {MatButtonModule} from '@angular/material/button';
import { ClasseComponent } from './classe/classe.component';
import {MatIconModule} from '@angular/material/icon';


@NgModule({
  declarations: [
    PersonagensComponent,
    ClasseComponent
  ],
  imports: [
    CommonModule,
    PersonagensRoutingModule,
    MatTableModule,
    MatButtonModule,
    MatIconModule
  ]
})
export class PersonagensModule { }
