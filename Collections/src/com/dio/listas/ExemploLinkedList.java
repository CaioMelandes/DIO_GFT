package com.dio.listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExemploLinkedList {
    public static void main(String[] args) {
        //Crie uma LinkedList chamada notas2 e passa todos os elementos da ArrayList
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        LinkedList<Double> notas2 = new LinkedList<>(notas);

        //Mostre a primeira nota da nova lista sem removê-la
        System.out.println(notas2.getFirst());

        //Mostre a primeira nota da nova lista removendo-a
        System.out.println(notas2.pop());
    }
}
