/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dicionario;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JOptionPane;

/**
 * d) Escreva uma aplicação de dicionário com três funções: adicionar um termo
 * ao dicionário, procurar um termo no dicionário e listar todos os termos
 * existentes em ordem alfabética. Crie e manipule o dicionário apenas na
 * memória (não é necessário trabalhar com arquivos). Dica: aprenda a utilizar a
 * classe HashMap do Java, ela poderá ajudar!
 *
 * @author Raiane Campos
 */


public class Dicionario {


    HashMap Dicionario = new HashMap();
    Map<String, Float> map;
    int contGeral;
    ExercicioTermo termo = new ExercicioTermo();
    

    void AddTermo(String palavra, String significado) {
        termo.Allpalavras = palavra;
        termo.AllSignificados = significado;
        if (sameWord(termo.Allpalavras) == true) {
            Dicionario.put(termo.Allpalavras, termo.AllSignificados);
            JOptionPane.showMessageDialog(null, "Inserido!");
        } else {
            JOptionPane.showMessageDialog(null, "O termo já existe!");
        }
        contGeral++;
    }

    void Pesquisa(String texto) {
        if (Dicionario.containsKey(texto)) {
            JOptionPane.showMessageDialog(null, "Termo '" + texto + "' encontrado.\n\nSignificado: " + Dicionario.get(texto));
        } else {
            JOptionPane.showMessageDialog(null, "Termo não encontrado.");
        }
    }

    boolean sameWord(String palavra) {
        if (Dicionario.get(palavra) == null) {
            return true;
        }
        return false;
    }

    String lista="";
 

    void ordemAlfabetica() {
        Map<String, Float> map = new TreeMap<String, Float>(Dicionario);
       
        for(String key:map.keySet()){
        lista= lista +(key+" - "+map.get(key))+"\n";
        }
       JOptionPane.showMessageDialog(null,lista, "listando...", JOptionPane.PLAIN_MESSAGE);
       
    }

}
