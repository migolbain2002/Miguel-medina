import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Client } from '../Model/Client';
import { Observable, zip } from 'rxjs';
import { City } from '../Model/City';
import { Country } from '../Model/Country';
import { Asesor } from '../Model/Asesor';
import { Citation } from '../Model/Citation';


@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  Client: Client;
  constructor(private http: HttpClient) { }

  private url = 'http://localhost:8080';

  getClients(){
    return this.http.get<Client[]>(this.url + '/ClientController/list');
  }
  createClient(client){
    return this.http.post<Client>(this.url + '/ClientController/add', client);
  }
  getClientbyId(clientid: number){
    return this.http.get<Client>(this.url + '/ClientController/getClientbyId/'+clientid)
  }
  updateClient(client:Client){
    return this.http.post<Client>(this.url + '/ClientController/updateClient', client);
  }


  getCities(){
    return this.http.get<City[]>(this.url + '/CityController/getCities')
  }
  getCountries(){
    return this.http.get<Country[]>(this.url + '/CountryController/getCountries')
  }


  getAsesores(){
    return this.http.get<Asesor[]>(this.url + '/AsesorController/list');
  }
  createAsesor(asesor){
    return this.http.post<Asesor>(this.url + '/AsesorController/add', asesor);
  }
  getAsesorbyId(asesorid: number){
    return this.http.get<Asesor>(this.url + '/AsesorController/getAsesorbyId/'+asesorid);
  }
  updateAsesor(asesor:Asesor){
    return this.http.post<Asesor>(this.url + '/AsesorController/updateAsesor', asesor);
  }
  
  getAsesorbyIdentification(identificationAsesor: string){
    return this.http.get<Asesor>(this.url + '/CitationController/getAsesorbyIdentification/'+identificationAsesor);
  }
  getClientbyIdentification(identification: string){
    return this.http.get<Client>(this.url + '/CitationController/getClientbyIdentification/'+identification);
  }


  getCitations(){
    return this.http.get<Citation[]>(this.url + '/CitationController/list')
  }
  createCitation(citationModel){
    return this.http.post<Citation>(this.url + '/CitationController/add', citationModel);
  }
  updateCitation(citation:Citation){
    return this.http.post<Citation>(this.url+ '/CitationController/add', citation);
  }

  getCitas(identification:string){
    return this.http.get<Citation[]>(this.url+'/CitationController/getCitationsbyAsesor/'+identification )
  }
}
