package com.dio.exercicio1;

public class Emprestimo {
    public static void calcularValorFinal(float valor, int tempo){
        float valorFinal = valor * (float) Math.pow(1.04, tempo);
        System.out.printf("Após " +tempo+ " meses o valor a pagar será de R$ %.2f", valorFinal);
    }
}
