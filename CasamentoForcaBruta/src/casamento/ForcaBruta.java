
package casamento;

import javax.swing.JOptionPane;

/**
 *
 * @author Raiane Campos
 */
public class ForcaBruta {

    public void busca(String texto, String padrao) {

        String combinacao = "";
        int T = texto.length(), P = padrao.length();
        int[] posiçoes = new int[T];
        int n = 0;

        if (T < P) {

            JOptionPane.showMessageDialog(null, "O padrao não esta no texto");
        }
        if (T >= P) {

            for (int i = 0; i < (T - P + 1); i++) {
                int j = i;
                int k = 0;
                while ((k < P) && (texto.charAt(j) == padrao.charAt(k))) {
                    j++;
                    k++;
                }
                if (k == P) {
                    n++;
                    posiçoes[n] = i + 1;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            combinacao = combinacao + "\n " + posiçoes[i];
        }
        JOptionPane.showMessageDialog(null, "Casamento nas posições: " + combinacao);
    }
}
