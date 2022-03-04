package com.dio;

import javax.swing.*;
import java.io.*;

public class Checked {
    public static void main(String[] args) {
        String nomeArquivo = "Series.txt";

        try {
            imprimirArquivoConsole(nomeArquivo);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Revise o nome do arquivo!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro inesperado!");
        }
    }

    public static void imprimirArquivoConsole(String nomeArquivo) throws IOException {
        File file = new File(nomeArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String linha = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        } while (linha != null);

        bw.flush();
        br.close();
    }
}
