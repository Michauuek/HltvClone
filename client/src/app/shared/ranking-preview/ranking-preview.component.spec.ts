import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RankingPreviewComponent } from './ranking-preview.component';

describe('RankingPreviewComponent', () => {
  let component: RankingPreviewComponent;
  let fixture: ComponentFixture<RankingPreviewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RankingPreviewComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RankingPreviewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
