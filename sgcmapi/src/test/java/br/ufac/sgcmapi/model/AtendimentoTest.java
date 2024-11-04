package br.ufac.sgcmapi.model;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AtendimentoTest { 
    Atendimento a;
    @BeforeEach
    public void setUp(){
      a = new Atendimento();
    }
    
    @Test
    public void testAtendimentoId(){
        a.setId(3L);
        long id = a.getId();
        assertEquals(3L, id);
    }

    @Test
    public void testAtendimentoData(){
        a.setData(LocalDate.now());
        LocalDate data = a.getData();
        assertEquals(LocalDate.now(), data);
    }

    @Test
    public void testAtendimentoHora(){
        a.setHora(LocalTime.now());
        LocalTime hora = a.getHora();
        assertEquals(LocalTime.now(), hora);
    }

    @Test
    public void testAtendimentoProfissional(){
        Profissional profissional = new Profissional();
        a.setProfissional(profissional);
        assertEquals(profissional, a.getProfissional());
    }

    @Test
    public void testAtendimentoConvenio(){
        Convenio convenio = new Convenio();
        a.setConvenio(convenio);
        assertEquals(convenio, a.getConvenio());
    }

    @Test
    public void testAtendimentoPaciente(){
        Paciente paciente = new Paciente();
        a.setPaciente(paciente);
        assertEquals(paciente, a.getPaciente());
    }

    @Test
    public void testAtendimentoStatus(){
        EStatus status = a.getStatus();
        assertEquals(EStatus.AGENDADO, status);
    }
}