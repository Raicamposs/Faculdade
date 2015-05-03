import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import jfilechooserdemo.resources.JFileChooserDemo;

public class InterfaceSelecao {

    String opcao = "";
    AlgoritmosOrdenacao ExecutaOrdenacao = new AlgoritmosOrdenacao();
    double[][] matriz = new double[3][3];
    private String[] args;
    GraficoComparacaoOrdenacao chart;

    void SelecaoArquivos(ArrayList DadosArquivo1, ArrayList DadosArquivo2, ArrayList DadosArquivo3) throws IOException, InterruptedException {
        String ArquivoNome = "";
        int sair = 0;
        while (sair == 0) {
            String resposta = JOptionPane.showInputDialog(null, "Em Qual Arquivo Você Gostaria de Executar a Ordenação? \n\n"
                    + "1- Arquivo1\n"
                    + "2- Arquivo2\n"
                    + "3- Arquivo3\n"
                    + "4-Selecionar Todos e Executar Todas as Ordenações em Forma Crescente \n"
                    + "5-Selecionar Todos e Executar Todas as Ordenações em Forma Decrescente\n"
                    + "6-Buscar e Visualizar Aquivos"
                    + "\n\n", "Menu", JOptionPane.PLAIN_MESSAGE);

            if (resposta == null) {

                JOptionPane.showMessageDialog(null, " Até Logo!  ", "Finalizando....", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);

            } else {
                switch (resposta) {
                    case "1":
                        SelecaoOrdenacao("Arquivo1-", DadosArquivo1);
                        sair = 1;
                        break;

                    case "2":
                        SelecaoOrdenacao("Arquivo2-", DadosArquivo2);
                        sair = 1;
                        break;

                    case "3":
                        SelecaoOrdenacao("Arquivo3-", DadosArquivo3);
                        sair = 1;
                        break;

                    case "4":

                        for (int i = 0; i < 3; i++) {
                            ArrayList ArquivoClone1 = null, ArquivoClone2 = null, ArquivoClone3 = null;

                            if (i == 0) {
                                ArquivoClone1 = (ArrayList) DadosArquivo1.clone();
                                ArquivoClone2 = (ArrayList) DadosArquivo1.clone();
                                ArquivoClone3 = (ArrayList) DadosArquivo1.clone();
                                ArquivoNome = "Arquivo1";
                                JOptionPane.showMessageDialog(null, "Iniciando ordenações no Arquivo1");
                            }
                            if (i == 1) {
                                ArquivoClone1 = (ArrayList) DadosArquivo2.clone();
                                ArquivoClone2 = (ArrayList) DadosArquivo2.clone();
                                ArquivoClone3 = (ArrayList) DadosArquivo2.clone();
                                ArquivoNome = "Arquivo2";
                                JOptionPane.showMessageDialog(null, "Iniciando ordenações no Arquivo2");
                            }
                            if (i == 2) {
                                ArquivoClone1 = (ArrayList) DadosArquivo3.clone();
                                ArquivoClone2 = (ArrayList) DadosArquivo3.clone();
                                ArquivoClone3 = (ArrayList) DadosArquivo3.clone();
                                ArquivoNome = "Arquivo3";
                                JOptionPane.showMessageDialog(null, "Iniciando ordenações no Arquivo3");
                            }

                            ExecutaOrdenacao.BolhaCrescente((ArquivoNome + "OrdenadoCrescente-Bolha.txt"), ArquivoClone1);
                            matriz[0][i] = ExecutaOrdenacao.timer.tempoUsado;
                            System.out.println(matriz[0][i]);

                            ExecutaOrdenacao.InsercaoCrescente((ArquivoNome + "OrdenadoCrescente-Inserção.txt"), ArquivoClone2);
                            matriz[1][i] = ExecutaOrdenacao.timer.tempoUsado;
                            System.out.println(matriz[1][i]);

                            ExecutaOrdenacao.SelecaoCrescente((ArquivoNome + "OrdenadoCrescente-Seleção.txt"), ArquivoClone3);
                            matriz[2][i] = ExecutaOrdenacao.timer.tempoUsado;
                            System.out.println(matriz[2][i]);

                        }
                        chart = new GraficoComparacaoOrdenacao("Grafico de Eficiência", "Qual Ordenação Ultilizar?", matriz);
                        do {
                            chart.pack();

                            chart.setVisible(true);
                        } while (chart.isVisible());

                        break;

                    case "5":

                        for (int i = 0; i < 3; i++) {
                            ArrayList ArquivoClone1 = null, ArquivoClone2 = null, ArquivoClone3 = null;

                            if (i == 0) {
                                ArquivoClone1 = (ArrayList) DadosArquivo1.clone();
                                ArquivoClone2 = (ArrayList) DadosArquivo1.clone();
                                ArquivoClone3 = (ArrayList) DadosArquivo1.clone();
                                ArquivoNome = "Arquivo1";
                                JOptionPane.showMessageDialog(null, "Iniciando ordenações no Arquivo1");
                            }
                            if (i == 1) {
                                ArquivoClone1 = (ArrayList) DadosArquivo2.clone();
                                ArquivoClone2 = (ArrayList) DadosArquivo2.clone();
                                ArquivoClone3 = (ArrayList) DadosArquivo2.clone();
                                ArquivoNome = "Arquivo2";
                                JOptionPane.showMessageDialog(null, "Iniciando ordenações no Arquivo2");
                            }
                            if (i == 2) {
                                ArquivoClone1 = (ArrayList) DadosArquivo3.clone();
                                ArquivoClone2 = (ArrayList) DadosArquivo3.clone();
                                ArquivoClone3 = (ArrayList) DadosArquivo3.clone();
                                ArquivoNome = "Arquivo3";
                                JOptionPane.showMessageDialog(null, "Iniciando ordenações no Arquivo3");
                            }

                            ExecutaOrdenacao.BolhaDecrescente((ArquivoNome + "OrdenadoDecrescente-Bolha.txt"), ArquivoClone1);
                            matriz[0][i] = ExecutaOrdenacao.timer.tempoUsado;
                            System.out.println(matriz[0][i]);

                            ExecutaOrdenacao.InsercaoDecrescente((ArquivoNome + "OrdenadoDecrescente-Inserção.txt"), ArquivoClone2);
                            matriz[1][i] = ExecutaOrdenacao.timer.tempoUsado;
                            System.out.println(matriz[1][i]);

                            ExecutaOrdenacao.SelecaoDecrescente((ArquivoNome + "OrdenadoDecrescente-Seleção.txt"), ArquivoClone3);
                            matriz[2][i] = ExecutaOrdenacao.timer.tempoUsado;
                            System.out.println(matriz[2][i]);

                        }
                        chart = new GraficoComparacaoOrdenacao("Grafico de Eficiência", "Qual Ordenação Ultilizar?", matriz);
                        do {
                            chart.pack();

                            chart.setVisible(true);
                        } while (chart.isVisible());

                        break;

                    case "6":

                        JFileChooserDemo.main(args);
                        sair = 1;
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opção Invalida!", "Erro", JOptionPane.ERROR_MESSAGE);
                        break;

                }
            }

        }

    }

