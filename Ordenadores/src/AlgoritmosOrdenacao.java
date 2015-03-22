import java.io.IOException;
import java.util.ArrayList;

public class AlgoritmosOrdenacao {

    Temporizadores timer = new Temporizadores();

    UtiusArquivos utils = new UtiusArquivos();

    void InsercaoCrescente(String ArquivoNome, ArrayList ListaDados) throws IOException {
        timer.iniciarTemporizador();
        int j, eleito;

        for (int i = 0; i < ListaDados.size(); i++) {
            eleito = (int) ListaDados.get(i);
            j = i - 1;
            while (j >= 0 && (int) ListaDados.get(j) > eleito) {
                ListaDados.set(j + 1, ListaDados.get(j));
                j = j - 1;
            }
            ListaDados.set(j + 1, eleito);
        }
        timer.terminarTemporizador();

        utils.ImprimiteDados("Inserção em Ordem Crescente", ArquivoNome, ListaDados, timer.tempoUsado());

    }

    void SelecaoCrescente(String ArquivoNome, ArrayList ListaDados) throws IOException {

        timer.iniciarTemporizador();
        int eleito, menor, pos;

        for (int i = 0; i < (ListaDados.size() - 1); i++) {
            eleito = (int) ListaDados.get(i);
            menor = (int) ListaDados.get(i + 1);
            pos = i + 1;
            for (int j = i + 2; j < ListaDados.size(); j++) {
                if ((int) ListaDados.get(j) < menor) {
                    menor = (int) ListaDados.get(j);
                    pos = j;
                }
            }
            if (menor < eleito) {
                ListaDados.set(i, ListaDados.get(pos));
                ListaDados.set(pos, eleito);
            }
        }
        timer.terminarTemporizador();
        utils.ImprimiteDados("Seleção em Ordem Crescente", ArquivoNome, ListaDados, timer.tempoUsado());
    }

    void BolhaCrescente(String ArquivoNome, ArrayList ListaDados) throws IOException {

        timer.iniciarTemporizador();
        int aux;
        for (int i = 0; i < ListaDados.size(); i++) {
            for (int j = 0; j < (ListaDados.size() - 1); j++) {
                if ((int) ListaDados.get(j) > (int) ListaDados.get(j + 1)) {
                    aux = (int) ListaDados.get(j);
                    ListaDados.set(j, ListaDados.get(j + 1));
                    ListaDados.set(j + 1, aux);
                }
            }
        }

        timer.terminarTemporizador();

        utils.ImprimiteDados("Bolha em Ordem Crescente", ArquivoNome, ListaDados, timer.tempoUsado());
    }
    
     void InsercaoDecrescente(String ArquivoNome, ArrayList ListaDados) throws IOException {
        timer.iniciarTemporizador();
        int j, eleito;

        for (int i = 0; i < ListaDados.size(); i++) {
            eleito = (int) ListaDados.get(i);
            j = i - 1;
            while (j >= 0 && (int) ListaDados.get(j) < eleito) {
                ListaDados.set(j + 1, ListaDados.get(j));
                j = j - 1;
            }
            ListaDados.set(j + 1, eleito);
        }
        timer.terminarTemporizador();

        utils.ImprimiteDados("Inserção em Ordem Decrescente", ArquivoNome, ListaDados, timer.tempoUsado());

    }

    void SelecaoDecrescente(String ArquivoNome, ArrayList ListaDados) throws IOException {

        timer.iniciarTemporizador();
        int eleito, maior, pos;

        for (int i = 0; i < (ListaDados.size() - 1); i++) {
            eleito = (int) ListaDados.get(i);
            maior = (int) ListaDados.get(i + 1);
            pos = i + 1;
            for (int j = i + 2; j < ListaDados.size(); j++) {
                if ((int) ListaDados.get(j) > maior) {
                    maior = (int) ListaDados.get(j);
                    pos = j;
                }
            }
            if (maior > eleito) {
                ListaDados.set(i, ListaDados.get(pos));
                ListaDados.set(pos, eleito);
            }
        }
        timer.terminarTemporizador();
        utils.ImprimiteDados("Seleção em Ordem Decrescente", ArquivoNome, ListaDados, timer.tempoUsado());
    }

    void BolhaDecrescente(String ArquivoNome, ArrayList ListaDados) throws IOException {

        timer.iniciarTemporizador();
        int aux;
        for (int i = 0; i < ListaDados.size(); i++) {
            for (int j = 0; j < (ListaDados.size() - 1); j++) {
                if ((int) ListaDados.get(j) < (int) ListaDados.get(j + 1)) {
                    aux = (int) ListaDados.get(j);
                    ListaDados.set(j, ListaDados.get(j + 1));
                    ListaDados.set(j + 1, aux);
                }
            }
        }

        timer.terminarTemporizador();

        utils.ImprimiteDados("Bolha em Ordem Decrescente", ArquivoNome, ListaDados, timer.tempoUsado());
    }
    
}
