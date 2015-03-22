/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaExercicios;

import java.util.Scanner;

public class Seletor {

    public static void main(String[] args) {

        Menu menu = new Menu();
        boolean sair = false;
        do {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Qual Lista voce deseja?\n"
                    + "1- Listone\n"
                    + "2- ListTwo\n"
                    + "3- ListThree\n"
                    + "4- ListFour\n"
                    + "5- ListFive\n"
                    + "0- Sair");
            String opcao = null, lista = entrada.nextLine();

            switch (lista) {

                case "1":
                    do {
                        System.out.println("Esta lista possui 5 exercicios.Qual voce deseja executar? ");
                        opcao = entrada.nextLine();
                        menu.menuListaOne(opcao);
                        System.out.println("\nVoce deseja executar outro item desta lista?\nAperte enter para continuar ou 0 para sair.");
                        opcao = entrada.nextLine();
                    } while (!opcao.equals("0"));
                    break;
                case "2":
                    do {
                        System.out.println("Esta lista possui 17 exercicios.Qual voce deseja executar? ");
                        opcao = entrada.nextLine();
                        menu.menuListaTwo(opcao);
                        System.out.println("\nVoce deseja executar outro item desta lista?\nAperte enter para continuar ou 0 para sair.");
                        opcao = entrada.nextLine();
                    } while (!opcao.equals("0"));
                    break;
                case "3":
                    do {
                        System.out.println("Esta lista possui 3 exercicios.Qual voce deseja executar? ");
                        opcao = entrada.nextLine();
                        menu.menuListaThree(opcao);
                        System.out.println("\nVoce deseja executar outro item desta lista?\nAperte enter para continuar ou 0 para sair.");
                        opcao = entrada.nextLine();
                    } while (!opcao.equals("0"));
                    break;
                case "4":
                    do {
                        System.out.println("Esta lista possui 16 exercicios.Qual voce deseja executar? ");
                        opcao = entrada.nextLine();
                        menu.menuListaFour(opcao);
                        System.out.println("\nVoce deseja executar outro item desta lista?\nAperte enter para continuar ou 0 para sair.");
                        opcao = entrada.nextLine();
                    } while (!opcao.equals("0"));
                    break;
                case "5":
                    do {
                        System.out.println("Esta lista possui 18 exercicios.Qual voce deseja executar? ");
                        menu.menuListaFive(opcao);
                        System.out.println("\nVoce deseja executar outro item desta lista?\nAperte enter para continuar ou 0 para sair.");
                        opcao = entrada.nextLine();
                    } while (!opcao.equals("0"));
                    break;
                case "6":
                    do {
                        System.out.println("Esta lista possui 17 exercicios.Qual voce deseja executar? ");
                        menu.menuListaSix(opcao);
                        System.out.println("\nVoce deseja executar outro item desta lista?\nAperte enter para continuar ou 0 para sair.");
                        opcao = entrada.nextLine();
                    } while (!opcao.equals("0"));
                    break;

                case "0":
                    System.out.println("\nFinalizando.....");
                    break;
                default:
                    System.out.println("Exercicio Invalido!");
                    break;

            }
        } while (sair);

    }
}
