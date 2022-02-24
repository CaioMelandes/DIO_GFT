package com.dio.loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido, e
continue pedindo até que seja informado um valor válido.
 */

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Digite uma nota:");
        nota = scan.nextInt();

        while (nota < 0 || nota > 10){
            System.out.println("NOTA INVÁLIDA! \nDigite novamente:");
            nota = scan.nextInt();
        }
    }
}
