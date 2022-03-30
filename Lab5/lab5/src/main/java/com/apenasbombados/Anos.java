package com.apenasbombados;

public class Anos {
    public String validaAno(int ano) {
        String resValida = "";
        if (ano >= 1900 && ano <= 2022) {
            resValida= "Data válida";
        } else {
            resValida = "Data inválida";
        }
        return resValida;
    }
}
