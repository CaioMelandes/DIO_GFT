package com.dio.arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa
 */
public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {6, 48, 32, 9, 21, -2};

        System.out.print("Vetor invertido: ");
        for (int i = (vetor.length - 1); i >= 0; i--){
            System.out.print(vetor[i]+ " ");
        }
    }
}
