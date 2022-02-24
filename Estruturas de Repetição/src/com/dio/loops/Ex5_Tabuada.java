package com.dio.loops;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 e 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada do 5:
5 X 1 = 5
...
5 X 10 = 50
 */
public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Escolha o número:");
        numero = scan.nextInt();

        System.out.println("Tabuada do " +numero+ ':');
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero+ " X " +i+ " = " +(numero*i));
        }
    }
}
