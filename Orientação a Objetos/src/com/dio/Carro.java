package com.dio;

public class Carro extends Veiculo{
    private String marca, modelo, cor;
    private int anoLancamento, potencia, capacidadeTanque;

    Carro(String marca, String modelo, String cor, int anoLancamento, int potencia, int capacidadeTanque){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.anoLancamento = anoLancamento;
        this.potencia = potencia;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double valorTanqueCheio(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }
}
