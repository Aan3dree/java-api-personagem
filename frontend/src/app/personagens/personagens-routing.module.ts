import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ClasseComponent } from './classe/classe.component';
import { PersonagensComponent } from './personagens/personagens.component';

const routes: Routes = [
  { path: '', component: PersonagensComponent },
  { path: 'classes', component: ClasseComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PersonagensRoutingModule { }
