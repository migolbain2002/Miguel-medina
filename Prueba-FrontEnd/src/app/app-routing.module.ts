import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddComponent } from './Client/add/add.component';
import { ListComponent } from './Client/list/list.component';
import { UpdateComponent } from './Client/update/update.component';
import { AddAsesorComponent } from './Asesor/add/add.component';
import { ListAsesorComponent } from './Asesor/list/list.component';
import { UpdateAsesorComponent } from './Asesor/update/update.component';
import { ListCitationComponent } from './Citation/list/list.component';
import { AddCitationComponent } from './Citation/add/add.component';
import { UpdateCitationComponent } from './Citation/update/update.component';

const routes: Routes = [
  /*{
    path: '',
    redirectTo:'list',
    pathMatch: 'full'
  },*/
  {path: 'list', component: ListComponent},
  {path: 'add', component: AddComponent},
  {path: 'update', component: UpdateComponent},
  {path: 'addAsesor', component: AddAsesorComponent},
  {path: 'listAsesor', component: ListAsesorComponent},
  {path: 'updateAsesor', component: UpdateAsesorComponent},
  {path: 'listCitation', component: ListCitationComponent},
  {path: 'addCitation', component: AddCitationComponent},
  {path: 'listCitation', component: UpdateCitationComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
