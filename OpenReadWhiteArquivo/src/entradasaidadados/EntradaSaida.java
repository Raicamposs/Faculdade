/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entradasaidadados;


import java.io.FileNotFoundException;

import java.io.IOException;
import javax.swing.JOptionPane;


public class EntradaSaida {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        Busca busca = new Busca();
        
        String endereço = "", nome ="", caminhoEntrada="", caminhoEntradaConcatena = "",caminhoSaida="", texto = "";
        
        //String caminho = "C:/PastaRaiz/Entrada.txt";
  
    while (endereço == null || endereço.equals("") || nome == null || nome.equals("")) {
        endereço = JOptionPane.showInputDialog("Qual o endereço da pasta raiz do arquivo?");
        if (endereço == null) {
            System.exit(0);
        } else {
            nome = JOptionPane.showInputDialog("Qual o nome do Arquivo ?");
            if (nome == null) {
                System.exit(0);
            }
            } if (endereço.equals("")|| nome.equals("")){
            JOptionPane.showMessageDialog(null, " Voce deixou um campo importante em branco.Preencha todos os campos!");
        }
    }
    
    caminhoEntradaConcatena = ("" + endereço + nome + ".txt");
    caminhoSaida = ("" + endereço + "Saida.txt");
    caminhoEntrada = caminhoEntradaConcatena;
   
        
        
        
        busca.Ler(caminhoEntrada);

        busca.Varedura(busca.texto);
        
        texto = ("Total de Caracteres = " + (busca.texto.length() - busca.total_espacos)
                + "\nTotal de consoantes = " + busca.total_consoantes
                + "\nTotal de vogais = " + busca.total_vogais
                + "\nTotal de Numeros e Simbolos = " + busca.outros
                + "\nTotal de espaços em branco = " + busca.total_espacos
                + "\nTotal de palavras = " + busca.total_palavras
                + "\nTotal de linha = " + busca.total_linhas);
         
        JOptionPane.showMessageDialog(null,texto);
       

        busca.Escrever(texto,caminhoSaida);
    }
}

      

           
    

