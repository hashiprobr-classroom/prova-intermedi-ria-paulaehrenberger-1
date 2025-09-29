package br.edu.insper.desagil.pi.freela;


public class Tarefa {
    private int id ;
    private String descricao;
    private Momento inicio;
    private Momento fim;

    public Tarefa(int id) {
        this.id = id;
        this.descricao = "";
        this.inicio = null;
        this.fim = null;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Momento getInicio() {
        return inicio;
    }

    public Momento getFim() {
        return fim;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void atualiza(Momento novoInicio, Momento novoFim){
        int minutos_incio = novoInicio.minutos();
        int minutos_fim= novoFim.minutos();
        if(minutos_fim<minutos_incio){
            throw new IllegalArgumentException("Data de incio inválida!");
        }
        inicio = novoInicio;
        fim=novoFim;
    }

}
