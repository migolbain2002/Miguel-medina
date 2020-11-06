import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Citation } from 'src/app/Model/Citation';
import { ServiceService } from 'src/app/Service/service.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListCitationComponent implements OnInit {

  citations:Citation[];
  constructor(private service:ServiceService, private router:Router) { }

  ngOnInit(): void {
    this.service.getCitations()
    .subscribe(data=>{
      console.log(data);
      this.citations=data;   
    });
  }

}
