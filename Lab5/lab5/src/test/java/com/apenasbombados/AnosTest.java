package com.apenasbombados;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AnosTest {

    public AnosTest() {

    }

    Anos Ano = new Anos();

    @Test
    public void testDataValida() {
       
        assertEquals("Data válida", Ano.validaAno(2000));

        assertEquals("Data válida", Ano.validaAno(1900));

        assertEquals("Data válida", Ano.validaAno(1901));

        assertEquals("Data válida", Ano.validaAno(2021));

        assertEquals("Data válida", Ano.validaAno(2022));

    }

    @Test
    public void testDataInvalida() {
 
        assertEquals("Data inválida", Ano.validaAno(1800));

        assertEquals("Data inválida", Ano.validaAno(2100));

        assertEquals("Data inválida", Ano.validaAno(1899));

        assertEquals("Data inválida", Ano.validaAno(2023));

    }
}
