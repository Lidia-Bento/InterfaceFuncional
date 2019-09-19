package com.ibm.aulatestes.aulateste.calculos;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculoMediaTest {
    @Test
    public void testCalculaMediaSucesso() {
        int esperado = 20;
        Double media = new CalculaMedia().media(10.0, 30.0);
        assertEquals((double) media, esperado, 0.0);
    }

    @Test
    public void testCalculaMediaFalha() {
        int esperado = 10;
        Double media = new CalculaMedia().media(10.0, 30.0);
        assertNotEquals((double) media, esperado, 0.0);
    }
}
