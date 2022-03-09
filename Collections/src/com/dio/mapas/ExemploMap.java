package com.dio.mapas;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        //Criação do map
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};

        //Substitua o consumo do gol para 15,2
        carrosPopulares.put("Gol",15.2);

        //Confira se tucson está no dicionário
        System.out.println(carrosPopulares.containsKey("Tucson"));

        //Exiba o consumo do uno
        System.out.println(carrosPopulares.get("Uno"));

        //Exiba os modelos
        System.out.println(carrosPopulares.keySet());

        //Exiba os consumos
        System.out.println(carrosPopulares.values());

        //Exiba o modelo mais economico e seu consumo
        double maisEconomico = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            if(entry.getValue().equals(maisEconomico)) System.out.println(entry.getKey()+ '-' +entry.getValue());
        }

        //Exiba o modelo menos economico e seu consumo
        double menosEconomico = Collections.min(carrosPopulares.values());

        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if (entry.getValue().equals(menosEconomico)) System.out.println(entry.getKey()+ '-' +entry.getValue());
        }

        //Exiba a soma dos consumos
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        double soma = 0.0;

        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        //Exiba a media
        System.out.println(soma/carrosPopulares.size());

        //Remova modelos com consumo igual 15.6
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();

        while (iterator.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }

        //Exiba os carros na ordem informada
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};

        System.out.println(carrosPopulares1);

        //Exiba os carros ordenados pelo modelo
        TreeMap<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2);

        //Apague o dicionario
        carrosPopulares.clear();

        //Confira se o dicionario está vazio
        System.out.println(carrosPopulares.isEmpty());
    }
}
