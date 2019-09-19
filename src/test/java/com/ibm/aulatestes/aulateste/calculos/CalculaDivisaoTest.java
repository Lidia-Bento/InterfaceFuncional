package com.ibm.aulatestes.aulateste.calculos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculaDivisaoTest {

    @Test
    public void divisaoSucessoTest(){
        int esperado = 5;
        Double divisao = new CalculaDivisao().divisao(50.0, 10.0);
        assertEquals((double) divisao, esperado, 0.0);
    }

    @Test
    public void divisaoFracassoTest(){
        int esperado = 2;
        Double divisao = new CalculaDivisao().divisao(50.0, 10.0);
        assertNotEquals((double) divisao, esperado, 0.0);
    }
}
