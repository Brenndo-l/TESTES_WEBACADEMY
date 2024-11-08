import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AgendaFormComponent } from './agenda-form.component';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { FormsModule } from '@angular/forms';

describe('AgendaFormComponent', () => {
  let component: AgendaFormComponent;
  let fixture: ComponentFixture<AgendaFormComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule,
        RouterTestingModule,
        FormsModule
      ],
      declarations: [AgendaFormComponent]
    });
    fixture = TestBed.createComponent(AgendaFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
