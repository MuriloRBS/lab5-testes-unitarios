package com.apenasbombados;

public class IdadeMoto {
    public String validaIdade(int idade) {
        String resValida = "";
        if (idade < 50) {
            resValida = "10 ANOS";
        } else if (idade < 70) {
            resValida = "5 ANOS";
        } else {
            resValida = "3 ANOS";
        }
        return resValida;
    }
}
