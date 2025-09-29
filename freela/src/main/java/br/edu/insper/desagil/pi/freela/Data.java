package br.edu.insper.desagil.pi.freela;

import java.util.HashMap;

public class Data extends Momento{
    private int ano;
    private int mes;
    private int dia;
    private HashMap<Integer, Integer> limite;

    public Data() {
        this.ano = 1970;
        this.mes = 1;
        this.dia = 1;
        this.limite = new HashMap<>();
        limite.put(1, 31);
        limite.put(2, 28);
        limite.put(3, 31);
        limite.put(4, 30);
        limite.put(5, 31);
        limite.put(6, 30);
        limite.put(7, 31);
        limite.put(8, 31);
        limite.put(9, 30);
        limite.put(10, 31);
        limite.put(11, 30);
        limite.put(12, 31);

    }

    public int getAno() {
        return ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public void atualiza(int novoAno, int novoMes, int novoDia){
        ano= ajuste(novoAno, 1970, 2070);
        mes=ajuste(novoMes, 1, 12);
        dia=ajuste(novoDia, 1, limite.get(mes));
    }


    @Override
    public int minutos() {
        int minutostotais=0;
        int minutosnoano=0;
        int diasmeses=0;

        //quantos min tem no ano
        for (int mes : limite.keySet()){
            int diatotais=limite.get(mes);
            minutosnoano+=(diatotais*24*60);
        }
        minutostotais+=(ano-1970)*minutosnoano;

        for (int i =1; i<(mes);i++){
            diasmeses+= limite.get(mes);
        }

        minutostotais+=diasmeses*24*60;

        //quantos minutos no dias do mes(dia-1 pq é meia noite)
        minutostotais+= ((dia-1)*24*60);



        return minutostotais;
    }
}
