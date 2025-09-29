package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataTest {
    @Test
    public void controi() {
        Data data = new Data();
        assertEquals(1, data.getDia());
        assertEquals(1, data.getMes());
        assertEquals(1970, data.getAno());
        assertEquals(0, data.minutos());
    }
    @Test
    public void dataBaixa(){
        Data data = new Data();
        data.atualiza(1969,0,0);
        assertEquals(1, data.getDia());
        assertEquals(1, data.getMes());
        assertEquals(1970, data.getAno());
        assertEquals(0, data.minutos());
    }

    @Test
    public void dataAlta(){
        Data data = new Data();
        data.atualiza(2071,12,32);
        assertEquals(31, data.getDia());
        assertEquals(12, data.getMes());
        assertEquals(2070, data.getAno());
        assertEquals(53094240, data.minutos());
}

}
