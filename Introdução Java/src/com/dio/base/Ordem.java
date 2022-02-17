package com.dio.base;

public class Ordem {

    private final String code;

    public Ordem(String code){
        this.code = code;
    }

    @Override
    public String toString() {
        return "Ordem{code='" +code+ "'}";
    }
}
