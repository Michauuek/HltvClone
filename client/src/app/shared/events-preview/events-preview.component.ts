import { Component, OnInit } from '@angular/core';
import { MainApiService } from 'src/app/app-main-service';
import { EventDto } from 'src/app/models/event';

@Component({
  selector: 'app-events-preview',
  templateUrl: './events-preview.component.html',
  styleUrls: ['./events-preview.component.css']
})
export class EventsPreviewComponent implements OnInit {

  latestEvents: EventDto[] = [];

  constructor(private _apiService: MainApiService) {}

  ngOnInit(): void {
    this._apiService.getLatestEvents(5).subscribe(res => {
      this.latestEvents = res;
    })
  }
}
