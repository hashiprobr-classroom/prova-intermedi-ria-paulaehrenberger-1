package br.edu.insper.desagil.pi.freela;

public abstract class Momento {

    public int ajuste(int valor, int minimo, int maximo){

        if (valor>maximo){
            valor=maximo;
        }
        if(valor<minimo){
            valor=minimo;
        }
        return valor;

    }

    public abstract int minutos();
}
