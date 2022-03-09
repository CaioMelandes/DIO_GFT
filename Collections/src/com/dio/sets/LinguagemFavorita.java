package com.dio.sets;

public class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    private String nome;
    private Integer anoCriaca;
    private String ide;

    public LinguagemFavorita(String nome, Integer anoCriaca, String ide) {
        this.nome = nome;
        this.anoCriaca = anoCriaca;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoCriaca() {
        return anoCriaca;
    }

    public void setAnoCriaca(Integer anoCriaca) {
        this.anoCriaca = anoCriaca;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", anoCriaca=" + anoCriaca +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinguagemFavorita o) {
        return this.getNome().compareToIgnoreCase(o.getNome());
    }
}
