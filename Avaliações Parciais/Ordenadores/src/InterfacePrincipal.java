import java.io.IOException;

public class InterfacePrincipal {

    public static void main(String[] args) throws IOException, InterruptedException {

        Enderecamento endereco = new Enderecamento();
        UtiusArquivos utius = new UtiusArquivos();
        InterfaceSelecao selecao = new InterfaceSelecao();

        
//          endereco.Caminho();
        
        endereco.caminho[0] = "C:\\Users\\Raiane Campos\\SkyDrive\\Documentos\\NetBeansProjects\\Ordenadores\\dados\\dados1.txt";
        endereco.caminho[1] = "C:\\Users\\Raiane Campos\\SkyDrive\\Documentos\\NetBeansProjects\\Ordenadores\\dados\\dados2.txt";
        endereco.caminho[2] = "C:\\Users\\Raiane Campos\\SkyDrive\\Documentos\\NetBeansProjects\\Ordenadores\\dados\\dados3.txt";

        utius.GerarLista(endereco.caminho[0], endereco.caminho[1], endereco.caminho[2]);
        selecao.SelecaoArquivos(utius.listDados1, utius.listDados2, utius.listDados3);

    }
}
