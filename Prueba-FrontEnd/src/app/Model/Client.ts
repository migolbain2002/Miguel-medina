import { City } from './City';
import { Country } from './Country';

export class Client{
    clientid :number;
    name: String;
    lastname: String;
    identification: string;
    identification_type: String;
    fecha: Date;
    cityid: City;
    countryid: Country;

    constructor(){
        
    }
}