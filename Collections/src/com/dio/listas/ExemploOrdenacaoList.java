package com.dio.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Leona", 18, "Preta e Laranja"));
            add(new Gato("Eve", 24, "Preta e Branca"));
            add(new Gato("Leona", 18, "Preta e Laranja"));
            add(new Gato("Heitor", 24, "Rajado"));
        }};

        //Ordem de Inserção
        System.out.println(meusGatos);

        //Ordem Aleatória
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        //Ordem natural(nome)
        Collections.sort(meusGatos);

        //Ordem idade
        meusGatos.sort(new ComparatorIdade());

        //Ordem cor
        meusGatos.sort(new ComparatorCor());

        //Ordem nome/cor/idade
        meusGatos.sort(new ComparatorNomeCorIdade());

        //Utilizando expressão lambda
        meusGatos.sort(Comparator.comparing((Gato gato) -> gato.getNome()));

        //Utilizando referência de método
        meusGatos.sort(Comparator.comparing(Gato::getNome));
    }
}
