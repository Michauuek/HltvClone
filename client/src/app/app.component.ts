import {Component, Injectable, OnInit} from '@angular/core';
import {ApiService} from "./main-page/main-page-api-service";
import { MainApiService } from './app-main-service';
import { News } from './models/news';
import { Team } from './models/team';
import { Match } from './models/match';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  latestNews: News[] = [];

  constructor(private _apiService: MainApiService) {}

  ngOnInit() {
    this._apiService.getLatestNews(30).subscribe(res => {
      this.latestNews = res;
    })
  }
}

