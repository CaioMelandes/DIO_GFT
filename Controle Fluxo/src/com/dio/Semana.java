package com.dio;

public class Semana {
    public static void diaSemana(String dia){
        switch (dia) {
            case "Domingo" -> System.out.println(1);
            case "Segunda" -> System.out.println(2);
            case "Terça" -> System.out.println(3);
            case "Quarta" -> System.out.println(4);
            case "Quinta" -> System.out.println(5);
            case "Sexta" -> System.out.println(6);
            case "Sábado" -> System.out.println(7);
        }
    }
}
