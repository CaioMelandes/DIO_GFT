package com.dio.mapas;

import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        //Dicionario em ordem aleatoria
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 lições pra o século 21", 432));
        }};
        for (Map.Entry<String, Livro> livro: meusLivros.entrySet()) {
            System.out.println(livro.getKey()+ '-' +livro.getValue().getNome());
        }

        //Ordem de inserção
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(meusLivros);
        for (Map.Entry<String, Livro> livro: meusLivros1.entrySet()) {
            System.out.println(livro.getKey()+ '-' +livro.getValue().getNome());
        }

        //Ordem alfabética dos autores
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros);
        for (Map.Entry<String, Livro> livro: meusLivros2.entrySet()) {
            System.out.println(livro.getKey()+ '-' +livro.getValue().getNome());
        }

        //Ordem alfabética dos livros
        Set<Map.Entry<String,Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro: meusLivros3) {
            System.out.println(livro.getKey()+ '-' +livro.getValue().getNome());
        }
    }
}
