/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vendasfiliais;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;





/**
 *
 * @author Raiane Campos
 */
public class Busca {
 
    String  linha,paragrafo;
    String vendas1 = "", vendas2 = "", vendas3 = "", vendas4 = "";
    
    double soma1 = 0, soma2 = 0, soma3 = 0, soma4 = 0, media1, media2, media3, media4;
    int v1, v2, v3, v4;

    public void separa(String texto) {

        int t = texto.length();
        String[] p = new String[t];

        for (int i = 0; i < t; i++) {
            p =texto.split(" ");
           
        }
        for (int i = 0; i < p.length; i++) {

            String k = p[i];
            String e = k.substring(0, 1);
            

                if (e.equals("1")) {
                    vendas1 = k.substring(2);
                    soma1 = soma1 + Double.parseDouble(vendas1);
                    v1++;
                }
//
                if ("2".equals(e)) {
                    vendas2 = k.substring(2);
                    soma2 = soma2 + Double.parseDouble(vendas2);
                    v2++;
                }

                if ("3".equals(e)) {
                    vendas3 = k.substring(2);
                    soma3 = soma3 + Double.parseDouble(vendas3);
                    v3++;
                }

                if ("4".equals(e)) {
                    vendas4 = k.substring(2);
                    soma4 = soma4 + Double.parseDouble(vendas4);
                    v4++;
                }
            }

        
        media1 = soma1 / v1;
        media2 = soma2 / v2;
        media3 = soma3 / v3;
        media4 = soma4 / v4;

    }

    public void endereco(String caminho) {
        
        try (FileReader arquivo = new FileReader(caminho)) {
            BufferedReader lerArquivo = new BufferedReader(arquivo);
            linha = lerArquivo.readLine() ;
                    paragrafo = linha ;
            
            while (linha != null) {
                paragrafo = paragrafo + " " + linha;
                linha = lerArquivo.readLine();
            } 
            
        } 
        catch (IOException endereco) {
            JOptionPane.showMessageDialog(null, "Erro na abertura do arquivo! ");
        System.exit(0);
        } 
    }
}


