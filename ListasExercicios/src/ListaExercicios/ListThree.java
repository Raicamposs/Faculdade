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
        
        String produto1, produto2, produto3, produto4, produto5;
        float quant1, quant2, quant3, quant4, quant5;
        float preco1, preco2, preco3, preco4, preco5;
        float desconto1, desconto2, desconto3, desconto4, desconto5;
        float total1, total2, total3, total4, total5, totalfinal;

        System.out.println("Insira o nome do produto:");
        produto1 = entrada.nextLine();
        System.out.println("Insira a quantidade do produto " + produto1 + " :");
        quant1 = entrada.nextFloat();
        System.out.println("Insira o preÃ§o do produto " + produto1 + " :");
        preco1 = entrada.nextFloat();
        System.out.println("Insira o descontos em reais do produto " + produto1 + " :");
        desconto1 = entrada.nextFloat();
        System.out.println("Insira o nome do produto:");
        produto2 = entrada.nextLine();
        System.out.println("Insira a quantidade do produto " + produto2 + " :");
        quant2 = entrada.nextFloat();
        System.out.println("Insira o preÃ§o do produto " + produto2 + " :");
        preco2 = entrada.nextFloat();
        System.out.println("Insira o descontos em reais do produto " + produto2 + " :");
        desconto2 = entrada.nextFloat();
        System.out.println("Insira o nome do produto:");
        produto3 = entrada.nextLine();
        System.out.println("Insira a quantidade do produto " + produto3 + " :");
        quant3 = entrada.nextFloat();
        System.out.println("Insira o preÃ§o do produto " + produto3 + " :");
        preco3 = entrada.nextFloat();
        System.out.println("Insira o descontos em reais do produto " + produto3 + " :");
        desconto3 = entrada.nextFloat();
        System.out.println("Insira o nome do produto:");
        produto4 = entrada.nextLine();
        System.out.println("Insira a quantidade do produto " + produto4 + " :");
        quant4 = entrada.nextFloat();
        System.out.println("Insira o preÃ§o do produto " + produto4 + " :");
        preco4 = entrada.nextFloat();
        System.out.println("Insira o descontos em reais do produto " + produto4 + " :");
        desconto4 = entrada.nextFloat();
        System.out.println("Insira o nome do produto:");
        produto5 = entrada.nextLine();
        System.out.println("Insira a quantidade do produto " + produto5 + " :");
        quant5 = entrada.nextFloat();
        System.out.println("Insira o preÃ§o do produto " + produto5 + " :");
        preco5 = entrada.nextFloat();
        System.out.println("Insira o descontos em reais do produto " + produto5 + " :");
        desconto5 = entrada.nextFloat();
        total1 = (quant1 * preco1) - desconto1;
        total2 = (quant2 * preco2) - desconto2;
        total3 = (quant3 * preco3) - desconto3;
        total4 = (quant4 * preco4) - desconto4;
        total5 = (quant5 * preco5) - desconto5;
        System.out.println("Voce comprou os seguintes produtos:");
        System.out.println(quant1 + produto1 + total1);
        System.out.println(quant2 + produto2 + total2);
        System.out.println(quant3 + produto3 + total3);
        System.out.println(quant4 + produto4 + total4);
        System.out.println(quant5 + produto5 + total5);
        totalfinal = total1 + total2 + total3 + total4 + total5;
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
