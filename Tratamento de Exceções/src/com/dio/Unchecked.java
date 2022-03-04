package com.dio;


import javax.swing.*;

public class Unchecked {
    public static void main(String[] args) {
        boolean loop = true;

        do {
            String a = JOptionPane.showInputDialog("Numerador");
            String b = JOptionPane.showInputDialog("Denominador");

            try {
                double resultado = dividir(Double.parseDouble(a), Double.parseDouble(b));
                System.out.println("Resultado: " + resultado);
                loop = false;
            } catch (NumberFormatException e) {
                //e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Entrada inválida, " +
                        "informe um número inteiro!");
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Denominador não pode ser 0!");
            }
        } while (loop);
    }

    public static double dividir(double a, double b){
        return a/b;
    }
}
