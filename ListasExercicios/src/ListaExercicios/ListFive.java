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
public class ListFive {

    public void exercicio1() {

        float numero1, numero2;
        char operacao;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escolha sua operação [+ - * / ]: ");
        operacao = entrada.nextLine().charAt(0);

        System.out.print("Entre com o primeiro número: ");
        numero1 = entrada.nextFloat();
        System.out.print("Entre com o segundo número: ");
        numero2 = entrada.nextFloat();
        System.out.println();

        switch (operacao) {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, numero1 + numero2);
                break;

            case '-':
                System.out.printf("%.2f - %.2f = %.2f", numero1, numero2, numero1 - numero2);
                break;

            case '*':
                System.out.printf("%.2f * %.2f = %.2f", numero1, numero2, numero1 * numero2);
                break;

            case '/':
                System.out.printf("%.2f / %.2f = %.2f", numero1, numero2, numero1 / numero2);
                break;

            default:
                System.out.printf("Você digitou uma operação inválida.");

        }

    }

    public void exercicio2() {

        /**
         * 2. Descrever programa em java que solicite ao usuÃ¡rio o nÃºmero de
         * horas trabalhadas e o valor da hora de trabalho. Mostre o salÃ¡rio a
         * ser pago em funÃ§Ã£o das horas trabalhadas.
         *
         * @author Raiane e Gabriel
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
        System.out.println("O salario a ser pago a " + nome + " é : " + pagamento);

    }

    public void exercicio3() {
        /**
         * Descrever programa em java que calcule o valor da seguinte equaÃ§Ã£o:
         * 2x + 4/x + 10. Solicitar o valor de x ao usuÃ¡rio e realizar
         * proteÃ§Ã£o para que o calculo da operaÃ§Ã£o seja vÃ¡lido.
         *
         */

        Scanner entrada = new Scanner(System.in);
        float x;
        float resultado;
        System.out.println("Insira um numero:");
        x = entrada.nextFloat();
        resultado = 2 * x + (4 / x) + 10;
        System.out.println("O valor da seguinte equação: 2x + 4/x + 10, "
                + "sendo x igual a " + x + " é :" + resultado);

    }

    public void exercicio4() {

        /**
         * 4. Descrever programa em java que dado o dia e mês em que o usuário
         * nasceu mostre o seu signo. Descrever a solução abordando pelo menos 4
         * signos, em meses consecutivos. Áries - de 21 de Março a 20 de Abril
         * Touro - de 21 de Abril a 21 de Maio Gêmeos- de 22 de Maio a 21 de
         * Junho Câncer - de 22 de Junho a 23 de Julho
         */
        Scanner entrada = new Scanner(System.in);
        float dia;
        float mes;
        System.out.println("Insira o dia do seu nascimento");
        dia = entrada.nextFloat();
        System.out.println("Insira o numero correspondente ao mes do seu nascimento"
                + " dentre as seguintes opçoes: 03/04/05/06/07");
        mes = entrada.nextFloat();

        if (dia >= 21 && mes == 3) {
            System.out.println("Seu signo e áries");
        }
        if (dia <= 20 && mes == 4) {
            System.out.println("Seu signo e áries");
        }
        if (dia >= 21 && mes == 4) {
            System.out.println("Seu signo e Touro");
        }
        if (dia <= 21 && mes == 5) {
            System.out.println("Seu signo e Touro");
        }
        if (dia >= 22 && mes == 5) {
            System.out.println("Seu signo e Gemeos");
        }
        if (dia <= 21 && mes == 6) {
            System.out.println("Seu signo e Gemeos");
        }
        if (dia >= 22 && mes == 6) {
            System.out.println("Seu signo e Cancer");
        }
        if (dia <= 23 && mes == 7) {
            System.out.println("Seu signo e Cancer");
        }
        if (mes < 3 || mes > 7) {
            System.out.println("Seu signo nao consta no arquivo");
        }

    }

    public void exercicio5() {

        /**
         * 5. Descrever programa em java que solicite ao usuário um número e
         * mostre a tabuada do mesmo juntamente com a tabuada do número
         * seguinte. Exemplo: Se número = 6, mostrar: 6 x 1 = 6, 7 x 1 = 7 6 x
         * 2= 12, 7 x 2 = 14 .... 6 x 10=60, 7 x 10=70
         *
         */
        Scanner entrada = new Scanner(System.in);
        float valor;
        float total0;
        float total1;
        float total2;
        float total3;
        float total4;
        float total5;
        float total6;
        float total7;
        float total8;
        float total9;
        float total10;

        System.out.println("Insira um numero");
        valor = entrada.nextFloat();
        total0 = valor * 0;
        total1 = valor * 1;
        total2 = valor * 2;
        total3 = valor * 3;
        total4 = valor * 4;
        total5 = valor * 5;
        total6 = valor * 6;
        total7 = valor * 7;
        total8 = valor * 8;
        total9 = valor * 9;
        total10 = valor * 10;

        System.out.println("O resultado da equação é: " + valor + " x 0 = " + total0);
        System.out.println("O resultado da equação é: " + valor + " x 1 = " + total1);
        System.out.println("O resultado da equação é: " + valor + " x 2 = " + total2);
        System.out.println("O resultado da equação é: " + valor + " x 3 = " + total3);
        System.out.println("O resultado da equação é: " + valor + " x 4 = " + total4);
        System.out.println("O resultado da equação é: " + valor + " x 5 = " + total5);
        System.out.println("O resultado da equação é: " + valor + " x 6 = " + total6);
        System.out.println("O resultado da equação é: " + valor + " x 7 = " + total7);
        System.out.println("O resultado da equação é: " + valor + " x 8 = " + total8);
        System.out.println("O resultado da equação é: " + valor + " x 9 = " + total9);
        System.out.println("O resultado da equação é: " + valor + " x 10 = " + total10);
    }

    public void exercicio6() {

        /**
         * Descreva programa em java que dadas as coordenadas de dois pontos
         * (x1,y1) e (x2,y2), calcule a distância entre os mesmo. Distância =
         * raiz quadrada ( (x2 – x1) ao quadrado + (y2 – y1) ao quadrado)
         */
        Scanner entrada = new Scanner(System.in);
        float valor1;
        float valor2;
        float valor3;
        float valor4, raizresul;
        System.out.println("Insira o valor x1:");
        valor1 = entrada.nextFloat();
        System.out.println("Insira o valor y1:");
        valor2 = entrada.nextFloat();
        System.out.println("Insira o valor x2:");
        valor3 = entrada.nextFloat();
        System.out.println("Insira o valor y2:");
        valor4 = entrada.nextFloat();
        float equa1;
        float equa2;
        float resul;
        equa1 = (valor1 - valor3) * (valor1 - valor3);
        equa2 = (valor2 - valor4) * (valor2 - valor4);
        resul = equa1 + equa2;
        raizresul = (float) Math.sqrt(resul);
        System.out.println("A distancia é:" + raizresul);
    }

    public void exercicio7() {

        /**
         * 7. Descreva programa em java que solicite ao usuário o valor da
         * mensalidade escolar dos filhos, o valor gasto com transporte e
         * alimentação com os mesmo durante o mês. Calcular quanto o usuário
         * gasta mensalmente com os filhos e durante todo o curso. Considerar
         * que o curso tem duração de três anos. Se o usuário tem mais de um
         * filho matriculado na escolha ele terá um desconto de 5% em cada
         * mensalidade escolar.
         */
        Scanner entrada = new Scanner(System.in);
        float mens, trans, filhos, alim, total, total2, descm;
        System.out.println("Quantos filhos voce tem?");
        filhos = entrada.nextFloat();
        System.out.println("Qual o seu gasto com mensalidade escolar?");
        mens = entrada.nextFloat();
        System.out.println("Qual o seu gasto com transporte do seu filho(s) durante o mês?");
        trans = entrada.nextFloat();
        System.out.println("Qual o seu gasto com alimentação do seu filho(s) durante o mês?");
        alim = entrada.nextFloat();
        total = 36 * (mens + trans + alim);
        descm = (mens * 95) / 100;
        total2 = 36 * filhos * (descm + trans + alim);
        if (filhos == 1) {
            System.out.println("Total gasto durante o curso foi:" + total);
        }
        if (filhos > 1) {
            System.out.println("Total gasto durante o curso foi:" + total2);
        }
    }

    public void exercicio8() {

        /**
         * 8. Descreva programa em java que calcule quanto um usuário irá paga
         * no valor de uma mensalidade escolar. O dia do vencimento da
         * mensalidade é todo dia 10 de cada mês. Se o usuário paga a
         * mensalidade até o dia 05 do mês tem desconto de 10% na mensalidade,
         * caso pague até o dia 09 tem 5% de desconta na mensalidade, do
         * contrário paga o preço normal. Se o dia de pagamento ultrapassar a
         * data de vencimento terá um acréscimo de 5% no valor da mensalidade.
         */
        Scanner entrada = new Scanner(System.in);
        float mens, dia, total, total2, total3, total4;
        System.out.println("Qual o valor da mensalidade escolar?");
        mens = entrada.nextFloat();
        System.out.println("Em que dia foi efetuado o pagamento?");
        dia = entrada.nextFloat();
        total = mens * 0.90f;
        total2 = mens * 0.95f;
        total3 = mens;
        total4 = mens * 1.05f;
        if (dia >= 1 && dia <= 5) {
            System.out.println("O valor a ser pago e : " + total);
        }
        if (dia > 5 && dia <= 9) {
            System.out.println("O valor a ser pago e : " + total2);
        }
        if (dia == 10) {
            System.out.println("O valor a ser pago e : " + total3);
        }
        if (dia > 10) {
            System.out.println("O valor a ser pago e : " + total4);
        }
    }

    public void exercicio9() {

        /**
         * 9. Descreva programa em java que solicite ao usuário o número de
         * computadores a serem adquiridos e seus respectivos valores Solicite
         * também o valor do sistema operacional a ser instalado, além do valor
         * total dos aplicativos a serem instalados. Mostre o valor total a ser
         * pago pela compra realizada.
         */
        Scanner entrada = new Scanner(System.in);
        float pc, vpc, vsist, vaplic, total;
        System.out.println("Qual o número de computadores a serem adquiridos?");
        pc = entrada.nextFloat();
        System.out.println("Qual o valor de cada computador a ser adquirido?");
        vpc = entrada.nextFloat();
        System.out.println("Qual o valor do sistema operacional a ser instalado em cada computador?");
        vsist = entrada.nextFloat();
        System.out.println("Qual o valor total dos aplicativos a serem instalados em cada computador?");
        vaplic = entrada.nextFloat();
        total = pc * (vpc + vsist + vaplic);
        System.out.println("O valor total a ser pago pela compra realizada é: " + total);
    }

    public void exercicio10() {

        /**
         * 10. Descreva programa em java que solicite as 10 notas de alunos e
         * respectivos nomes. Mostre no final qual a maior nota da sala e
         * respectivo aluno.
         */
        Scanner entrada = new Scanner(System.in);
        String nome1, nome2, nome3, nome4, nome5, nome6, nome7, nome8, nome9, nome10;
        float nota1, nota2, nota3, nota4, nota5, nota6, nota7, nota8, nota9, nota10;

        System.out.println("Insira o nome do aluno:");
        nome1 = entrada.nextLine();
        System.out.println("Insira a nota do(a) " + nome1 + " :");
        nota1 = entrada.nextFloat();

        System.out.println("Insira o nome do aluno:");
        nome2 = entrada.nextLine();
        System.out.println("Insira a nota do(a) " + nome2 + " :");
        nota2 = entrada.nextFloat();

        System.out.println("Insira o nome do aluno:");
        nome3 = entrada.nextLine();
        System.out.println("Insira a nota do(a) " + nome3 + " :");
        nota3 = entrada.nextFloat();

        System.out.println("Insira o nome do aluno:");
        nome4 = entrada.nextLine();
        System.out.println("Insira a nota do(a) " + nome4 + " :");
        nota4 = entrada.nextFloat();

        System.out.println("Insira o nome do aluno:");
        nome5 = entrada.nextLine();
        System.out.println("Insira a nota do(a) " + nome5 + " :");
        nota5 = entrada.nextFloat();

        System.out.println("Insira o nome do aluno:");
        nome6 = entrada.nextLine();
        System.out.println("Insira a nota do(a) " + nome6 + " :");
        nota6 = entrada.nextFloat();

        System.out.println("Insira o nome do aluno:");
        nome7 = entrada.nextLine();
        System.out.println("Insira a nota do(a) " + nome7 + " :");
        nota7 = entrada.nextFloat();

        System.out.println("Insira o nome do aluno:");
        nome8 = entrada.nextLine();
        System.out.println("Insira a nota do(a) " + nome8 + " :");
        nota8 = entrada.nextFloat();

        System.out.println("Insira o nome do aluno:");
        nome9 = entrada.nextLine();
        System.out.println("Insira a nota do(a) " + nome9 + " :");
        nota9 = entrada.nextFloat();

        System.out.println("Insira o nome do aluno:");
        nome10 = entrada.nextLine();
        System.out.println("Insira a nota do(a) " + nome10 + " :");
        nota10 = entrada.nextFloat();

        if (nota1 > nota2 && nota1 > nota3 && nota1 > nota4 && nota1 > nota5 && nota1 > nota6 && nota1 > nota7
                && nota1 > nota8 && nota1 > nota9 && nota1 > nota10) {
            System.out.println("Insira a nota do(a) " + nome1 + " e a maior");
        }
        if (nota2 > nota1 && nota2 > nota3 && nota2 > nota4 && nota2 > nota5 && nota2 > nota6 && nota2 > nota7
                && nota2 > nota8 && nota2 > nota9 && nota2 > nota10) {
            System.out.println("Insira a nota do(a) " + nome1 + " e a maior");
        }
        if (nota3 > nota2 && nota3 > nota1 && nota3 > nota4 && nota3 > nota5 && nota3 > nota6 && nota3 > nota7
                && nota3 > nota8 && nota3 > nota9 && nota3 > nota10) {
            System.out.println("Insira a nota do(a) " + nome1 + " e a maior");
        }
        if (nota4 > nota2 && nota4 > nota3 && nota4 > nota1 && nota4 > nota5 && nota4 > nota6 && nota4 > nota7
                && nota4 > nota8 && nota4 > nota9 && nota4 > nota10) {
            System.out.println("Insira a nota do(a) " + nome1 + " e a maior");
        }
        if (nota5 > nota2 && nota5 > nota3 && nota5 > nota4 && nota5 > nota1 && nota5 > nota6 && nota5 > nota7
                && nota5 > nota8 && nota5 > nota9 && nota5 > nota10) {
            System.out.println("Insira a nota do(a) " + nome1 + " e a maior");
        }
        if (nota6 > nota2 && nota6 > nota3 && nota6 > nota4 && nota6 > nota5 && nota6 > nota1 && nota6 > nota7
                && nota6 > nota8 && nota6 > nota9 && nota6 > nota10) {
            System.out.println("Insira a nota do(a) " + nome1 + " e a maior");
        }
        if (nota7 > nota2 && nota7 > nota3 && nota7 > nota4 && nota7 > nota5 && nota7 > nota6 && nota7 > nota1
                && nota7 > nota8 && nota7 > nota9 && nota7 > nota10) {
            System.out.println("Insira a nota do(a) " + nome1 + " e a maior");
        }
        if (nota8 > nota2 && nota8 > nota3 && nota8 > nota4 && nota8 > nota5 && nota8 > nota6 && nota8 > nota7
                && nota8 > nota1 && nota8 > nota9 && nota8 > nota10) {
            System.out.println("Insira a nota do(a) " + nome1 + " e a maior");
        }
        if (nota9 > nota2 && nota9 > nota3 && nota9 > nota4 && nota9 > nota5 && nota9 > nota6 && nota9 > nota7
                && nota9 > nota8 && nota9 > nota1 && nota9 > nota10) {
            System.out.println("Insira a nota do(a) " + nome1 + " e a maior");
        }
        if (nota10 > nota2 && nota10 > nota3 && nota10 > nota4 && nota10 > nota5 && nota10 > nota6 && nota10 > nota7
                && nota10 > nota8 && nota10 > nota9 && nota10 > nota1) {
            System.out.println("Insira a nota do(a) " + nome1 + " e a maior");
        }
    }

    public void exercicio11() {

        /**
         * 11. Descreva programa em java que dado o valor de compra de um
         * produto e valor de venda do mesmo, informe qual o lucro sobre o
         * produto (em %).
         */
        Scanner entrada = new Scanner(System.in);
        float valorc, valorv, lucro, porcl;
        System.out.println("Insira o valor de compra do produto");
        valorc = entrada.nextFloat();
        System.out.println("Insira o valor de venda do produto");
        valorv = entrada.nextFloat();
        lucro = valorv - valorc;
        porcl = (lucro * 100) / valorc;
        System.out.println("O lucro foi de " + porcl + "%");
    }

    public void exercicio12() {
        /**
         * 12. Descreva programa em java que dado o valor de um produto e o
         * lucro sobre o mesmo, calcule o valor de venda do mesmo.
         */
        Scanner entrada = new Scanner(System.in);
        float valorc, valorv, lucro, porcl;
        System.out.println("Insira o valor de compra do produto:");
        valorc = entrada.nextFloat();
        System.out.println("Insira o lucro que voce deseja obter sobre ele em %:");
        porcl = entrada.nextFloat();
        lucro = valorc * (porcl / 100);
        valorv = valorc + lucro;
        System.out.println("O valor de venda do produto é :" + valorv);
    }

    public void exercicio13() {

        /**
         * 13. Descreva programa em java que dado o valor de um produto
         * adquirido a prazo, o número de total de parcelas e o ajuste anual,
         * mostre o valor a ser pago em cada parcela até o final do pagamento.
         */
        Scanner entrada = new Scanner(System.in);
        float valor, ajuste, nparcelas, parcelas, porc;
        System.out.println("Insira o valor do produto:");
        valor = entrada.nextFloat();
        System.out.println("Insira o número de total de parcelas:");
        nparcelas = entrada.nextFloat();
        System.out.println("Insira o ajuste anual das parcelas em % :");
        ajuste = entrada.nextFloat();
        if (nparcelas <= 12) {
            parcelas = valor / nparcelas;
            System.out.println("O valor das parcelas é :" + parcelas);
        }
        if (nparcelas > 12) {
            porc = (nparcelas / 12f) * (ajuste / 100f) * valor;
            parcelas = (valor + porc) / nparcelas;
            System.out.println("O valor das parcelas é :" + parcelas);
        }
    }

    public void exercicio14() {

        /**
         * 14. Descreva programa em java para calcular a área de um triângulo,
         * dados sua base e altura.
         */
        Scanner entrada = new Scanner(System.in);
        float alt, base, area;
        System.out.println("Insira a altura do triangulo");
        alt = entrada.nextFloat();
        System.out.println("Insira o valor da base do triangulo");
        base = entrada.nextFloat();
        area = (base * alt) / 2f;
        System.out.println("a area e igual a " + area + "m²");
    }

    public void exercicio15() {

        /**
         * 15. Descreva programa em java para calcular o salário de um
         * funcionário. Considerar que o mesmo trabalha 30 dias por mês e 8
         * horas por dia. No entanto o funcionário pode realizar horas extras,
         * neste caso solicite o número de total de horas extras realizadas no
         * mês. Considerar que as horas extras valem 50% a mais do que as horas
         * trabalhadas normalmente.
         */
        Scanner entrada = new Scanner(System.in);
        float valor, horas, salario;
        System.out.println("Insira o valor das horas trabalhadas:");
        valor = entrada.nextFloat();
        System.out.println("Insira o total de horas extras realizadas este mes:");
        horas = entrada.nextFloat();
        salario = (valor * 30 * 8) + (horas * valor * 1.5f);
        System.out.println("O salario a ser pago é:" + salario);
    }

    public void exercicio16() {

        /**
         * 16. Descreva programa em java que dado o lados de um terreno qualquer
         * (formato retangular), calcule o perímetro e área do mesmo.
         */
        Scanner entrada = new Scanner(System.in);
        float num1;
        float num2;
        float num3;
        float num4;
        float perimetro;
        System.out.println("Insira a primeira medida");
        num1 = entrada.nextFloat();
        System.out.println("Insira a segunda medida");
        num2 = entrada.nextFloat();
        System.out.println("Insira a terceira medida");
        num3 = entrada.nextFloat();
        System.out.println("Insira a Quarta medida");
        num4 = entrada.nextFloat();
        perimetro = num1 + num2 + num3 + num4;
        System.out.println("o perimetro é " + perimetro);
    }

    public void exercicio17() {

        /**
         * 17. Descreva programa em java que solicite ao usuário quantos anos já
         * trabalhou em uma determinada empresa, em seguida calcule o número de
         * horas que o mesmo dedicou a empresa. Considerar que o usuário
         * trabalhou 8 horas por dia, durante cada ano trabalhado.
         */
        Scanner entrada = new Scanner(System.in);
        float anos;
        float horas;
        System.out.println("Insira a quantidade de anos trabalhado:");
        anos = entrada.nextFloat();
        horas = anos * 365 * 8;
        System.out.println("A quantidade de horas trabalhadas é " + horas);
    }

    public void exercicio18() {

        /**
         * 18. Descreva programa em java que solicite ao usuário um número de 0
         * até 10 (entrada de um nota de avaliação escolar). Caso a nota dada
         * esteja fora do limite estabelecido enviar uma mensagem: número
         * inválido.
         *
         *
         */
        Scanner entrada = new Scanner(System.in);
        float num;
        float i;
        System.out.println("Insira um numero entre 0 e 10");
        num = entrada.nextFloat();
        if (num >= 0 && num <= 10) {
            System.out.println("Nota valida");
        } else {
            System.out.println("Nota invalida");
        }
    }

}
