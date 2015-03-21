/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conteudoRaiz;

import java.io.File;
import javax.swing.JOptionPane;



/**
 *
 * @author Raiane Campos
 */
public class Diretorio {
     
    public static void metodos(File Arquivo) {
        String arquivo = "", diretorio = "";

        File[] arquivos = Arquivo.listFiles();

        for (File file : arquivos) {
            if (file.isFile()) {
                arquivo = arquivo + "\n" + file;
            } else {
                diretorio = diretorio + "\n" + file;
            }
        }
        if ("".equals(arquivo)) {
            arquivo = "Nenhum Arquivo Encontrado";
        }
        if ("".equals(diretorio)) {
            diretorio = "Nenhum Diretorio Encontrado";
        }
        JOptionPane.showMessageDialog(null, "\nArquivos:" + arquivo);
        JOptionPane.showMessageDialog(null, "\nDiretorios:\n " + diretorio);

    }
}
    

