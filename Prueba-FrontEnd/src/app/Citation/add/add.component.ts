import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Asesor } from 'src/app/Model/Asesor';
import { Citation } from 'src/app/Model/Citation';
import { Client } from 'src/app/Model/Client';
import { ServiceService } from 'src/app/Service/service.service';
import swal from 'sweetalert';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddCitationComponent implements OnInit {

  citations: Citation[];
  client: Client = new Client();
  asesor: Asesor = new Asesor();
  identifi: string;
  identificationAsesor: string;
  error = 0;
  citationModel = {
    citationid: 0,
    status: 'Activa',
    begin_citationtime: 0,
    end_citationtime: 0,
    citation_date: '',
    asesorid: {
      asesorid: 0
    },
    clientid: {
      clientid: 0
    }
  };

  constructor(private router: Router, private service: ServiceService) { }

  ngOnInit(): void {
  }

  getClientByIdentification() {
    this.service.getClientbyIdentification(this.identifi)
      .subscribe(data => {
        this.citationModel.clientid.clientid = data.clientid;
        this.client = data;
      });
  }

  getAsesorByIdentification() {
    this.service.getAsesorbyIdentification(this.identificationAsesor)
      .subscribe(data => {
        this.citationModel.asesorid.asesorid = data.asesorid;
        this.asesor = data;
      });
  }

  getCita() {
    this.service.getCitas(this.identificationAsesor)
      .subscribe(data => {
        console.log("estooooooooo  " + data);
        this.citations = data;
      })
  }

  Add(form) {
    this.getAsesorByIdentification();
    if (this.citationModel.begin_citationtime >= this.asesor.begin_timeatention &&
      this.citationModel.end_citationtime <= this.asesor.end_timeatention) {
        this.service.getCitas(this.identificationAsesor)
        .subscribe(data => {
          this.citations = data;
          if (this.citations[0] == null) {
            this.error = 0;
          }else{
            for (let i = 0; i < this.citations.length ; i++) {
              console.log("entro " + i + " vez")
              if (this.citations[i].begin_citationtime > this.citationModel.begin_citationtime && this.citations[i].begin_citationtime >=  this.citationModel.end_citationtime){
                this.error = 0;
              }else{
                if (this.citations[i].end_citationtime <= this.citationModel.begin_citationtime) {
                  this.error = 0;
                }else{
                  swal('Error', 'No se pudo registrar la cita debido a que el asesor ya tiene una cita en el tiempo agendado', 'warning');
                  this.error ++;
                  i = this.citations.length + 1;
                }
              }
            }
          }
          console.log(this.error);
          if(this.error === 0){
            this.service.createCitation(this.citationModel)
            .subscribe( data => {
              if (this.citationModel != null) {
                swal('Mensaje', 'La cita se agendo correctamente', 'success');
              } else {
                swal('Error', 'Ocurrio un Error al realizar la accion', 'warning');
              }
              this.router.navigate(['listCitation']);
            });
          }

        });
    } else {
      swal('Error', 'No se pudo registrar la cita debido a que el asesor no se encuentra disponible', 'warning');
    }
  }
}
