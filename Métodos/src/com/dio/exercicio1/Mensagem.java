package com.dio.exercicio1;

public class Mensagem {
    public static void obterMensagem(int hora){

        if (hora >= 6 && hora <= 12) {
            System.out.println("Bom dia!");
        } else if (hora >= 13 && hora <= 18){
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }
    }
}
