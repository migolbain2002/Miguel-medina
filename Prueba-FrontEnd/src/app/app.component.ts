import { Component } from '@angular/core';
import { Router } from '@angular/router';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Prueba-FrontEnd';

  constructor(private router: Router){}

  Listar(){
    this.router.navigate(['list']);
  }
  Nuevo(){
    this.router.navigate(['add']);
  }

  NuevoAsesor(){
    this.router.navigate(['addAsesor']);
  }
  ListarAsesores(){
    this.router.navigate(['listAsesor']);
  }

  ListarCitas(){
    this.router.navigate(['listCitation']);
  }
  NuevaCita(){
    this.router.navigate(['addCitation']);
  }

}
