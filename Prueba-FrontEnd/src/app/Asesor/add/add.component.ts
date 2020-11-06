import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Asesor } from 'src/app/Model/Asesor';
import { ServiceService } from 'src/app/Service/service.service';
import swal from 'sweetalert';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddAsesorComponent implements OnInit {

  asesor:Asesor;
  asesorModel = {
    asesorid : 0,
    fullname : '',
    identification : '',
    identification_type : '',
    experience_years : '',
    speciality : '',
    begin_timeatention : '',
    end_timeatention : ''
};
  constructor(private router: Router, private service: ServiceService) { }

  ngOnInit(): void {
  }



  AddAsesor(form){
    this.service.createAsesor(this.asesorModel)
    .subscribe(data => {
      if (this.asesorModel != null) {
        swal('Mensaje', 'El Asesor se ha insertado correctamente', 'success');
      } else {
        swal('Error', 'Ocurrio un Error al realizar la accion', 'warning');
      }
      this.router.navigate(['list']);
    });
  }
}
