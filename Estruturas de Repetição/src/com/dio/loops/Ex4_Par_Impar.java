package com.dio.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares e impares.
 */

public class Ex4_Par_Impar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidade, numero;
        int pares = 0, impares = 0;

        System.out.println("Digite a quantidade desejada:");
        quantidade = scan.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Numero:");
            numero = scan.nextInt();

            if (numero % 2 == 0) pares++;
            else impares++;
        }

        System.out.println("Quantidade de pares: " +pares);
        System.out.println("Quantidade de impares: " +impares);
    }
}
