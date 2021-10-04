import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ClasseComponent } from './personagens/classe/classe.component';

const routes: Routes = [
  { path: '', pathMatch: 'full' ,redirectTo: 'personagens' },
  {
    path: 'personagens',
    loadChildren: () => import('./personagens/personagens.module').then(m => m.PersonagensModule)
  },
  {path: 'classes', component: ClasseComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
