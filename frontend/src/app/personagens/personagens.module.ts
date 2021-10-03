import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PersonagensRoutingModule } from './personagens-routing.module';
import { PersonagensComponent } from './personagens/personagens.component';
import {MatTableModule} from '@angular/material/table';


@NgModule({
  declarations: [
    PersonagensComponent
  ],
  imports: [
    CommonModule,
    PersonagensRoutingModule,
    MatTableModule
  ]
})
export class PersonagensModule { }
