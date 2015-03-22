
package vendasfiliais;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


/**
 *
 * Uma loja possui 4 filiais, cada uma com um código de 1 a 4. Um arquivo
 * contendo todas as vendas feitas durante o dia nas quatro filiais é gerado a
 * partir de uma planilha, sendo que cada linha do arquivo contém o número da
 * filial e o valor de uma venda efetuada, separados por vírgula. Exemplo de
 * conteúdo de arquivo: 1,189.90 1,45.70 3,29.90 4,55.00 No exemplo acima, a
 * filial 1 fez duas vendas, a primeira totalizando R$ 189,90 e a segunda R$
 * 45,70. A filial 3 fez uma venda de R$ 29,90 e a 4 também uma de R$ 55,00.
 * Faça um programa que leia este arquivo e informe, ao final, o total e o valor
 * médio das vendas de cada filial.
 * 
 *  @author Raiane Campos
 */
public class VendasFiliais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Busca nova = new Busca();

       String  caminho = JOptionPane.showInputDialog("Entre com um endereço válido da Planilha de Vendas:");

        if (caminho != null) {

            String Texto;

            nova.endereco(caminho);

            Texto = nova.paragrafo;
            nova.separa(Texto);

            DecimalFormat df = new DecimalFormat("#,##0.00");
            System.out.println("Tabela de Vendas das Filiais\n"
                    + "Filial    N°vendas   Total      Media\n"
                    + "  1         " + nova.v1 + "        " + df.format(nova.soma1) + "     " + df.format(nova.media1) + "\n"
                    + "  2         " + nova.v2 + "        " + df.format(nova.soma2) + "      " + df.format(nova.media2) + "\n"
                    + "  3         " + nova.v3 + "        " + df.format(nova.soma3) + "      " + df.format(nova.media3) + "\n"
                    + "  4         " + nova.v4 + "        " + df.format(nova.soma4) + "      " + df.format(nova.media4)
            );
        }else{
            System.exit(0);
        }
    }}

