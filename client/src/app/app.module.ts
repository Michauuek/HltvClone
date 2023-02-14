import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {HttpClientModule} from "@angular/common/http";
import { MainPageComponent } from './main-page/main-page.component';
import { ApiService } from './main-page/main-page-api-service';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { HeaderComponent } from './shared/header/header.component';
import { NewsTileComponent } from './shared/news-tile/news-tile.component';
import { RankingPreviewComponent } from './shared/ranking-preview/ranking-preview.component';
import { EventsPreviewComponent } from './shared/events-preview/events-preview.component';
import { MatchesPreviewComponent } from './shared/matches-preview/matches-preview.component';
import { MainApiService } from './app-main-service';

@NgModule({
  declarations: [
    AppComponent,
    MainPageComponent,
    HeaderComponent,
    NewsTileComponent,
    RankingPreviewComponent,
    EventsPreviewComponent,
    MatchesPreviewComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    NgbModule,
  ],
  providers: [MainApiService],
  bootstrap: [AppComponent]
})
export class AppModule { }
