import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListComponent } from './Client/list/list.component';
import { AddComponent } from './Client/add/add.component';
import { UpdateComponent } from './Client/update/update.component';
import {ServiceService} from 'src/app/Service/service.service';
import { HttpClientModule } from '@angular/common/http';
import { AddAsesorComponent } from './Asesor/add/add.component';
import { ListAsesorComponent } from './Asesor/list/list.component';
import { UpdateAsesorComponent } from './Asesor/update/update.component';
import { DataTablesModule } from 'angular-datatables';
import { ListCitationComponent } from './Citation/list/list.component';
import { AddCitationComponent } from './Citation/add/add.component';
import { UpdateCitationComponent } from './Citation/update/update.component';


@NgModule({
  declarations: [
    AppComponent,
    ListComponent,
    AddComponent,
    UpdateComponent,
    AddAsesorComponent,
    ListAsesorComponent,
    UpdateAsesorComponent,
    ListCitationComponent,
    UpdateCitationComponent,
    AddCitationComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    DataTablesModule
  ],
  providers: [ServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
