import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PersonagensRoutingModule } from './personagens-routing.module';
import { PersonagensComponent } from './personagens/personagens.component';


@NgModule({
  declarations: [
    PersonagensComponent
  ],
  imports: [
    CommonModule,
    PersonagensRoutingModule
  ]
})
export class PersonagensModule { }
