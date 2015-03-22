/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaExercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Raiane Campos
 */
public class ListOne {

    public void exercicioOne() {

        /*1. O site Submarino passará a vender seus produtos em 15 (quinze) prestações sem juros. 
         Faça uma função que receba como parâmetro o valor da compra e retorne o valor das prestações. 
         Depois modifique essa função para torná-la mais genérica passando a receber também o número de prestações. 
         */
        float valorCompra, parcela, valorParcela;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o valor da compra: ");
        valorCompra = entrada.nextFloat();
        System.out.println("Insira o numero de parcelas: ");
        parcela = entrada.nextFloat();

        valorParcela = valorCompra / parcela;

        if (parcela <= 15) {
            System.out.println("O valor das parcelas é de: " + valorParcela);
        } else {
            System.out.println("Numero de parcelas invalido. O numero maximo parcelas é 15 ");
        }
    }

    public void exercicioTwo() {

        /*
         * 2. O rendimento do etanol nos carros flex é, em média, 30% mais baixo que o da gasolina, 
         * tanto na cidade quanto na estrada. Por isso, em grande parte dos veículos só compensa abastecer com álcool 
         * se ele custar, no máximo, 70% do preço do combustível fóssil. Implemente uma função que recebe o preço 
         * da gasolina e o preço do etanol e retorne uma String com o nome combustível que está compensando abastecer. 
         */
        double alcool, gasolina, precoGasolina;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o valor do alcool:");
        alcool = entrada.nextDouble();
        System.out.println("Insira o valor da gasolina:");
        gasolina = entrada.nextDouble();
        precoGasolina = 0.7 * gasolina;

        if (alcool <= precoGasolina) {

            System.out.println("Abasteça com alcool");
        } else {

            System.out.println("Abasteça com gasolina");
        }
    }

    public void exercicioThree() {

        /*
         3. Faça 3 funções: calculaMedia, calculaSoma, calculaMultiplicacao.
         * Essas funções recebem uma lista de números e realizam, respectivamente, a média dos números,
         * a soma dos números e a multiplicação dos números.  
         */
        float numero1, numero2;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um numero ");
        numero1 = entrada.nextFloat();
        System.out.println("Insira outro numero numero");
        numero2 = entrada.nextFloat();

        System.out.println("A soma entre " + numero1 + " e " + numero2 + " e igual a: " + calculaSoma(numero1, numero2));
        System.out.println("A multiplicacao entre " + numero1 + " e " + numero2 + " e igual a: " + calculaMultiplicacao(numero1, numero2));
        System.out.println("A media entre " + numero1 + " e " + numero2 + " e igual a: " + calculaMedia(numero1, numero2));

    }

    private float calculaMedia(float num1, float num2) {
        float resultadoMedia = (num1 + num2) / 2;
        return resultadoMedia;
    }

    private float calculaSoma(float num1, float num2) {
        float resultadoSoma = num1 + num2;
        return resultadoSoma;
    }

    private float calculaMultiplicacao(float num1, float num2) {
        float resultadoMultiplicacao = (num1 * num2);
        return resultadoMultiplicacao;
    }

    public void exercicioFour() {

        /*
         4. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
         * porcentagem do distribuidor e dos impostos, ambos aplicados ao custo de fábrica. 
         * Supondo que a porcentagem do distribuidor seja de 12% e a dos impostos de 45%,
         * prepare uma função para receber o custo de fábrica do carro e imprimir o custo ao consumidor.
         */
        float valorCusto;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o valor do custo de fábrica do carro: ");
        valorCusto = entrada.nextFloat();

        float precofinal = (valorCusto + (valorCusto * 0.45f) + (valorCusto * 0.12f));
        System.out.println("O valor de venda do carro e: " + precofinal);

    }

