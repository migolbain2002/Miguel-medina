import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Asesor } from 'src/app/Model/Asesor';
import { ServiceService } from 'src/app/Service/service.service';
import swal from 'sweetalert';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateAsesorComponent implements OnInit {

  asesor:Asesor = new Asesor();
  constructor(private router:Router, private service:ServiceService) { }

  ngOnInit(): void {
    this.Edit();
  }


  Edit(){
    let asesorid = localStorage.getItem("asesorid");
    this.service.getAsesorbyId(+asesorid)
    .subscribe(data => {
        this.asesor = data;
    });
  }

  Update(asesor: Asesor){
    this.service.updateAsesor(asesor)
    .subscribe(data => {
      this.asesor=data;
      if (this.asesor != null) {
        swal('Mensaje', 'Los datos se actualizaron correctamente', 'success');
      } else {
        swal('Error', 'Ocurrio un Error al realizar la accion', 'warning');
      }
      this.router.navigate(['listAsesor'])
    });
  }
}
