package com.apenasbombados;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IdadeMotoTest {

    public IdadeMotoTest() {

    }

    IdadeMoto Moto = new IdadeMoto();

    @Test
    public void testRenovacao10Anos() {
        
        assertEquals("10 ANOS", Moto.validaIdade(20));

        assertEquals("10 ANOS", Moto.validaIdade(49));
    }

    @Test
    public void testRenovacao5Anos() {

        assertEquals("5 ANOS", Moto.validaIdade(60));

        assertEquals("5 ANOS", Moto.validaIdade(50));

        assertEquals("5 ANOS", Moto.validaIdade(51));

        assertEquals("5 ANOS", Moto.validaIdade(69));
    }

    @Test
    public void testRenovacao3Anos() {
        
        assertEquals("3 ANOS", Moto.validaIdade(80));

        assertEquals("3 ANOS", Moto.validaIdade(70));

        assertEquals("3 ANOS", Moto.validaIdade(71));
    }
}
