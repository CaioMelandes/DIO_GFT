package me.dio.models;

public class Gerente extends FuncionarioPJ implements CalculaBonificacao{
    private Double valorBonificacao;

    public Gerente(String nome, String documento, Endereco endereco, Integer horasTrabalhadas, Double valorHora) {
        super(nome, documento, endereco, horasTrabalhadas, valorHora);
    }

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = (super.getValorRemuneracao() * (porcentagemBonificacao/100)) + 100d;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "Nome = " + nome +
                ", Documento = " + documento +
                ", Endereço = " + endereco.getRua() +
                ", Horas Trabalhadas = " + horasTrabalhadas +
                ", Valor da Hora = R$ " + valorHora +
                ", Remuneração = R$ " + valorRemuneracao +
                ", Bonificação = R$ " + valorBonificacao +
                '}';
    }
}
