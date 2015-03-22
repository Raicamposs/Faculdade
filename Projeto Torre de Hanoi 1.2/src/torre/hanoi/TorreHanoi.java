/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torre.hanoi;

import javax.swing.JOptionPane;

/**
 *
 * @author Raiane
 */
public class TorreHanoi {

    int totaldejogadas;

    // DEFINIR 3 VARIÁVEIS DO TIPO Pilha AQUI (pino1, pino2, pino3)
    Pilha pino1;
    Pilha pino2;
    Pilha pino3;

    // DEFINIR A VARIAVEL INTEIRA totalDiscos AQUI
    int totalDiscos() {
        return pino1.consulta() + pino2.consulta() + pino3.consulta();
        // Consulta de números de elementos presentes e retorna sua soma;
    }

    // void utilizado para efetuar a movimentaçao dos discos entre as pilhas
    void realizaJogada(Pilha pilhaOrigem, Pilha pilhaDestino) {

        if (pilhaOrigem != null && pilhaDestino != null) {
            // Verifica se a pilha foi iniciada 
            if (!pilhaOrigem.estaVazia() && pilhaOrigem.consulta() < pilhaDestino.consulta()) {
           // Verifica se a pilha de origem nao esta vazia e o pino que esta no destino e menor

                pilhaDestino.empilha(pilhaOrigem.topo.dado);
                pilhaOrigem.desempilha();
            // Com as condicoes validas ocorre a adiçao do valor na nova pilha e depois a remoçao da pilha anterior

            } else if (pilhaOrigem.estaVazia() == false && pilhaDestino.estaVazia()) {
             //Condição criada porque uma vez a pilha destino está vazia nunca terá valor maior que a origem;
                // Nesse caso pilha de origem não estaja vazia mas o destino sim, tambem é execultada a troca de valores

                pilhaDestino.empilha(pilhaOrigem.topo.dado);
                pilhaOrigem.desempilha();

            //OBS: A ordem dos comandos neste caso irá ter influência. Ao mudar a ordem, ambos os topos teriam o mesmo valor.
            } else {
                JOptionPane.showMessageDialog(null, "\nMovimento invalido!");
                // Caso as restrições sejam desrespeitadas exibe mensagem de alerta  
            }
        } else {
            JOptionPane.showMessageDialog(null, "\nUma ou mais das pilhas não foram iniciadas!");
            // Caso as pilhas nao sejam iniciadas exibe mensagem de alerta  
        }
    }

    boolean verificaJogo(Pilha pino1, Pilha pino2, Pilha pino3, int totalDiscos) {
        // Boolean verificaJogo é responsavel por verificar a condição que determina o fim do jogo.

        if (pino3.consulta() == totalDiscos()) {
            // Quando o total de discos n e igual ao numero de discos no pino3. retorna true. 
            JOptionPane.showMessageDialog(null, "Voce venceu! \nNumero de Movimentos:  " + totaldejogadas);
            // Exibe mensagem de fim de jogo e o numero de jogadas realizadas.
            return true;
        }
//         Caso contrario false
        return false;
    }

    void exibeJogo(Pilha pino1, Pilha pino2, Pilha pino3) {
      // Responsável por exibir os topos das pilhas.

        String topos = (pino1.consulta() + " " + pino2.consulta() + " " + pino3.consulta());
        JOptionPane.showMessageDialog(null, "Os topos são :\n" + "\n" + topos);

    }
}
