import { Asesor } from './Asesor';
import { Client } from './Client';

export class Citation{
    citationid: number;
    status: String;
    begin_citationtime: number;
    end_citationtime: number;
    citation_date: Date;
    creation_date: Date;
    clientid: Client;
    asesorid: Asesor;
}

