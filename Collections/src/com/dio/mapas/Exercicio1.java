package com.dio.mapas;

import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {
        Map<String, Integer> pouplacaoNordeste = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        //Substitua a população de RN
        pouplacaoNordeste.put("RN", 3534165);

        //Confira se PB está no dicionário, caso não adicione PB - 4039277
        if(!(pouplacaoNordeste.containsKey("PB"))){
            pouplacaoNordeste.put("PB",4039277);
        }

        //Informe a população de PE
        System.out.println(pouplacaoNordeste.get("PE"));

        //Exiba todos os estados e suas populações na ordem em que foram informados
        System.out.println(pouplacaoNordeste);

        //Exiba os estados e suas populações em ordem alfabética
        Map<String, Integer> pouplacaoNordeste1 = new TreeMap<>(pouplacaoNordeste);
        System.out.println(pouplacaoNordeste1);

        //Exiba o estado com o menor população e sua quantidade
        double menorPopulacao = Collections.min(pouplacaoNordeste.values());

        for (Map.Entry<String, Integer> entry : pouplacaoNordeste.entrySet()) {
            if (entry.getValue() == menorPopulacao) System.out.println(entry.getKey()+ '-' +entry.getValue());
        }

        //Exiba o estado com a maior população e sua quantidade
        double maiorPopulacao = Collections.max(pouplacaoNordeste.values());

        for (Map.Entry<String, Integer> entry : pouplacaoNordeste.entrySet()) {
            if (entry.getValue() == maiorPopulacao) System.out.println(entry.getKey()+ '-' +entry.getValue());
        }

        //Exiba a soma da população desses estados
        Iterator<Integer> iterator = pouplacaoNordeste.values().iterator();
        double soma = 0;

        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        //Exiba a média da população deste dicionário de estados
        System.out.println(soma/pouplacaoNordeste.size());

        //Remova os estados com a população menor que 4.000.000
        Iterator<Integer> iterator1 = pouplacaoNordeste.values().iterator();

        while (iterator.hasNext()){
            if(iterator1.next() < 4000000) iterator1.remove();
        }

        //Apague o dicionário de estados
        pouplacaoNordeste.clear();

        //Confira se o dicionário está vazio.
        pouplacaoNordeste.isEmpty();
    }
}
