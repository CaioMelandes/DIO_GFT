package com.dio.exercicio1;

public class Calculadora {
    public static void soma(double valor1, double valor2){
        System.out.println("O resultado da soma é " + (valor1 + valor2));
    }

    public static void subtracao(double valor1, double valor2){
        System.out.println("O resultado da subtração é " + (valor1 - valor2));
    }

    public static void multiplicacao(double valor1, double valor2){
        System.out.println("O resultado da multiplicação é " + (valor1 * valor2));
    }

    public static void divisao(double valor1, double valor2){
        if (valor2 == 0){
            System.out.println("Impossível fazer divisão por zero");
        } else {
            System.out.println("O resultado da divisão é " + (valor1 / valor2));
        }
    }
}
