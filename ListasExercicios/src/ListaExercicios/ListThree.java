/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaExercicios;

import java.util.Scanner;

/**
 *
 * @author Raiane Campos
 */
public class ListThree {

    public void exercicio1() {

        /**
         * 1. Descrever programa em java que solicite ao usuÃ¡rio o nÃºmero de
         * horas trabalhadas e o valor da hora de trabalho. Mostre o salÃ¡rio a
         * ser pago em funÃ§Ã£o das horas trabalhadas.
         *
         */
        Scanner entrada = new Scanner(System.in);
        float horas;
        float valorh;
        float pagamento;
        String nome;
        System.out.println("Insira o nome do funcionario:");
        nome = entrada.nextLine();
        System.out.println("Insira o total de horas trabalhadas:");
        horas = entrada.nextFloat();
        System.out.println("Insira o valor de cada hora trabalhada:");
        valorh = entrada.nextFloat();
        pagamento = horas * valorh;
        System.out.println("O salÃ¡rio a ser pago ha " + nome + " Ã©: " + pagamento);

    }

    public void exercicio2() {

        /**
         * 2. Descrever programa em java que solicite ao usuÃ¡rio 5 (cinco)
         * produtos, suas respectivas quantidades, preÃ§os e descontos (se em
         * oferta). Mostrar no final valor total a ser pago.
         *
         */
        Scanner entrada = new Scanner(System.in);

        String produto[] = new String[5];
        float quant[] = new float[5], preco[] = new float[5], desconto[] = new float[5], total[] = new float[5];
        float totalfinal = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Insira o nome do produto:");
            produto[i] = entrada.nextLine();
            System.out.println("Insira a quantidade do produto " + produto[i] + " :");
            quant[i] = entrada.nextFloat();
            System.out.println("Insira o preÃ§o do produto " + produto[i] + " :");
            preco[i] = entrada.nextFloat();
            System.out.println("Insira o descontos em reais do produto " + produto[i] + " :");
            desconto[i] = entrada.nextFloat();
            total[i] = (quant[i] * preco[i]) - desconto[i];
            totalfinal += total[i];
        }

        System.out.println("Voce comprou os seguintes produtos:");
        for (int i = 0; i < 5; i++) {
            System.out.println(quant[i] + "     " + produto[i] + "     " + total[i]);
        }
        System.out.println(" O total da sua compra foi : " + totalfinal);
    }

    public void exercicio3() {

        /**
         * Descrever programa em java que calcule o valor da seguinte equaÃ§Ã£o:
         * 2x + 4/x + 10. Solicitar o valor de x ao usuÃ¡rio e realizar
         * proteÃ§Ã£o para que o calculo da operaÃ§Ã£o seja vÃ¡lido.
         */
        Scanner entrada = new Scanner(System.in);
        float x;
        float resultado;
        System.out.println("Insira um numero:");
        x = entrada.nextFloat();
        resultado = 2 * x + (4 / x) + 10;
        System.out.println("O valor da seguinte equaÃ§Ã£o: 2x + 4/x + 10, "
                + "sendo x igual a " + x + " Ã© :" + resultado);
    }

}
