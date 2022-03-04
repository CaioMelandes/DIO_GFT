package me.dio;

import me.dio.models.Endereco;
import me.dio.models.Gerente;
import me.dio.models.OperadorDeCaixa;
import me.dio.models.Vendedor;

public class Main {
    public static void main(String[] args) {

        Endereco enderecoVendedor = new Endereco("Rua do vendedor",
                "Complemento do vendedor","Bairro do vendedor");

        Vendedor vendedor = new Vendedor("Paulo","678.374.324-39",
                1500.00, enderecoVendedor);
        vendedor.calculaBonificacao(3d);

        System.out.println(vendedor);
        System.out.println("*******");

        Endereco enderecoGerente = new Endereco("Rua do gerente",
                "Complemento do gerente","Bairro do gerente");

        Gerente gerente = new Gerente("Valéria", "348.987.213-54",
                enderecoGerente, 38, 89.00);
        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3d);

        System.out.println(gerente);
        System.out.println("*******");

        Endereco enderecoOperadorCaixa = new Endereco("Rua do Operador de caixa",
                "Complemento do Operador de caixa","Bairro do Operador de caixa");

        OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("César", "138.651.320-00",
                1200.00, enderecoOperadorCaixa);

        System.out.println(operadorDeCaixa);
        System.out.println("*******");
    }
}
