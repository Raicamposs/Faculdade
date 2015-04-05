package MyPoint;

import java.util.Random;
import java.util.Scanner;

/*
 * ClassName Menu
 * Version information 1.0 
 * Date 04/04/2014 
 * @author Raiane Campos 
 * Copyright notice class destinada construção do menu de opções para contruçao de constructos 
 * e manipulação dos metodos da class Mypoint
 */
public class Menu {

    // Construção dos objetos 
    private final MyPoint[] newMyPoint = new MyPoint[10];
    private final Scanner input = new Scanner(System.in);
    private final Random gerador = new Random();

    // Declaração e Iniciação das variaveis
    private int y = 0, x = 0, p = 0, ponto;

    public Menu() {
        //Interação com o usuario
        System.out.println("Deseja preencher os pontos?\n1 - Sim \n2 - Aleatorio \nSair - Qualquer outra tecla");
        String opcao = input.nextLine();

        switch (opcao) {

            case "1":
                //Usuario preenche as posições do vetor newMyPoint
                for (int i = 0; i < 10; i++) {
                    System.out.println("Insira o valor x no ponto " + (i + 1) + " :");
                    x = input.nextInt();
                    System.out.println("Insira o valor y no ponto " + (i + 1) + " :");
                    y = input.nextInt();

                    newMyPoint[i] = new MyPoint(x, y);
                }
                break;

            case "2":
                //Utilizando o metodo random as posições do vetor newMyPoint são preenchido aleatoriamente
                System.out.println("\nGerando...\n");
                for (int i = 0; i < 10; i++) {

                    x = gerador.nextInt(100);
                    y = gerador.nextInt(100);

                    newMyPoint[i] = new MyPoint(x, y);
                    System.out.println("Ponto " + (i + 1) + " : " + newMyPoint[i]);
                }
                break;

            default:
                //A aplicação é encerada
                System.exit(0);
        }

    }

    public void opcoes() {
        //Interação com o usuario
        System.out.println("\nO Que Deseja Fazer?"
                + "\n1 - Distancia entre Pontos "
                + "\n2 - Distancia entre Coordenadas e um Ponto "
                + "\n3 - Alterar Coordenadas "
                + "\n4 - Consultar Coordenadas "
                + "\nSair - Qualquer outra tecla");
        String opcao = input.nextLine();

        switch (opcao) {

            case "1":
                //Instancia o metodo distanceEntrePontos
                distanceEntrePontos();
                break;

            case "2":
                //Instancia o metodo distanceEntrePontoECoordenadas
                distanceEntrePontoECoordenadas();
                break;

            case "3":
                //Instancia o metodo setNewCoordenadas
                setNewCoordenadas();
                break;

            case "4":
                //Instancia o metodo getCoordenadas
                getCoordenadas();
                break;

            default:
                //A aplicação é encerada
                System.exit(0);
                break;

        }
    }

    //Declaração do método distanceEntrePontos
    private void distanceEntrePontos() {
        //Interação com o usuario onde ocorre a seleçao do index e a instancia do metodo distance do objeto newMyPoint
        System.out.println("\nInsira qual o ponto desejado para comparação:");
        ponto = input.nextInt();
        System.out.println("Distancia entre os pontos");
        for (MyPoint newMyPoint1 : newMyPoint) {
            p++;
            System.out.printf(ponto + " e " + p + " = %.2f \n", newMyPoint[ponto - 1].distance(newMyPoint1));

        }

    }

    //Declaração do método distanceEntrePontoECoordenadas
    private void distanceEntrePontoECoordenadas() {
        //Interação com o usuario onde ocorre a seleçao do index e de parametros passados o metodo distance do objeto newMyPoint
        System.out.println("\nInsira o valor x:");
        x = input.nextInt();
        System.out.println("Insira o valor y:");
        y = input.nextInt();
        System.out.println("Insira qual o ponto desejado para comparação:");
        ponto = input.nextInt();
        System.out.printf("Distancia entre as cordenadas e o ponto é: %.2f \n", newMyPoint[ponto - 1].distance(x, y));

    }

    //Declaração do método setNewCoordenadas
    private void setNewCoordenadas() {
        //Interação com o usuario onde ocorre a seleçao do index e de parametros passados o metodo setXY do objeto newMyPoint
        System.out.println("\nInsira qual o ponto desejado para alteração:");
        ponto = input.nextInt();
        System.out.println("Insira o novo valor x:");
        x = input.nextInt();
        System.out.println("Insira o  novo valor y:");
        y = input.nextInt();
        newMyPoint[ponto - 1].setXY(x, y);

    }

    //Declaração do método getCoordenadas
    private void getCoordenadas() {
        //Interação com o usuario onde ocorre a seleçao de index do objeto newMyPoint e a instancia do metodo toString
        System.out.println("\nInsira qual o ponto desejado para consulta:");
        ponto = input.nextInt();
        System.out.println("Coordenadas:" + newMyPoint[ponto - 1].toString());

    }
}