    void SelecaoOrdenacao(String ArquivoNome, ArrayList DadosSelecionados) throws IOException {

        System.out.println("Entrada: " + DadosSelecionados);

        while (opcao != null) {

            ArrayList ArquivoClone1 = null, ArquivoClone2 = null, ArquivoClone3 = null;
            ArrayList ArquivoClone = (ArrayList) DadosSelecionados.clone();

            opcao = JOptionPane.showInputDialog(null, "\nO Que Deseja Fazer: \n\n"
                    + "Ordenação em Ordem Crescente:\n\n"
                    + "1- Bolha\n"
                    + "2- Inserção\n"
                    + "3- Seleção  \n"
                    + "4- As 3 Ordenações \n\n"
                    + "Ordenação em Ordem Decrescente:\n\n"
                    + "5- Bolha\n"
                    + "6- Inserção\n"
                    + "7- Seleção\n"
                    + "8- As 3 Ordenações\n"
                    + "\n", "Menu", JOptionPane.PLAIN_MESSAGE);

            if (opcao == null) {
                JOptionPane.showMessageDialog(null, " Até Logo!  ", "Finalizando....", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            } else {
                switch (opcao) {

                    case "1":
                        ExecutaOrdenacao.BolhaCrescente((ArquivoNome + "OrdenadoCrescente-Bolha.txt"), ArquivoClone);
                        System.out.println("Saida: " + ArquivoClone);

                        break;

                    case "2":
                        ExecutaOrdenacao.InsercaoCrescente((ArquivoNome + "OrdenadoCrescente-Inserção.txt"), ArquivoClone);
                        System.out.println("Saida: " + ArquivoClone);

                        break;
                    case "3":
                        ExecutaOrdenacao.SelecaoCrescente((ArquivoNome + "OrdenadoCrescente-Seleção.txt"), ArquivoClone);
                        System.out.println("Saida: " + ArquivoClone);
                        break;

                    case "4":
                        ExecutaOrdenacao.BolhaDecrescente((ArquivoNome + "OrdenadoDecrescente-Bolha.txt"), ArquivoClone);
                        System.out.println("Saida: " + ArquivoClone);

                        break;

                    case "5":
                        ExecutaOrdenacao.InsercaoDecrescente((ArquivoNome + "OrdenadoDecrescente-Inserção.txt"), ArquivoClone);
                        System.out.println("Saida: " + ArquivoClone);

                        break;
                    case "6":
                        ExecutaOrdenacao.SelecaoDecrescente((ArquivoNome + "OrdenadoDecrescente-Seleção.txt"), ArquivoClone);
                        System.out.println("Saida: " + ArquivoClone);
                        break;

                    case "7":
                        ArquivoClone1 = (ArrayList) ArquivoClone.clone();
                        ArquivoClone2 = (ArrayList) ArquivoClone.clone();
                        ArquivoClone3 = (ArrayList) ArquivoClone.clone();
                        ExecutaOrdenacao.BolhaCrescente((ArquivoNome + "OrdenadoCrescente-Bolha.txt"), ArquivoClone1);
                        ExecutaOrdenacao.InsercaoCrescente((ArquivoNome + "OrdenadoCrescente-Inserção.txt"), ArquivoClone2);
                        ExecutaOrdenacao.SelecaoCrescente((ArquivoNome + "OrdenadoCrescente-Seleção.txt"), ArquivoClone3);
                        System.out.println("Saida: \n" + ArquivoClone1 + "\n" + ArquivoClone2 + "\n" + ArquivoClone3);
                        break;

                    case "8":
                        ArquivoClone1 = (ArrayList) ArquivoClone.clone();
                        ArquivoClone2 = (ArrayList) ArquivoClone.clone();
                        ArquivoClone3 = (ArrayList) ArquivoClone.clone();
                        ExecutaOrdenacao.BolhaDecrescente((ArquivoNome + "OrdenadoDecrescente-Bolha.txt"), ArquivoClone1);
                        ExecutaOrdenacao.InsercaoDecrescente((ArquivoNome + "OrdenadoDecrescente-Inserção.txt"), ArquivoClone2);
                        ExecutaOrdenacao.SelecaoDecrescente((ArquivoNome + "OrdenadoDecrescente-Seleção.txt"), ArquivoClone3);
                        System.out.println("Saida: \n" + ArquivoClone1 + "\n" + ArquivoClone2 + "\n" + ArquivoClone3);
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opção invalida!", "Erro", JOptionPane.ERROR_MESSAGE);

                }

            }

        }
    }

}
