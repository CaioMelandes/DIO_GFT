package com.dio.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
 */

public class Ex3_Maior_Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        double media = 0d;

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o "+(i+1)+ "º numero:");
            numero = scan.nextInt();

            if (i == 0){
                maior = numero;
            } else if (numero > maior){
                maior = numero;
            }

            media += numero;
        }

        System.out.println("\nO maior número é: " +maior);
        System.out.println("A média dos números é: " +(media/5));
    }
}
