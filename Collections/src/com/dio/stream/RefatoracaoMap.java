package com.dio.stream;

import java.util.*;
import java.util.function.Function;

public class RefatoracaoMap {
    public static void main(String[] args) {
        //Ordem aleatória
        Map<Integer, Contato> agenda = new HashMap<>(){{
            put(1, new Contato("Caio", 315843));
            put(4, new Contato("Catherine", 687315));
            put(3, new Contato("Leona", 154227));
        }};
        
        for (Map.Entry<Integer,Contato> entry: agenda.entrySet()) {
            System.out.println(entry.getKey()+ " - " +entry.getValue().getNome());
        }

        //Ordem de inserção
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>(){{
            put(1, new Contato("Caio", 315843));
            put(4, new Contato("Catherine", 687315));
            put(3, new Contato("Leona", 154227));
        }};

        for (Map.Entry<Integer,Contato> entry: agenda1.entrySet()) {
            System.out.println(entry.getKey()+ " - " +entry.getValue().getNome());
        }

        //Ordem id
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);

        for (Map.Entry<Integer,Contato> entry: agenda2.entrySet()) {
            System.out.println(entry.getKey()+ " - " +entry.getValue().getNome());
        }

        //Ordem por número de telefone com classe anônima
        Set<Map.Entry<Integer,Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> o1, Map.Entry<Integer, Contato> o2) {
                return Integer.compare(o1.getValue().getNumero(), o2.getValue().getNumero());
            }
        });
        set.addAll(agenda.entrySet());

        //Ordem por número de telefone com interface funcional
        Set<Map.Entry<Integer,Contato>> set1 = new TreeSet<>(Comparator.comparing(
                new Function<Map.Entry<Integer, Contato>, Integer>() {
                    @Override
                    public Integer apply(Map.Entry<Integer, Contato> cont) {
                        return cont.getValue().getNumero();
                    }
                }
        ));
        set1.addAll(agenda.entrySet());

        //Ordem por número de telefone com função lambda
        Set<Map.Entry<Integer,Contato>> set2 = new TreeSet<>(Comparator.comparing(
               cont -> cont.getValue().getNumero()));
        set2.addAll(agenda.entrySet());

        //Ordem por número de telefone com reference method
    }
}
