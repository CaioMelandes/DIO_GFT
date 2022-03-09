package com.dio.sets;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio2 {
    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagens = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Python",1990, "PyCharm"));
            add(new LinguagemFavorita("Java", 1991, "Intellij"));
            add(new LinguagemFavorita("Ruby", 1993, "RubyMine"));
        }};

        //Ordem Inserção
        System.out.println(linguagens);

        //Ordem Natural (nome)
        TreeSet<LinguagemFavorita> linguagens2 = new TreeSet<>(linguagens);
        System.out.println(linguagens2);

        //IDE


        //Ano de Criação e nome


        //Nome, ano de criação e IDE
    }
}
