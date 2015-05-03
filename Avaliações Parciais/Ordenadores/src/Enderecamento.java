import javax.swing.JOptionPane;

public class Enderecamento {

    String EnderecoPastaRaiz = "", NomeArquivo = "";
    String[] caminho = new String[3];

    public void Caminho() {

        while (EnderecoPastaRaiz == null || EnderecoPastaRaiz.equals("") || NomeArquivo == null || NomeArquivo.equals("")) {
            EnderecoPastaRaiz = JOptionPane.showInputDialog("Qual o endereço da pasta raiz do arquivo?");
            if (EnderecoPastaRaiz == null) {
                System.exit(0);
            } else {
                for (int i = 0; i < 3; i++) {
                    NomeArquivo = JOptionPane.showInputDialog("Qual o nome do Arquivo " + (i + 1) + " ?");
                    if (NomeArquivo == null) {
                        System.exit(0);
                    }
                    if (EnderecoPastaRaiz.equals("") || NomeArquivo.equals("")) {
                        JOptionPane.showMessageDialog(null, " Voce deixou um campo importante em branco.Preencha todos os campos!");
                        StartAgain();
                        break;

                    }

                    caminho[i] = ("" + EnderecoPastaRaiz + "\\" + NomeArquivo + ".txt");
                    System.out.println("" + caminho[i]);
                }
            }

        }

    }

    void StartAgain() {
        Caminho();
    }
}
