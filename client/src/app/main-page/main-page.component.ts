import {Component, Injectable, OnInit} from '@angular/core';
import {ApiService} from "./main-page-api-service";

@Component({
  selector: 'app-main-page',
  templateUrl: './main-page.component.html',
  styleUrls: ['./main-page.component.css']
})

@Injectable()
export class MainPageComponent implements OnInit {
  siema: string | undefined;

  constructor(private _apiService: ApiService) {
  }

  ngOnInit() {
    
  }
}
