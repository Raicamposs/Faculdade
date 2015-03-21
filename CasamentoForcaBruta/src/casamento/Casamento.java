/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casamento;

import javax.swing.JOptionPane;

/**
 *
 * @author Raiane Campos
 */
public class Casamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ForcaBruta Busca = new ForcaBruta();

        String texto, padrao;
        
        texto = "O Coisa (Benjamin Jacob Grimm) é um personagem de quadrinhos do universo Marvel, um dos fundadores do Quarteto Fantástico."
                + " Foi criado por Stan Lee e Jack Kirby. "
                + "Seu grito de guerra \"it's clobberin ' time!\""
                + " (que no Brasil foi traduzido como \"Tá na hora do pau!\") é um dos bordões mais conhecidos dos quadrinhos.";
        padrao = "um";
          
          
//        texto = JOptionPane.showInputDialog(null, "Qual o texto?");
//        padrao = JOptionPane.showInputDialog(null, "Qual o padão?");
       

        Busca.busca(texto, padrao);

    }

}
