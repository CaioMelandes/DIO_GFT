package com.dio;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Chevrolet","Onix", "Preto",
                2018, 78, 54);

        Carro carroSonho = new Carro("Honda", "Civic", "Prata",
                2022, 203, 56);

        System.out.println(meuCarro.getMarca() + " " + meuCarro.getModelo());
        System.out.println("Tanque cheio do meu carro R$ " + meuCarro.valorTanqueCheio(6.75));
    }
}
