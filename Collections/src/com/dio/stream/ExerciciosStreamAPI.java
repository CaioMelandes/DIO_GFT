package com.dio.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("3","5","3","9","7","1","4");

        //Imprimir os elementos da lista
        numerosAleatorios.forEach(System.out::println);

        //Colocar os 5 primeiros elementos e colocar num Set
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        //Transforme a lista de strings em inteiros
        List<Integer> integers = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .toList();

        //Pegue os números pares maiores que 2 e coloque numa lista
        List<Integer> inteirosPares = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2))
                .toList();

        //Mostre a media dos numeros
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        //Remova os valore impares
        integers.removeIf(i -> (i % 2 != 0));
    }
}
