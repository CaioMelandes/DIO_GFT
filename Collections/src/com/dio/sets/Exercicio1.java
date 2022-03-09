package com.dio.sets;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio1 {
    public static void main(String[] args) {
        LinkedHashSet<String> arcoIris = new LinkedHashSet<>(){{
            add("vermelho");
            add("laranja");
            add("amarelo");
            add("verde");
            add("azul");
            add("índigo");
            add("violeta");
        }};

        TreeSet<String> arcoIris2 = new TreeSet<>(arcoIris);

        //Exibas todas as cores uma embaixo da outra
        for (String cor: arcoIris) System.out.println(cor);

        //Quantidade de cores
        System.out.println(arcoIris.size());

        //Exiba as cores em ordem alfabética
        System.out.println(arcoIris2);

        //Exiba as cores na ordem inversa da que foram informadas
        System.out.println(arcoIris2.descendingSet());

        //Exiba todas as cores que começam com a letra "v"
        for (String cor : arcoIris) {
            if(cor.startsWith("v")){
                System.out.println(cor);
            }
        }

        //Remova todas as cores que não começam com "v"
        arcoIris.removeIf(n -> !(n.startsWith("v")));
        System.out.println(arcoIris);

        //Limpa o conjunto
        arcoIris.clear();

        //Verifica se está vazio
        arcoIris.isEmpty();
    }
}
