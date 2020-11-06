import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Asesor } from 'src/app/Model/Asesor';
import { ServiceService } from 'src/app/Service/service.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListAsesorComponent implements OnInit {

  asesors:Asesor[];
  constructor(private service:ServiceService, private router:Router) { }

  ngOnInit(): void {
    this.service.getAsesores()
    .subscribe(data=>{
      this.asesors=data;
    });
  }

  Edit(asesor:Asesor):void{
    localStorage.setItem("asesorid",asesor.asesorid.toString());
    this.router.navigate(["updateAsesor"]);
  }
}
