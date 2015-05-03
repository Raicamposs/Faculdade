/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConversaoDigitos;

import javax.swing.JOptionPane;

/**
 * Obter um numeral e retorno-lo por extenso
 * @author Raiane Campos
 */
public class Executavel {

    public static void main(String[] args) {

        NumerosExtenso Numero = new NumerosExtenso();
        String valor = JOptionPane.showInputDialog(null, "Determine um numero de ate 9 digitos:");
        if (valor == null) {
            System.exit(0);
        } else {
            Numero.Exibe(valor, Numero.Digitos(valor));
        }

    }
}
