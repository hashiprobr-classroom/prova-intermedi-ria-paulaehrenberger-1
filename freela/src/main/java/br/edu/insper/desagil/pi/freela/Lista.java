package br.edu.insper.desagil.pi.freela;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private List<Tarefa>tarefas;

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public Lista() {
        this.tarefas = new ArrayList<>();
    }
    public void adiciona(Tarefa tarefa){
        if (!tarefas.contains(tarefa)){
            tarefas.add(tarefa);
        }
    }
}
