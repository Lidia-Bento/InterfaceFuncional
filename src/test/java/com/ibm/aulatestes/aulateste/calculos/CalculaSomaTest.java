package com.ibm.aulatestes.aulateste.calculos;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculaSomaTest {
    @Test
    public void testCalculoSomaSucesso() {
        int esperado = 40;
        double soma = new CalculoSoma().soma(10.0, 30.0);
        assertEquals(soma, esperado, 0.0);
    }

    @Test
    public void testCalculoSomaFalha() {
        int esperado = 15;
        double soma = new CalculoSoma().soma(10.0, 30.0);
        assertNotEquals((double) soma, esperado, 0.0);
    }


}
