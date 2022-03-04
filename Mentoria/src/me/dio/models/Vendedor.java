package me.dio.models;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao{
    private double valorBonificacao;

    public Vendedor(String nome, String documento, Double valorSalario, Endereco endereco) {
        super(nome, documento, valorSalario, endereco);
    }

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = this.valorSalario * (porcentagemBonificacao/100d);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "Nome = " + nome +
                ", Documento = " + documento +
                ", Endereço = " + endereco.getRua() +
                ", Salario = R$ " + valorSalario +
                ", Bonificação = " + valorBonificacao +
                '}';
    }
}
