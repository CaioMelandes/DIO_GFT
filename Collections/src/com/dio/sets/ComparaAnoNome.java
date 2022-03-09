package com.dio.sets;

import java.util.Comparator;

public class ComparaAnoNome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int ano = Integer.compare(o1.getAnoCriaca(), o2.getAnoCriaca());
        if (ano != 0) return ano;

        return o1.getNome().compareToIgnoreCase(o2.getNome());
    }
}
