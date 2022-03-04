package me.dio.models;

public abstract class FuncionarioPJ {
    protected String nome;
    protected String documento;
    protected Endereco endereco;
    protected Integer horasTrabalhadas;
    protected Double valorHora;
    protected Double valorRemuneracao;

    public FuncionarioPJ() {
    }

    public FuncionarioPJ(String nome, String documento, Endereco endereco, Integer horasTrabalhadas, Double valorHora) {
        this.nome = nome;
        this.documento = documento;
        this.endereco = endereco;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getValorRemuneracao() {
        return valorRemuneracao;
    }

    public void setValorRemuneracao(Double valorRemuneracao) {
        this.valorRemuneracao = valorRemuneracao;
    }

    public void calculaRemuneracao(){
        this.valorRemuneracao = this.valorHora * this.horasTrabalhadas;
    }

}
