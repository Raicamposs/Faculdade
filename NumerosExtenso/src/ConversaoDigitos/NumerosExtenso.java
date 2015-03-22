/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConversaoDigitos;

import javax.swing.JOptionPane;
import jdk.nashorn.internal.runtime.JSType;

/**
 *
 * @author Raiane Campos
 */
public class NumerosExtenso {

    private String Unidade(String numero) {
        switch (numero) {
            case "0":
                return "Zero ";
            case "1":
                return "Um ";
            case "2":
                return "Dois ";
            case "3":
                return "Três ";
            case "4":
                return "Quatro ";
            case "5":
                return "Cinco ";
            case "6":
                return "Seis ";
            case "7":
                return "Sete ";
            case "8":
                return "Oito ";
            case "9":
                return "Nove ";

        }
        return null;
    }

    private String Dezena(String numero) {
        switch (numero) {
            case "2":
                return "Vinte ";
            case "3":
                return "Trinta ";
            case "4":
                return "Quarenta ";
            case "5":
                return "Cinquenta ";
            case "6":
                return "Sessenta ";
            case "7":
                return "Setenta ";
            case "8":
                return "Oitenta ";
            case "9":
                return "Noventa ";
        }
        return null;
    }

    private String Centena(String numero) {
        switch (numero) {
            case "1":
                return "Cento ";
            case "2":
                return "Duzentos ";
            case "3":
                return "Trezentos ";
            case "4":
                return "Quatrocentos ";
            case "5":
                return "Quinhentos ";
            case "6":
                return "Seiscentos ";
            case "7":
                return "Setecentos ";
            case "8":
                return "Oitocentos ";
            case "9":
                return "Novecentos ";
        }
        return null;
    }

    private String Exceção(String numero) {
        switch (numero) {
            case "10":
                return "Dez ";
            case "11":
                return "Onze";
            case "12":
                return "Doze";
            case "13":
                return "Treze";
            case "14":
                return "Quatorze";
            case "15":
                return "Quinze";
            case "16":
                return "Dezesseis";
            case "17":
                return "Dezessete";
            case "18":
                return "Dezoito";
            case "19":
                return "Dezenove";
        }
        return null;
    }

    int Digitos(String Numero) {
        if (JSType.isNumber(Numero)) {

            if (Numero.length() > 9) {
                Numero = Numero.substring(0, 9);
            }
            return Numero.length();
        }
        JOptionPane.showMessageDialog(null, " Voce não digitou um numero!", "Erro", JOptionPane.WARNING_MESSAGE);
        System.exit(0);
        return -1;
    }

    private String ThreeDigitos(String numero) {

        String GrupoDigitos;

        int casas = numero.length();
        if (casas >= 2) {

            if (Exceção(numero.substring((casas - 2), casas)) != null) {
                GrupoDigitos = Exceção(numero.substring((casas - 2), casas));
            } else {
                if (!"0".equals(numero.substring((casas - 1), casas))) {
                    GrupoDigitos = Dezena(numero.substring((casas - 2), (casas - 1))) + "e " + Unidade(numero.substring((casas - 1), casas));
                } else if ("0".equals(numero.substring((casas - 2), (casas - 1)))) {
                    GrupoDigitos = Unidade(numero.substring((casas - 1), casas));
                } else {
                    GrupoDigitos = Dezena(numero.substring((casas - 2), (casas - 1)));
                }
            }
        } else {
            GrupoDigitos = Unidade(numero.substring((casas - 1), casas));
        }

        if (numero.length() >= 3 && !"0".equals(numero.substring((casas - 3), (casas - 2)))) {
            if ("0".equals(numero.substring((casas - 1), casas)) && "0".equals(numero.substring((casas - 2), (casas - 1)))) {
                if (!numero.substring((casas - 3), (casas - 2)).equals("1")) {
                    GrupoDigitos = Centena(numero.substring((casas - 3), (casas - 2)));
                }
                if ("100".equals(numero)) {
                    GrupoDigitos = "Cem ";
                }
            } else {
                GrupoDigitos = Centena(numero.substring((casas - 3), (casas - 2))) + "e " + GrupoDigitos;
            }
        }
        return GrupoDigitos;

    }

