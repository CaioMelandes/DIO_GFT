package com.dio.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        List<Double> temperaturas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.println("Digite a temperatura:");
            temperaturas.add(scan.nextDouble());
        }

        double soma = 0.0;
        for (double valor : temperaturas) {
            soma += valor;
        }

        double media = soma / temperaturas.size();

        for (int i = 0; i < temperaturas.size(); i++) {
            if (temperaturas.get(i) > media){
                switch (i){
                    case 0 -> System.out.println("Janeiro com " +temperaturas.get(i)+ "°");
                    case 1 -> System.out.println("Fevereiro com " +temperaturas.get(i)+ "°");
                    case 2 -> System.out.println("Março com " +temperaturas.get(i)+ "°");
                    case 3 -> System.out.println("Abril com " +temperaturas.get(i)+ "°");
                    case 4 -> System.out.println("Maio com " +temperaturas.get(i)+ "°");
                    case 5 -> System.out.println("Junho com " +temperaturas.get(i)+ "°");
                }
            }
        }
    }
}
