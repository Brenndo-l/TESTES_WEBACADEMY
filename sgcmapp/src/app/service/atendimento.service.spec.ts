import { TestBed } from '@angular/core/testing';

import { AtendimentoService } from './atendimento.service';
import { HttpClientTestingModule } from '@angular/common/http/testing';
// Agrupa testes relacionados
describe('AtendimentoService', () => {
  let service: AtendimentoService;
  // Configurações iniciais do teste
  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule]
    });
    service = TestBed.inject(AtendimentoService);
  });
  // Código de teste e expectativas
  it('should be created', () => {
    expect(service).toBeTruthy();
  });
  // ... mais testes (it) se necessário ...
});
