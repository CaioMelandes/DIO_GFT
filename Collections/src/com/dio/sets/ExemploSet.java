package com.dio.sets;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7.0, 8.5, 9.3, 5.0, 0.0, 3.6));
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7.0, 8.5, 9.3, 5.0, 0.0, 3.6));
        System.out.println(notas);

        //Confira se a nota 5.0 está na lista
        System.out.println(notas.contains(5.0));

        //Exiba todas as notas na ordem em que foram informadas
        for (double nota: notas) System.out.println(nota);

        //Exiba a menor nota
        System.out.println(Collections.min(notas));

        //Exiba a maior nota
        System.out.println(Collections.max(notas));

        //Exiba a soma dos valores
        Iterator<Double> iterator = notas.iterator();
        double soma = 0.0;

        while (iterator.hasNext()){
            Double proximo = iterator.next();
            soma += proximo;
        }
        System.out.println(soma);

        //Exiba a média dos valores
        System.out.println(soma / notas.size());

        //Remova a nota 0.0
        notas.remove(0.0);

        //Remova as notas menores que 7.0 e exiba a lista
        notas.removeIf(n ->(n < 7.0));
        System.out.println(notas);

        //Exiba todas as notas na ordem crescente
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        //Apague toda a lista
        notas.clear();

        //Confira se a lista está vazia
        System.out.println(notas.isEmpty());
    }
}
