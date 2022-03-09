package com.dio.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        List<String> resposta = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Telefonou para a vítima?");
        resposta.add(scan.next());

        System.out.println("Esteve no local do crime?");
        resposta.add(scan.next());

        System.out.println("Morava perto da vítima?");
        resposta.add(scan.next());

        System.out.println("Devia para a vítima?");
        resposta.add(scan.next());

        System.out.println("Já trabalhou com a vítima?");
        resposta.add(scan.next());

        switch (Collections.frequency(resposta, "S")){
            case 0, 1 -> System.out.println("Inocente");
            case 2 -> System.out.println("Suspeita");
            case 3, 4 -> System.out.println("Cúmplice");
            case 5 -> System.out.println("Assassina");
        }
    }
}
