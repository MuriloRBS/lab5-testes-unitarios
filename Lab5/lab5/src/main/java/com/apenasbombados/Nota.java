package com.apenasbombados;

public class Nota {
    public String validaNota(Double nota) {
        String resValida = "";
        if (nota >= 0 && nota <= 10) {
            resValida = "Nota válida";
        } else {
            resValida = "Nota inválida";
        }
        return resValida;
    }
}
