import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { City } from 'src/app/Model/City';
import { Client } from 'src/app/Model/Client';
import { Country } from 'src/app/Model/Country';
import { ServiceService } from 'src/app/Service/service.service';
import swal from 'sweetalert';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {
  
 // clientModel:Client;
  form;
  cities: City[];
  countries: Country[];
  clients: Client[];
  cityCreate = {id_city: 0};

  clientModel = {
    clientid : 0,
    name : '',
    lastname : '',
    identification : '',
    identification_type : '',
    cityid : {
        cityid : 0
    },
    countryid : {
        countryid: 0
    }
};
  constructor(private router: Router, private service: ServiceService) {    
  }

  ngOnInit(): void {
    this.getAllCities();
    this.getAllCountries();
  }

  getAllCities(){
    this.service.getCities()
    .subscribe(data => {
      this.cities = data;
    });
  }

  getAllCountries(){
    this.service.getCountries()
    .subscribe(data => {
      this.countries = data;
    });
  }


  Add(form){
    console.log(this.clientModel.countryid.countryid);
    this.service.createClient(this.clientModel)
    .subscribe(data => {
      swal('Mensaje', 'El cliente se ha agregado con exito!', 'success');
      this.router.navigate(['list']);
    });
  }
}
/*Guardar(){
  this.service.createPersona(this.persona)
  .subscribe(data=>{
    alert("Se Agrego con Exito...!!!");
    this.router.navigate(["listar"]);
  })
}*/