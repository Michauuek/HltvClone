import { Component, OnInit } from '@angular/core';
import { MainApiService } from 'src/app/app-main-service';
import { Team } from 'src/app/models/team';

@Component({
  selector: 'app-ranking-preview',
  templateUrl: './ranking-preview.component.html',
  styleUrls: ['./ranking-preview.component.css']
})
export class RankingPreviewComponent implements OnInit {

  topTeams: Team[] = [];

  constructor(private _apiService: MainApiService) {}

  ngOnInit(): void {
    this._apiService.getRanking(5).subscribe(res => {
      this.topTeams = res;
    })
  }

}
