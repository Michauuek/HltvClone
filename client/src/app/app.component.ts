import {Component, Injectable, OnInit} from '@angular/core';
import {ApiService} from "./main-page/main-page-api-service";



export interface Map {
  id: number;
  name: string;
  url: string;
}

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  siema: Map | undefined;

  constructor(private _apiService: ApiService) {
  }

  ngOnInit() {
    this._apiService.getData().subscribe(res => {
      this.siema = res;
    })
  }
}

