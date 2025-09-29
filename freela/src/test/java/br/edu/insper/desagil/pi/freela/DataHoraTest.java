package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataHoraTest {
    @Test
    public void controi(){
        Data data= new Data();
        DataHorario d =new DataHorario(data);
        assertEquals(0, d.getHora());
        assertEquals(0, d.getMinuto());
        assertEquals(0, d.minutos());
    }

    @Test
    public void horarioBaixo(){
        Data data= new Data();
        DataHorario d =new DataHorario(data);
        d.atualiza(-1,-1);
        assertEquals(0, d.getHora());
        assertEquals(0, d.getMinuto());
        assertEquals(0, d.minutos());
    }

    @Test
    public void horarioAlto(){
        Data data= new Data();
        DataHorario d =new DataHorario(data);
        d.atualiza(24,60);
        assertEquals(23, d.getHora());
        assertEquals(59, d.getMinuto());
        assertEquals(1439, d.minutos());
    }

}
