import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ClasseComponent } from './classe/classe.component';
import { CreatePersonagemComponent } from './create-personagem/create-personagem.component';
import { EditPersonagemComponent } from './edit-personagem/edit-personagem.component';
import { GetPersonagemComponent } from './get-personagem/get-personagem.component';
import { PersonagensComponent } from './personagens/personagens.component';

const routes: Routes = [
  { path: '', component: PersonagensComponent },
  { path: 'create', component: CreatePersonagemComponent},
  { path: 'edit/:id', component: EditPersonagemComponent},
  { path: 'get/:id', component: GetPersonagemComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PersonagensRoutingModule { }