    public void exercicioFive() {

        /*
         * 5. O cardápio de uma lanchonete é dado abaixo. Prepare uma função que receba a 
         * quantidade de cada item consumido e retorne a conta final.  
         * Hambúrguer................. R$ 3,00  
         * Cheeseburger.............. R$ 2,50  
         * Fritas............................R$ 2,50 
         * Refrigerante................. R$ 1,00 
         * Milkshake..................... R$ 3,00 
         */
        Scanner scan = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("##.##");

        int numHamb = 0, numChese = 0, numFrita = 0, numRefri = 0, numMilk = 0;
        float totalHamb = 0, totalChese = 0, totalFrita = 0, totalRefri = 0, totalMilk = 0;
        String continuar, codProduto, pedido = "v";
        boolean flag = false;

        System.out.println("         ________________Cardapio_______________\n\n"
                + "         1 - Hambúrguer................. R$ 3,00 \n"
                + "         2 - Cheeseburger............... R$ 2,50 \n"
                + "         3 - Fritas......................R$ 2,50 \n"
                + "         4 - Refrigerante............... R$ 1,00 \n"
                + "         5 - Milkshake.................. R$ 3,00 \n"
                + "        _________________________________________\n");

        
        while (!pedido.equalsIgnoreCase("s") && !pedido.equalsIgnoreCase("n")) {
            System.out.println("Iniciar pedido? S/N: ");
            pedido = scan.next();
        }
        if (pedido.equalsIgnoreCase("n")) {
            System.out.println("Finalizando o Programa ...");
            System.exit(0);
        } else {

            do {
                if (pedido.equalsIgnoreCase("s")) {

                    System.out.print("Digite o código do produto: ");
                    codProduto = scan.next();

                    switch (codProduto) {
                        case "1":
                            System.out.print("Digite a quantidade de Hambúrguers: ");
                            numHamb += (numHamb = scan.nextInt());
                            totalHamb = 1.20f * numHamb;
                            break;

                        case "2":
                            System.out.println("Digite a quantidade de Cheeseburgers: ");
                            numChese += (numChese = scan.nextInt());
                            totalChese = 1.30f * numChese;
                            break;

                        case "3":
                            System.out.println("Digite a quantidade de Fritas: ");
                            numFrita += (numFrita = scan.nextInt());
                            totalFrita = 1.50f * numFrita;
                            break;

                        case "4":
                            System.out.print("Digite a quantidade de Refrigerante: ");
                            numRefri += (numRefri = scan.nextInt());
                            totalRefri = 1.20f * numRefri;
                            break;

                        case "5":
                            System.out.print("Digite a quantidade de Milkshakes: ");
                            numMilk += (numMilk = scan.nextInt());
                            totalMilk = 1.30f * numMilk;
                            break;

                        default:
                            System.out.println("Codigo incorreto!\n");
                            break;
                    }
                }

                System.out.print("Deseja acresentar algo mais?\nS/N: ");
                continuar = scan.next();

                if (continuar.equalsIgnoreCase("s")) {
                    flag = true;
                }

                if (continuar.equalsIgnoreCase("n")) {
                    flag = false;
                }

            } while (flag);
//
        float totalConta = totalHamb + totalChese + totalFrita + totalRefri + totalMilk;

        System.out.println("         ________________Conta_______________\n\n"
                + "Especificação        Cod       Preço       Quant       Total"
                + "\nHambúrguer            1        R$1,20        " + numHamb + "           " + format.format(totalHamb)
                + "\nCheeseburger          2        R$1,30        " + numChese + "           " + format.format(totalChese)
                + "\nFritas                3        R$1,50        " + numFrita + "           " + format.format(totalFrita)
                + "\nRefrigerante          4        R$1,20        " + numRefri + "           " + format.format(totalRefri)
                + "\nMilkshake             5        R$1,30        " + numMilk + "           " + format.format(totalMilk));

        System.out.println("Total: " + format.format(totalConta));
        System.out.print("Dinheiro: R$ ");
        double dinheiro = scan.nextDouble();
        System.out.println("Troco: R$ " + format.format(dinheiro - totalConta));

    }
}
}