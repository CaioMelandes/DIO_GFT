package com.dio.listas;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas);

        //Exiba a posição da nota 5.0
        System.out.println(notas.indexOf(5.0));

        //Adicione na lista a nota 8.0 na posição 4
        notas.add(4,8.0);

        //Substitua a nota 5.0 pela nota 6.0
        notas.set(notas.indexOf(5.0), 6.0);

        //Confira se a nota 5.0 está na lista
        System.out.println(notas.contains(5.0));

        //Exiba todas as notas na ordem em que foram informadas
        for (double nota: notas) System.out.println(nota);

        //Exiba a terceira nota adicionada
        System.out.println(notas.get(2));

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

        //Remova a nota na posição 0
        notas.remove(0);

        //Remova as notas menores que 7.0 e exiba a lista
        notas.removeIf(n ->(n < 7.0));
        System.out.println(notas);

        //Apague toda a lista
        notas.clear();

        //Confira se a lista está vazia
        System.out.println(notas.isEmpty());
    }
}
