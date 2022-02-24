package com.dio.loops;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo a sua idade.
(Pare quando for inserido o valor 0 no campo nome)
 */

public class Ex1_Nome_Idade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true){
            System.out.println("Digite o nome do aluno: ");
            nome = scan.next();

            if (nome.equals("0")) break;

            System.out.println("Digite a idade do aluno: ");
            idade = scan.nextInt();

            System.out.println(nome+ " tem " +idade+ " anos");
        }
    }
}
