package com.ibm.aulatestes.aulateste.calculos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculaSubtracaoTest {

    @Test
    public void subtracaoSucessoTest(){
        int esperado = 20;
        double subtracao = new CalculaSubtracao().subtracao(50.0, 30.0);
        assertEquals(subtracao, esperado, 0.0);
    }

    @Test
    public void subtracaoFracassoTest(){
        int esperado = 10;
        double subtracao = new CalculaSubtracao().subtracao(50.0, 30.0);
        assertNotEquals(subtracao, esperado, 0.0);
    }
}
