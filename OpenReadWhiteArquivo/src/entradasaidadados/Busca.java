/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entradasaidadados;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;



/**
 *
 * @author Raiane Campos
 */
public class Busca {
       
     String texto = "";
    int total_vogais = 0, total_consoantes = 0, outros = 0, total_espacos = 0, total_palavras = 0, total_linhas = 0;
    String[] p;

    public void Varedura(String texto) {

        int T = texto.length();

        for (int i = 0; i < T; i++) {
            if (texto.charAt(i) == 'a' || texto.charAt(i) == 'e' || texto.charAt(i) == 'i' || texto.charAt(i) == 'o' || texto.charAt(i) == 'u') {
                total_vogais++;
            } else if (texto.charAt(i) > 'a' && texto.charAt(i) <= 'z') {
                total_consoantes++;
            } else if (texto.charAt(i) == ' ') {
                total_espacos++;

            } else {
                outros++;
            }

        }

    
            if (texto.split(" ") != null) {
                p = texto.split(" ");
                total_palavras = p.length-1;
            }

        
    }

    public void Escrever(String saida,String caminho) throws IOException {

        File file = new File(caminho);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(saida);
            writer.flush();
            writer.close();
        }
    }

    public void Ler(String caminho) throws IOException {

        try {
            FileReader arquivo = new FileReader(caminho);
            BufferedReader lerArquivo = new BufferedReader(arquivo);
            {
                String linha = lerArquivo.readLine();
            
                
                
                while (linha != null) {

                    texto = texto +" "+ linha;
                    linha = lerArquivo.readLine();
                    total_linhas++;
                   
                }
            }

            texto = texto.toLowerCase();
            arquivo.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Erro na abertura do arquivo! Endereço invalido!");
            System.exit(0);
        }

    }
}
