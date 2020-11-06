import { Component, OnInit, ɵConsole } from '@angular/core';
import { Router } from '@angular/router';
import { data } from 'jquery';
import { Subject } from 'rxjs';
import { City } from 'src/app/Model/City';
import { Client } from 'src/app/Model/Client';
import { ServiceService } from 'src/app/Service/service.service';


@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {
  cities:City[];
  clients:Client[];
  // clientlist: any;
  constructor(private service:ServiceService, private router:Router) { }

  ngOnInit(){
    this.service.getClients()
    .subscribe(data => {
      console.log(data);
      this.clients = data;
    });
  }


  Edit(client: Client): void{
    localStorage.setItem('clientid', client.clientid.toString());
    this.router.navigate(['update']);
  }
    

}



















  /*Edit(clientid: number){
    this.service.getClientbyId(clientid)
    .subscribe(
      data => {
        this.clientlist=data
      }
    );
  }
}*/
/*updateStudent(id: number){
  this.studentservice.getStudent(id)
    .subscribe(
      data => {
        this.studentlist=data           
      },
      error => console.log(error));
}*/
