package com.dio.loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número
inteiro fornecido pelo usuário
 */
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fatorial = 1;

        System.out.println("Digite um número:");
        int numero = scan.nextInt();

        for (int i = numero; i >= 1; i--) {
            fatorial *= i;
        }

        System.out.println(numero+ "! = " +fatorial);
    }
}
