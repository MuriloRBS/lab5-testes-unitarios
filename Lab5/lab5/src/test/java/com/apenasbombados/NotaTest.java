package com.apenasbombados;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NotaTest {

    public NotaTest() {

    }

    Nota NotaAluno = new Nota();

    @Test
    public void testNotaValida() {
        
        assertEquals("Nota válida", NotaAluno.validaNota(6.0));

        assertEquals("Nota válida", NotaAluno.validaNota(0.0));
        
        assertEquals("Nota válida", NotaAluno.validaNota(1.0));

        assertEquals("Nota válida", NotaAluno.validaNota(9.0));

        assertEquals("Nota válida", NotaAluno.validaNota(10.0));
    }

    @Test
    public void testNotaInvalida() {

        assertEquals("Nota inválida", NotaAluno.validaNota(-5.0));

        assertEquals("Nota inválida", NotaAluno.validaNota(15.0));

        assertEquals("Nota inválida", NotaAluno.validaNota(-1.0));

        assertEquals("Nota inválida", NotaAluno.validaNota(11.0));

    }
}
