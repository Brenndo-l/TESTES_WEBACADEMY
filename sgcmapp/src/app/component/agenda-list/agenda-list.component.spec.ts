import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AgendaListComponent } from './agenda-list.component';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { FormsModule } from '@angular/forms';
import { BarraComandosComponent } from '../barra-comandos/barra-comandos.component';

describe('AgendaListComponent', () => {
  let component: AgendaListComponent;
  let fixture: ComponentFixture<AgendaListComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule,
        FormsModule],
      declarations: [AgendaListComponent,
        BarraComandosComponent]
    });
    fixture = TestBed.createComponent(AgendaListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
