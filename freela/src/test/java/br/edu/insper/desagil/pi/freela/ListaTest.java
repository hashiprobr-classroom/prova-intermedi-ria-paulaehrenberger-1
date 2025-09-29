package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListaTest {
    @Test
    public void controi(){
        Lista lista = new Lista();
        int tam = lista.getTarefas().size();
        assertEquals(0, tam);
    }
    @Test
    public void adicionaIguais(){
        Lista lista = new Lista();
        Tarefa tarefa = new Tarefa(0);
        lista.adiciona(tarefa);
        lista.adiciona(tarefa);
        int tam = lista.getTarefas().size();
        assertEquals(1, tam);
    }

    @Test
    public void adicionaDiferentes(){
        Lista lista = new Lista();
        Tarefa tarefa = new Tarefa(0);
        lista.adiciona(tarefa);
        Tarefa tarefa2 = new Tarefa(0);
        lista.adiciona(tarefa2);
        int tam = lista.getTarefas().size();
        assertEquals(2, tam);
    }
}
