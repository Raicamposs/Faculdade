/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package torre.hanoi;

import javax.swing.JOptionPane;


/**
 *
 * @author Raiane 
 */
public class Pilha {
    
  
    No topo;
    No temp = topo;
    

    void empilha(int dado) {
        No novoNo = new No();
        novoNo.dado = dado;
        novoNo.proximo = topo;
        topo = novoNo;
    }

    boolean estaVazia() {
        return topo == null;
    }

    int desempilha() {
        if (estaVazia()) {
            return -1;
        }
        int dadoDesempilhado = topo.dado;
        topo = topo.proximo;
        return dadoDesempilhado;
    }

    int consulta() {
        if (estaVazia()) {
            return 0;
        }
        return topo.dado;
    }
    
    void mostra(){
        temp=topo;
       String mensagem = ""; 
        String tela = ""; 
        while(temp!=null){
            mensagem += temp.dado + "\n";
            tela=tela+mensagem;
          // JOptionPane.showMessageDialog (null, mensagem);
           temp = temp.proximo ;   
          
}
    JOptionPane.showMessageDialog (null, tela);    
  }
}