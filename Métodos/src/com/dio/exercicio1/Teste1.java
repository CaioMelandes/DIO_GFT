package com.dio.exercicio1;

public class Teste1 {
    public static void main(String[] args) {

        System.out.println("Primeira proposta:");
        Calculadora.soma(8,6);
        Calculadora.subtracao(21,5);
        Calculadora.multiplicacao(17,2);
        Calculadora.divisao(9,-3);

        System.out.println("\nSegunda proposta:");
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(23);

        System.out.println("\nTerceira proposta:");
        Emprestimo.calcularValorFinal(10000.00f, 4);
    }
}
