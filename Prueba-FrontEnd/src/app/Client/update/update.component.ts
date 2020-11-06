import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { City } from 'src/app/Model/City';
import { Client } from 'src/app/Model/Client';
import { Country } from 'src/app/Model/Country';
import { ServiceService } from 'src/app/Service/service.service';
import swal from 'sweetalert';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {

  client:Client = new Client();
  cities:City[];
  countries:Country[];
  constructor(private router:Router, private service:ServiceService) { }

  ngOnInit(): void {
    this.Edit();
    this.getCities();
    this.getCountries();
  }

  getCities(){
    this.service.getCities()
    .subscribe(data=>{
      this.cities=data;
    });
  }

  getCountries() {
    this.service.getCountries()
    .subscribe(data => {
      this.countries = data;
    });
  }

  
  Edit(){
    let clientid = localStorage.getItem("clientid");
    this.service.getClientbyId(+clientid)
    .subscribe(data => {
        this.client = data;
    });
  }

  Update(client: Client){
    this.service.updateClient(client)
    .subscribe(data => {
      this.client=data;
      if (this.client != null) {
        swal('Mensaje', 'Los datos se actualizaron correctamente', 'success');
      } else {
        swal('Error', 'Ocurrio un Error al realizar la accion', 'warning');
      }
      this.router.navigate(['list'])
    });
  }
}
