package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TarefaTest {
    @Test
    public void controi(){

        Tarefa tarefa = new Tarefa(0);
        assertEquals(0,tarefa.getId());
        assertEquals("",tarefa.getDescricao());
        assertNull(tarefa.getInicio());
        assertNull(tarefa.getFim());
    }
    @Test
    public void mudaDescricao(){

        Tarefa tarefa = new Tarefa(0);
        tarefa.setDescricao("nova descriçaõ");
        assertEquals("nova descriçaõ",tarefa.getDescricao());

    }

    @Test
    public void momentosValidos(){

        Tarefa tarefa = new Tarefa(0);
        Data incio = new Data() ;
        incio.atualiza(1970,1,1);
        Data fim = new Data() ;
        fim.atualiza(1970,1,2);
        tarefa.atualiza(incio,fim);
        assertEquals(incio, tarefa.getInicio());
        assertEquals(fim, tarefa.getFim());

    }

    @Test
    public void momentosInvalidos(){
        Tarefa tarefa = new Tarefa(0);
        Data incio = new Data() ;
        incio.atualiza(1970,1,1);
        Data fim = new Data() ;
        fim.atualiza(1970,1,2);
        Exception e = assertThrows(IllegalArgumentException.class,()->{
            tarefa.atualiza(fim,incio);
        });
        assertEquals("Data de incio inválida!", e.getMessage());



    }


}
