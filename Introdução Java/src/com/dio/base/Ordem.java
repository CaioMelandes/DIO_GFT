package com.dio.base;

/**
 * @author Caio Melandes
 * @version 1.0.0
 * @since Release 1.0.0
 */

public class Ordem {

    private final String codigo;
    private final int valorTotal;

    /**
     * Construtor da classe
     *
     * @param codigo        Código do pedido
     * @param valorTotal    Valor total do pedido
     */
    public Ordem(String codigo, int valorTotal){
        this.codigo = codigo;
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Ordem{codigo='" + codigo + "', valorTotal=" +valorTotal+ "}";
    }

    /**
     * Calcula a taxa do valor total, caso ele seja maior ou igual a 100
     *
     * @return Valor total do pedido com as taxas calculadas
     * @throws RuntimeException Se o valor do pedido for negativo
     */
    public double calcularTaxa() throws RuntimeException{
        if (this.valorTotal < 0){
            throw new RuntimeException("Valor do pedido não pode ser negativo");
        }

        if (valorTotal >= 100) {
            return this.valorTotal * 0.99;
        } else {
            return this.valorTotal;
        }
    }
}
