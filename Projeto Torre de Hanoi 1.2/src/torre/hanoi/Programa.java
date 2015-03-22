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
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // inicia variavel totaldejogadas
        JOptionPane.showMessageDialog(null, "Torres de Hanói\n"
                + "\n"
                + "O objetivo do jogo é mover todos os discos do pino 1 para o pino 3, \nsempre obedecendo à restrição de não colocar um disco sobre outro menor.");

        // Pedir para usuário digitar o número de discos e atribuir esse numero para uma variável
        String discos = "";
        while (discos.equals("")) {
            discos = JOptionPane.showInputDialog("Insira o número de discos desejado:");
            if (discos == null) {
                System.exit(0);
            }
            if (discos.equals("")) {
                JOptionPane.showMessageDialog(null, "Voce não respondeu a pergunta! ");
            }
        }

        //A variavel discos recebe o número de discos solicitado ao usuário para iniciar o jogo;
        int n = Integer.parseInt(discos);
        //A variavel n recebe o valor convertido de String para inteiro;

        if (n >= 2) {
            //Condiçao que impede do jogo iniciar com menos de 2 discos;

            // criar uma variável TorreHanoi chamada torre
            TorreHanoi torre = new TorreHanoi();

            // inicializar os pinos da variável torre (ex.: torre.pino1 = new Pilha();)
            torre.pino1 = new Pilha();
            torre.pino2 = new Pilha();
            torre.pino3 = new Pilha();
            //Variaveis criadas para inicialização;

            // preencher torre.pino1 com os discos (usando laço de repetição)
            for (int x = n; x > 0; x--) {
                torre.pino1.empilha(x);
                //Código responsável pelo preenchimento da primeira torre! De acordo com a variavel n  inserida pelo usuário;
            }

            JOptionPane.showMessageDialog(null, "\nJogo Iniciado!");
            //Aviso de inicialização do jogo! 

            torre.exibeJogo(torre.pino1, torre.pino2, torre.pino3);
            //importa o void presente "ClassTorrHanoi" e exibi como estão os topos das pilhas, uma vez vazia retorna "0";
            //O tamanho dos discos serão representados pelos números de forma crescente. 
            //E continua de acordo com a quantidade de discos escolhidos;

                ///testar as funções executando manualmente o jogo de acordo com uma quantidade de discos 
            //usando as funções da torre (ex.: torre.realizaJogada(torre.pino1, torre.pino2))
            String pinicial;
            String pfinal;
            String pergunta="";
            int resposta = 1;
            //declaracao do tipo de variavel

            while (torre.verificaJogo(torre.pino1, torre.pino2, torre.pino3, n) == false && resposta != 0) {
                    //Mantem um looping enquanto torre.verificaJogo != true e a variavel resposta for diferente de 0;
                while (pergunta.equals("")) {
                    pergunta = JOptionPane.showInputDialog("Deseja sair:\n1 - Continuar jogando \n0 - Sair do jogo");
                    //A variavel pergunta recebe o dado solicitado ao usuario
                    if (pergunta == null) {
                        System.exit(0);
                    }
                    if (pergunta.equals("")) {
                        JOptionPane.showMessageDialog(null, "Voce não respondeu a pergunta! ");
                    }
                }

                resposta = Integer.parseInt(pergunta);
                //A variavel resposta recebe o valor convertido de String para inteiro;

                if (resposta == 0) {
                    JOptionPane.showMessageDialog(null, "Voce desistiu! \nQue pena!  ");
                } else {

                    pinicial = JOptionPane.showInputDialog("Digite a posiçao de origem do disco:");
                    if (pinicial == null) {
                        System.exit(0);
                    }
                    pfinal = JOptionPane.showInputDialog("Digite a posiçao de destino do disco:");
                    if (pfinal == null) {
                        System.exit(0);
                    }
                    //As variaveis pinicial e pfinal recebem Posição de origem/inicio e destino/final respectivamente;

                    if (pinicial.equals("") || pfinal.equals("")) {
                        JOptionPane.showMessageDialog(null, "Você não respondeu a uma das perguntas.");
                        //Condiçao que impede o usuario de nao atribuir valor as variaveis pinicial e pfinal;

                    } else {
                        // Apos atribuir :
                        int posicaofinal = Integer.parseInt(pfinal);
                        int posicaoinicial = Integer.parseInt(pinicial);
                    //A variavel posicaoinicial e posicaofinal recebem os valor convertidos de String para inteiro;

                        //Inicio do ciclo de Comparações para realizar preenchimento do  void realizaJogada da classTorreHanoi;    
                        if (posicaoinicial == 1 && posicaofinal == 2) {
                            torre.realizaJogada(torre.pino1, torre.pino2);
                        } else if (posicaoinicial == 1 && posicaofinal == 3) {
                            torre.realizaJogada(torre.pino1, torre.pino3);
                        } else if (posicaoinicial == 2 && posicaofinal == 1) {
                            torre.realizaJogada(torre.pino2, torre.pino1);
                        } else if (posicaoinicial == 2 && posicaofinal == 3) {
                            torre.realizaJogada(torre.pino2, torre.pino3);
                        } else if (posicaoinicial == 3 && posicaofinal == 2) {
                            torre.realizaJogada(torre.pino3, torre.pino2);
                        } else if (posicaoinicial == 3 && posicaofinal == 1) {
                            torre.realizaJogada(torre.pino3, torre.pino1);
                        } else {
                            JOptionPane.showMessageDialog(null, "\nA posiçao selecionada é invalida! ");
                            //Uma vez que as posiçoes escolhidas inflijam as regras do jogo emitida mensagem de restrição;
                        }

                        torre.totaldejogadas = torre.totaldejogadas + 1;
                    // ponteiro criado para monitorar o numero de movimentos realizados durante o jogo;

                            // exibir os pinos no final para mostrar o resultado
                        // O void mostra() pecorre as pilhas e exibe seus elementos;
                        JOptionPane.showMessageDialog(null, "O pino 1 esta assim:  ");
                        torre.pino1.mostra();
                        JOptionPane.showMessageDialog(null, "O pino 2 esta assim:  ");
                        torre.pino2.mostra();
                        JOptionPane.showMessageDialog(null, "O pino 3 esta assim:  ");
                        torre.pino3.mostra();

                        // O void exibeJogo() exibe os topos das pilhas simultaneamente quando vazio exibe 0;
                        torre.exibeJogo(torre.pino1, torre.pino2, torre.pino3);

                        // apos realizar as jogadas chamar a função verificaJogo que deverá retornar true ao final
                        torre.verificaJogo(torre.pino1, torre.pino2, torre.pino3, posicaofinal);
                        //Faz uma verificação caso retorne true o looping se encerra  ;

                    }

                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Quantidade de discos invalida!");
            // Condição contrária ao if inicial que exibe mensagem de alerta quando o valor de n < 2. Fecha o programa.
        }
    }
}

