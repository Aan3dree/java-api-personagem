import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { PersonagensRoutingModule } from './personagens-routing.module';
import { PersonagensComponent } from './personagens/personagens.component';
import {MatTableModule} from '@angular/material/table';
import {MatButtonModule} from '@angular/material/button';
import {MatListModule} from '@angular/material/list';
import {MatGridListModule} from '@angular/material/grid-list';
import { ClasseComponent } from './classe/classe.component';
import {MatIconModule} from '@angular/material/icon';
import {MatFormFieldModule} from '@angular/material/form-field';

import { CreatePersonagemComponent } from './create-personagem/create-personagem.component';
import { GetPersonagemComponent } from './get-personagem/get-personagem.component';
import { EditPersonagemComponent } from './edit-personagem/edit-personagem.component';
import {MatSelectModule} from '@angular/material/select';


@NgModule({
  declarations: [
    PersonagensComponent,
    ClasseComponent,
    CreatePersonagemComponent,
    GetPersonagemComponent,
    EditPersonagemComponent
  ],
  imports: [
    CommonModule,
    PersonagensRoutingModule,
    MatTableModule,
    MatButtonModule,
    MatIconModule,
    FormsModule,
    MatListModule,
    MatGridListModule,
    MatFormFieldModule,
    MatSelectModule,
    ReactiveFormsModule
  ]
})
export class PersonagensModule { }
