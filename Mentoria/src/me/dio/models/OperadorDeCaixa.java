package me.dio.models;

public class OperadorDeCaixa extends FuncionarioCLT{
    public OperadorDeCaixa(String nome, String documento, Double valorSalario, Endereco endereco) {
        super(nome, documento, valorSalario, endereco);
    }

    @Override
    public String toString() {
        return "Operador de Caixa{" +
                "Nome = " + nome +
                ", Documento = " + documento +
                ", Endereço = " + endereco.getRua() +
                ", Salario = R$ " + valorSalario +
                '}';
    }
}
