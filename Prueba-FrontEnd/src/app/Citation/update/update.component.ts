import { Component, OnInit } from '@angular/core';
import { Citation } from 'src/app/Model/Citation';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateCitationComponent implements OnInit {

  citation:Citation[];

  constructor() { }

  ngOnInit(): void {
  }

}
