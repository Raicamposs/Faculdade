/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

//c)Escreva um programa que receba por meio de um JOptionPane um nome de arquivo e 
//uma sequência de palavras, em seguida informe se o arquivo existe ou não, caso 
//não exista, crie-o e, por fim, escreva neste arquivo a sequência de palavras passadas como argumentos.
/**
 *
 * @author Raiane Campos
 */
public class Arquivo {

    public static void main(String[] args) throws IOException {

        boolean exit = false;

        while (!exit) {

            FileWriter x;

            String endereço = "", nome = "", caminho = "", caminhoConcatena = "", mensagem = "";

            while (endereço == null || endereço.equals("") || nome == null || nome.equals("")) {
                endereço = JOptionPane.showInputDialog("Qual o endereço da pasta raiz do arquivo?");
                if (endereço == null) {
                    System.exit(0);
                } else {
                    nome = JOptionPane.showInputDialog("Qual o nome do Arquivo ?");
                    if (nome == null) {
                        System.exit(0);
                    }
                }
                if (endereço.equals("") || nome.equals("")) {
                    JOptionPane.showMessageDialog(null, " Voce deixou um campo importante em branco.Preencha todos os campos!");
                }
            }

            caminhoConcatena = ("" + endereço + nome + ".txt");
            caminho = caminhoConcatena;
            mensagem = " " + JOptionPane.showInputDialog("O que deseja escrever neste arquivo ?");

            if (mensagem == null) {
                System.exit(0);
            } else {

                File arquivo = new File(caminho);

                boolean existe = arquivo.exists();

                if (!existe) {
                    new File(caminho).createNewFile();

                    x = new FileWriter(caminho, false);
                    x.write(mensagem);
                    x.close();

                    JOptionPane.showMessageDialog(null, "Seu arquivo foi criado com sucesso!");

                    System.exit(0);

                }
                if (existe == true || !caminho.equals("")) {

                    int resposta = JOptionPane.showConfirmDialog(null, "Já há um arquivo " + nome + ".txt ! Você deseja substituir este arquivo? "
                            + "\nSim: Substituir o arquivo."
                            + "\nNão: Adicionar as palavras ao arquivo. "
                            + "\nCancelar: Não efetuar mudanças. ");

                    if (resposta == JOptionPane.YES_OPTION) {
                        x = new FileWriter(caminho, false);

                        x.write(mensagem);
                        x.close();
                        JOptionPane.showMessageDialog(null, "Seu arquivo foi substituido com sucesso!");
                        exit = true;
                    }
                    if (resposta == JOptionPane.NO_OPTION) {
                        x = new FileWriter(caminho, true);

                        x.write(mensagem);
                        x.close();
                        JOptionPane.showMessageDialog(null, "Seu arquivo foi alterado com sucesso!");
                        exit = true;
                    }
                    if (resposta == JOptionPane.CANCEL_OPTION) {
                        resposta = JOptionPane.showConfirmDialog(null, "Deseja tentar novamente?");

                        if (resposta == JOptionPane.YES_OPTION) {
                            exit = false;
                        }
                        if (resposta == JOptionPane.NO_OPTION || resposta == JOptionPane.CANCEL_OPTION) {
                            System.exit(0);
                        }

                    }
                }
            }
        }
    }
}
