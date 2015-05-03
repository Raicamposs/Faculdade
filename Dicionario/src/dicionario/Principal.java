/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicionario;

import javax.swing.JOptionPane;

/**
 *
 * @author Raiane Campos
 */
public class Principal {

    public static void main(String[] args) {

        Dicionario ABC = new Dicionario();

        int resposta, exit = 0;

        while (exit != 1) {

            String termo = "", significado = null, opcao;
            opcao = JOptionPane.showInputDialog(null, " Numero de palavras contidas no Dicionario: " + ABC.contGeral + "\nO que deseja fazer: \n"
                    + "1- Adicionar \n2- Pesquisar\n3- Listar \n4- Sair", "Dicionario", JOptionPane.PLAIN_MESSAGE);

            if (opcao == null) {
                System.exit(0);
            } else {
                switch (opcao) {

                    case "1":

                        while (termo == null || termo.equals("")) {
                            termo = JOptionPane.showInputDialog(null, "Qual termo deseja add ao dicionario?", "Inserindo...", JOptionPane.PLAIN_MESSAGE);
                            if (termo != null && termo.equals("")) {
                                JOptionPane.showMessageDialog(null, "Você não respondeu a pergunta.");
                            }
                            if (termo == null) {
                                System.exit(0);
                            }
                        }
                        resposta = JOptionPane.showConfirmDialog(null, "O Termo:  '" + termo + "' está correto?", "Selecione....", JOptionPane.YES_NO_CANCEL_OPTION);
                        if (resposta == JOptionPane.CANCEL_OPTION) {
                            System.exit(0);
                        } else if (resposta == JOptionPane.NO_OPTION) {
                            termo = JOptionPane.showInputDialog(null, "Qual o termo correto?", "Inserindo...", JOptionPane.PLAIN_MESSAGE);
                        }

                        while (significado == null || significado.equals("")) {
                            significado = JOptionPane.showInputDialog(null, "Qual significado do termo : " + termo + " ?", "Inserindo...", JOptionPane.PLAIN_MESSAGE);
                            if (significado != null && significado.equals("")) {
                                JOptionPane.showMessageDialog(null, "Você não respondeu a pergunta.");
                            }
                            if (termo == null) {
                                System.exit(0);
                            }
                        }

                        termo = termo.toUpperCase();
                        ABC.AddTermo(termo, significado);
                        break;

                    case "2":
                        termo = JOptionPane.showInputDialog(null, "O que está procurando?", "Pesquisando...", JOptionPane.PLAIN_MESSAGE);
                        if (termo == null) {
                            break;
                        } else {
                            termo = termo.toUpperCase();
                            ABC.Pesquisa(termo);
                            break;
                        }
                    case "3":
                        ABC.ordemAlfabetica();
                        break;

                    case "4":
                        exit = 1;
                        JOptionPane.showMessageDialog(null, " Até Logo!  ", "Finalizando....", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opção invalida!");

                }
            }

        }
    }
}
