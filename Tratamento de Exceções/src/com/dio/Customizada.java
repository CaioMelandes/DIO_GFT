package com.dio;

import javax.swing.*;
import java.io.*;

public class Customizada {
    public static void main(String[] args) {
        String nomeArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido");

        imprimirArquivoConsole(nomeArquivo);
    }

    public static void imprimirArquivoConsole(String nomeArquivo) {
        try {
            BufferedReader br = lerAquivo(nomeArquivo);
            String linha = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            do {
                bw.write(linha);
                bw.newLine();
                linha = br.readLine();
            } while (linha != null);
            bw.flush();
            br.close();
        } catch (ImpossivelAberturaArquivoException e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage());
        } catch (IOException ex){
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro não esperado.");
        }
    }

    public static BufferedReader lerAquivo(String nomeArquivo) throws ImpossivelAberturaArquivoException {
        File file = new File(nomeArquivo);
        try {
            return new BufferedReader(new FileReader(nomeArquivo));
        } catch (FileNotFoundException ex) {
            throw new ImpossivelAberturaArquivoException(file.getName(), file.getPath());
        }
    }
}

class ImpossivelAberturaArquivoException extends Exception{
    private final String  nomeArquivo;
    private final String diretorio;

    public ImpossivelAberturaArquivoException(String nomeArquivo, String diretorio) {
        super("Arquivo " + nomeArquivo + " não foi encontrado no diretório " + diretorio);
        this.nomeArquivo = nomeArquivo;
        this.diretorio = diretorio;
    }

    @Override
    public String toString() {
        return "ImpossivelAberturaArquivoException{" +
                "nomeArquivo='" + nomeArquivo + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    }
}
