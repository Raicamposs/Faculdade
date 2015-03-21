/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conteudoRaiz;

import java.io.File;
import javax.swing.JOptionPane;

/**
 * Crie um programa que liste o conteúdo da raiz do seu disco (ou um diretório
 * qualquer, caso você não tenha acesso à raiz) e informe, para cada item, se é
 * um arquivo ou se é um diretório.
 *
 * @author Raiane Campos
 */
public class ConteudoRaiz {

    public static void main(String[] args) {

        String caminho = "";

        while (caminho == null || caminho.equals("")) {
            caminho = JOptionPane.showInputDialog("Entre com um endereço válido de diretório:");
            if (caminho == null) {
                System.exit(0);
            }

        }

        if (caminho != null) {

            File arquivo = new File(caminho);

            if (arquivo.exists()) {
                if (arquivo.isFile()) {
                    JOptionPane.showMessageDialog(null, "O caminho especificado é um arquivo.");
                    int resposta = JOptionPane.showConfirmDialog(null, "Gostaria de fazer a Verificação na pasta raiz deste aquivo?");
                    if (resposta == JOptionPane.YES_OPTION) {
                        caminho = arquivo.getParent();
                        File paiArquivo = new File(caminho);
                        Diretorio.metodos(paiArquivo);
                    }
                    if (resposta == JOptionPane.NO_OPTION || resposta == JOptionPane.CANCEL_OPTION) {
                        System.exit(0);
                    }

                } else {
                    Diretorio.metodos(arquivo);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Endereço errado!");
            }
        } else {
            System.exit(0);
        }
    }
}
