package com.dio.exercicio3;

public class Teste3 {
    public static void main(String[] args) {
            double areaQuadrado = Quadrilatero.area(2);
            System.out.println("Área do quadrado: " +areaQuadrado+ '\n');

            double areaRetangulo = Quadrilatero.area(5d,3d);
            System.out.println("Área do retângulo: " +areaRetangulo+ '\n');
            
            double areaTrapezio = Quadrilatero.area(2,10,4);
            System.out.println("Área do trapézio: " +areaTrapezio+ '\n');
            
            double areaLosango = Quadrilatero.area(7f,3f);
            System.out.println("Área do losango: " +areaLosango+ '\n');
    }
}
