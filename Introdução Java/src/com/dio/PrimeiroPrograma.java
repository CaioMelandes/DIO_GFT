package com.dio;

import com.dio.base.Ordem;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        Ordem ordem = new Ordem("code1234", 99);
        double valorFinal = ordem.calcularTaxa();
        System.out.println(ordem);
        System.out.println(valorFinal);
    }
}