    private void Milhao(String numero, int numCasasDecimais) {

        if (numCasasDecimais == 7 && numero.substring(0, 1).equals("1")) {

            if ("000000".equals(numero.substring(numCasasDecimais - 6, numCasasDecimais))) {
                JOptionPane.showMessageDialog(null, ThreeDigitos(numero.substring(0, numCasasDecimais - 6)) + "Milhão ", "Resultado", JOptionPane.INFORMATION_MESSAGE);

            } else if ("000".equals(numero.substring(numCasasDecimais - 6, numCasasDecimais - 3))) {
                JOptionPane.showMessageDialog(null, ThreeDigitos(numero.substring(0, numCasasDecimais - 6)) + "Milhão "
                        + ThreeDigitos(numero.substring(numCasasDecimais - 3, numCasasDecimais)), "Resultado", JOptionPane.INFORMATION_MESSAGE);

            } else if ("000".equals(numero.substring(numCasasDecimais - 3, numCasasDecimais))) {
                JOptionPane.showMessageDialog(null, ThreeDigitos(numero.substring(0, numCasasDecimais - 6)) + "Milhão "
                        + ThreeDigitos(numero.substring(numCasasDecimais - 6, numCasasDecimais - 3) + "Mil"), "Resultado", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, ThreeDigitos(numero.substring(0, numCasasDecimais - 6)) + "Milhão "
                        + ThreeDigitos(numero.substring(numCasasDecimais - 6, numCasasDecimais - 3)) + "Mil"
                        + ThreeDigitos(numero.substring(numCasasDecimais - 3, numCasasDecimais)), "Resultado", JOptionPane.INFORMATION_MESSAGE);
            }

        } else {

            if ("000000".equals(numero.substring(numCasasDecimais - 6, numCasasDecimais))) {
                JOptionPane.showMessageDialog(null, ThreeDigitos(numero.substring(0, numCasasDecimais - 6)) + "Milhões", "Resultado", JOptionPane.INFORMATION_MESSAGE);

            } else if ("000".equals(numero.substring(numCasasDecimais - 6, numCasasDecimais - 3))) {
                JOptionPane.showMessageDialog(null, ThreeDigitos(numero.substring(0, numCasasDecimais - 6)) + "Milhões "
                        + ThreeDigitos(numero.substring(numCasasDecimais - 3, numCasasDecimais)), "Resultado", JOptionPane.INFORMATION_MESSAGE);

            } else if ("000".equals(numero.substring(numCasasDecimais - 3, numCasasDecimais))) {
                JOptionPane.showMessageDialog(null, ThreeDigitos(numero.substring(0, numCasasDecimais - 6)) + "Milhões "
                        + ThreeDigitos(numero.substring(numCasasDecimais - 6, numCasasDecimais - 3) + "Mil"), "Resultado", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, ThreeDigitos(numero.substring(0, numCasasDecimais - 6)) + "Milhões "
                        + ThreeDigitos(numero.substring(numCasasDecimais - 6, numCasasDecimais - 3)) + "Mil"
                        + ThreeDigitos(numero.substring(numCasasDecimais - 3, numCasasDecimais)), "Resultado", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }

    private void Mil(String Numero, int numCasasDecimais) {

        if (!Numero.substring(numCasasDecimais - 3, numCasasDecimais).equals("000")) {
            JOptionPane.showMessageDialog(null, ThreeDigitos(Numero.substring(0, numCasasDecimais - 3))
                    + "Mil " + ThreeDigitos(Numero.substring(numCasasDecimais - 3, numCasasDecimais)), "Resultado", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, ThreeDigitos(Numero.substring(0, numCasasDecimais - 3))
                    + "Mil ", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    void Exibe(String Numero, int numCasasDecimais) {

        if (numCasasDecimais > 6) {
            Milhao(Numero, numCasasDecimais);
        }
        if (numCasasDecimais < 7 && numCasasDecimais > 3) {
            Mil(Numero, numCasasDecimais);
        }
        if (numCasasDecimais <= 3) {
            JOptionPane.showMessageDialog(null, ThreeDigitos(Numero), "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }

    }

}
