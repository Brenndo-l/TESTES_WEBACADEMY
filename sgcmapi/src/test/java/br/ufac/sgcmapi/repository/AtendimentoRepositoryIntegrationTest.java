package br.ufac.sgcmapi.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import br.ufac.sgcmapi.model.Atendimento;

@DataJpaTest
public class AtendimentoRepositoryIntegrationTest {
    @Autowired
    private AtendimentoRepository repo;

    @Test
    public void testAtentimentoGet() {
        String termo = "Maria";
        List<Atendimento> lista = repo.busca(termo);
        assertEquals(2, lista.size());
        assertEquals("Cardiologia", lista.get(0).getProfissional().getEspecialidade().getNome());
    }

}
