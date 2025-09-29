package br.edu.insper.desagil.pi.freela;

public class DataHorario extends Momento {
    private int hora;
    private int minuto;
    private Data data;

    public DataHorario(Data data) {
        this.data = data;
        this.minuto = 0;
        this.hora = 0;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void atualiza(int novaHora,int novoMinuto){
        hora = ajuste(novaHora, 0, 23);
        minuto = ajuste(novoMinuto,0,59);
    }

    @Override
    public int minutos() {
        int ate_meianoite= data.minutos();
        ate_meianoite+=minuto;
        ate_meianoite+=(hora*24);
        return ate_meianoite;
    }
}
