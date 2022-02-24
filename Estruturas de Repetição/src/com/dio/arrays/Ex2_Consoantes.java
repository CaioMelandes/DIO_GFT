package com.dio.arrays;

import java.util.Scanner;

/*
Faça um programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
 */
public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidade = 0;

        int count = 0;
        do {
            System.out.println("Digite a letra:");
            String letra = scan.next();

            switch (letra.toLowerCase()){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    break;
                default:
                    consoantes[count] = letra;
                    quantidade++;
            }

            count++;
        } while(count < consoantes.length);

        System.out.println("Quantidade de consoantes foi " +quantidade+ ':');
        for (String consoante : consoantes) {
            if (consoante != null) {
                System.out.print(consoante+ ' ');
            }
        }
    }
}
