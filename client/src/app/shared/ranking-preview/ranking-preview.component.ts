import { Component, OnInit } from '@angular/core';
import { Team } from 'src/app/models/team';

@Component({
  selector: 'app-ranking-preview',
  templateUrl: './ranking-preview.component.html',
  styleUrls: ['./ranking-preview.component.css']
})
export class RankingPreviewComponent implements OnInit {

  teams: Team[] = [];

  constructor() { }

  ngOnInit(): void {
    this.teams = [
      {id: 1, name: 'G2', country: 'Europe', logoUrl: 'url', rankingPoints: 1000, avgPlayerAge: 30},
      {id: 2, name: 'Heroic', country: 'Europe', logoUrl: 'url', rankingPoints: 900, avgPlayerAge: 30},
      {id: 3, name: 'Faze', country: 'Europe', logoUrl: 'url', rankingPoints: 800, avgPlayerAge: 30},
      {id: 4, name: 'Liquid', country: 'Europe', logoUrl: 'url', rankingPoints: 700, avgPlayerAge: 30},
      {id: 5, name: 'Outsiders', country: 'Europe', logoUrl: 'url', rankingPoints: 600, avgPlayerAge: 30},
    ]
  }

}
