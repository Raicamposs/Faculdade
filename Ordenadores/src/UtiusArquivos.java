import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class UtiusArquivos {

    ArrayList listDados1 = new ArrayList();
    ArrayList listDados2 = new ArrayList();
    ArrayList listDados3 = new ArrayList();

    private ArrayList BuscaDados(String EnderecoAquivo) throws FileNotFoundException, IOException {

        try {
            InputStream is = new FileInputStream(EnderecoAquivo);
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            ArrayList lista = new ArrayList();
            String linha = br.readLine();
            StringTokenizer wordFinder = new StringTokenizer(linha, " ");
            while (wordFinder.hasMoreTokens()) {
                int num = Integer.parseInt(wordFinder.nextToken().trim());
                lista.add(num);
            }
            br.close();
            return lista;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro na abertura do arquivo !  Endereço invalido !", "Erro", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        return null;
    }

    void GerarLista(String EnderecoAquivo1, String EnderecoAquivo2, String EnderecoAquivo3) throws IOException {
        if (EnderecoAquivo1 != null && EnderecoAquivo2 != null && EnderecoAquivo3 != null) {
            listDados1 = BuscaDados(EnderecoAquivo1);
            listDados2 = BuscaDados(EnderecoAquivo2);
            listDados3 = BuscaDados(EnderecoAquivo3);

        } else {
            JOptionPane.showMessageDialog(null, "Erro ao Gerrar Listas! Endereço do Arquivo é Invalido!", "Erro", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    void ImprimiteDados(String NomeOrdenacao, String NomeAquivoOrdenado, ArrayList ListaDadosOrdenados, float tempoUsado)
            throws FileNotFoundException, IOException {

        int resposta = JOptionPane.showConfirmDialog(null, "Ordenação " + NomeOrdenacao + " Realizada com Sucesso !\n"
                + "Tempo de Execução: " + tempoUsado + "\n\nVoce Deseja Salvar a Ordenaçao?\n", "Selecione....", JOptionPane.YES_NO_CANCEL_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {

            OutputStream os = new FileOutputStream(NomeAquivoOrdenado);
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write(listaToString(ListaDadosOrdenados));
            bw.newLine();
            bw.write("Tempo utilizado: " + tempoUsado + " Milisegundos");
            bw.close();
        } else if (resposta == JOptionPane.NO_OPTION) {

        } else if (resposta == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, " Até Logo!  ", "Finalizando....", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }

    private String listaToString(ArrayList DadosArquivo) {
        String ConteudoArquivo = "";
        for (int i = 0; i < DadosArquivo.size(); i++) {
            ConteudoArquivo = ConteudoArquivo + DadosArquivo.get(i) + " ";
        }
        return ConteudoArquivo;
    }
}
