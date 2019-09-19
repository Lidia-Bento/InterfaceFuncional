package com.ibm.aulatestes.aulateste.calculos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculaMultiplicaoTest {

    @Test
    public void multiplicacaoSucessoTest(){
        int esperado = 500;
        Double multiplicacao = new CalculaMultiplicacao().multiplicacao(50.0, 10.0);
        assertEquals((double) multiplicacao, esperado, 0.0);
    }

    @Test
    public void multiplicacaoFracassoTest(){
        int esperado = 200;
        Double multiplicacao = new CalculaMultiplicacao().multiplicacao(50.0, 10.0);
        assertNotEquals((double) multiplicacao, esperado, 0.0);
    }
}
