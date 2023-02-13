import { Component, OnInit } from '@angular/core';
import { EventDto } from 'src/app/models/event';

@Component({
  selector: 'app-events-preview',
  templateUrl: './events-preview.component.html',
  styleUrls: ['./events-preview.component.css']
})
export class EventsPreviewComponent implements OnInit {

  events: EventDto[] = [];

  constructor() { }

  ngOnInit(): void {
    this.events = [
      {id: 1, name: 'G2', organizer: 'G2', startDate: '2020-01-01', endDate: '2020-01-02', prizePool: 1000, location: 'Europe'},
      {id: 2, name: 'ESL', organizer: 'Heroic', startDate: '2020-01-01', endDate: '2020-01-02', prizePool: 900, location: 'Europe'},
      {id: 2, name: 'Dupa', organizer: 'Heroic', startDate: '2020-01-01', endDate: '2020-01-02', prizePool: 900, location: 'Europe'},
      {id: 2, name: 'Major', organizer: 'Heroic', startDate: '2020-01-01', endDate: '2020-01-02', prizePool: 900, location: 'Europe'},
    ]
  }
}
