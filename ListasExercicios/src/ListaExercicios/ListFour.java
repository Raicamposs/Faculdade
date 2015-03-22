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
public class ListFour {

    public void exercicio1() {
        /* 01 - Escreva um programa que imprima o resultado das expressões abaixo:
         • 3 – 2 – 1 + 2 + 1 + 3
         • 2 x 3 – 4 x 5
         • 2 + 6 – 3 / 7 x 9
         • 3 % 4 –8
         */
        double exp1 = (3 - 2 - 1 + 2 + 1 + 3);
        double exp2 = (2 * 3) - (4 * 5);
        double exp3 = ((2 + 6 - 3) / (7 * 9f));
        double exp4 = (3 / 4f) - 8;

        System.out.println("3 – 2 – 1 + 2 + 1 + 3 = " + exp1
                + "\n2 x 3 – 4 x 5 = " + exp2
                + "\n2 + 6 – 3 / 7 x 9 = " + exp3
                + "\n3 % 4 – 8 = " + exp4);
    }

    public void exercicio2() {

        /*  02 - Escreva um programa que declare, inicialize e imprima as seguintes
         variáveis:
         • Inteiro i de 32 bits com valor 1
         • Inteiro j de 64 bits com valor 2
         • Ponto-flutuante p de 32 bits com valor 20.0
         • Ponto-flutuante q de 64 bits com valor 30.0
         • Boolean b com valor verdadeiro
         • Caracter c com valor ‘k’
         */
        int i = 1;
        long j = 2;
        float p = 20;
        double q = 30;
        boolean b = true;
        String k = "k";

        System.out.println("i = " + i
                + "\nj = " + j
                + "\np = " + p
                + "\nq = " + q
                + "\nb = " + b
                + "\nk = " + k);
    }

    public void exercicio3() {
        /**
         * 03 - Implemente um programa que recebe um número de 1 a 7 e imprime o
         * dia da semana correspondente.
         *
         * @author Gara
         */

        int num;

        Scanner s = new Scanner(System.in);

        System.out.println("Insira o numero equivalente ao dia da semana desejado");
        num = s.nextInt();

        if (num == 2) {
            System.out.println("Segunda");
        } else if (num == 3) {
            System.out.println("Terça");
        } else if (num == 4) {
            System.out.println("Quarta");
        } else if (num == 5) {
            System.out.println("Quinta");
        } else if (num == 6) {
            System.out.println("Sexta");
        } else if (num == 6) {
            System.out.println("Sabado");
        } else if (num == 1) {
            System.out.println("Domingo");
        }

    }

    public void exercicio4() {
        /**
         * 04 - Altere o programa do exercício anterior para ficar recebendo o
         * número dentro de um laço enquanto o número for diferente de 0 (zero).
         */

        int num = 10;

        Scanner s = new Scanner(System.in);

        while (num != 0) {

            System.out.println("Insira o numero equivalente ao dia da semana desejado");
            num = s.nextInt();
            if (num == 2) {
                System.out.println("Segunda");
            } else if (num == 3) {
                System.out.println("Terça");
            } else if (num == 4) {
                System.out.println("Quarta");
            } else if (num == 5) {
                System.out.println("Quinta");
            } else if (num == 6) {
                System.out.println("Sexta");
            } else if (num == 6) {
                System.out.println("Sabado");
            } else if (num == 1) {
                System.out.println("Domingo");
            }

        }
    }

    public void exercicio5() {

        /**
         * 05 - Implemente um programa que recebe repetidamente um número de 1 a
         * 12, enquanto esse número for diferente de 0 (zero), e imprime o mês
         * correspondente. Quando o número estiver fora do intervalo permitido,
         * a mensagem “mês inválido” deverá ser exibida.
         */
        int num = 9;

        Scanner s = new Scanner(System.in);

        while (num != 0) {

            System.out.println("Insira o numero equivalente ao Mês desejado");
            num = s.nextInt();
            if (num == 2) {
                System.out.println("Fevereiro");
            } else if (num == 3) {
                System.out.println("Março");
            } else if (num == 4) {
                System.out.println("Abril");
            } else if (num == 5) {
                System.out.println("Maio");
            } else if (num == 6) {
                System.out.println("Junho");
            } else if (num == 7) {
                System.out.println("Julho");
            } else if (num == 1) {
                System.out.println("Janeiro");
                if (num == 8) {
                    System.out.println("Agostro");
                } else if (num == 9) {
                    System.out.println("Setembro");
                } else if (num == 10) {
                    System.out.println("Outubro");
                } else if (num == 11) {
                    System.out.println("Novembro");
                } else if (num == 12) {
                    System.out.println("Dezembro");
                }
            } else if (num > 12 || num < 0) {
                System.out.println("Mês inválido");
            }

        }
    }

    public void exercicio6() {
        /*
         * 06 - Escreva um laço while que execute 20 vezes, imprimindo o valor da
         variável x que inicialmente está com valor 10. Converta este laço para um do - while
         .
         */

        boolean continuar = true;
        int x = 10, opcao;
        Scanner entrada = new Scanner(System.in);
        do {

            x = x + 1;
            System.out.println(x);

            if (x == 30) {

                System.out.println("Deseja finalizar o programa.");
                System.out.println("0 - finalizar.");
                System.out.println("1 - continuar.");
                opcao = entrada.nextInt();

                if (opcao == 0) {
                    continuar = false;
                    System.out.println("Programa finalizado.");
                }
            }
        } while (continuar);

    }

    public void exercicio7() {
        /*
         * 07 - Escreva um programa que imprima na tela a soma dos números ímpares
         entre 1 e 30 e a multiplicação dos números pares entre 1 e 30.
         */

        int totalm = 1, totals = 1, div, x = 1;

        while (x < 31) {
            x = x + 1;
            div = x / 2;
            if (x % 2 != 0) {
                totals = (totals + x);
            } else {
                totalm = (totalm * x);
            }
        }

        System.out.println("A soma dos números ímpares entre 1 e 30 é: " + "\n" + totals);
        System.out.println("A multiplicacao dos números pares entre 1 e 30 é: " + "\n" + totalm);

    }

    public void exercicio8() {

        /**
         * 8- Escreva um programa em Java que leia repetidamente um número do
         * teclado até que seja digitado o número zero (0) e determine se o
         * número lido é perfeito ou não, imprimindo o resultado. Um número é
         * dito perfeito quando é igual a soma dos seus divisores menores do que
         * ele, por exemplo, 6 é perfeito, uma vez que 6 = 3 + 2 + 1.
         */
        Scanner s = new Scanner(System.in);
        int n, smDivisores;
        String divisores;

        do {
            System.out.println("\nInsira um numero para continuar ou 0 para sair:");
            n = s.nextInt();
            smDivisores = 0;

            divisores = "";

            for (int divisor = 1; divisor <= (n / 2); divisor++) {
                if ((n % divisor) == 0) {
                    smDivisores += divisor;
                    if (divisores.length() > 0) {
                        divisores += (" + " + divisor);
                    } else {
                        divisores = ("= " + divisor);
                    }
                }
            }

            if (n == smDivisores && n != 0) {
                System.out.println(" É um numero perfeito !");
                System.out.printf("%3d %s\n", n, divisores);
            } else if (n == 0) {
                System.out.println(" Finalizando o programa! ");
            } else {
                System.out.println(" Este numero não é perfeito ! ");
            }
        } while (n != 0);

    }

    public void exercicio9() {

        /**
         * 9– Faça um programa que contenha um menu com 4 opções: 1 – calcular o
         * fatorial de um número dado 2 – calcular a raiz quadrada de 3 números
         * dados 3 – imprimir a tabuada completa de 1 a 10 4 – sair do programa
         */
        int num, n;
        long fatorial = 1;
        Scanner s = new Scanner(System.in);

        do {

            System.out.println("\n Selecione uma opçao:\n"
                    + "1 – calcular o fatorial  de um número \n"
                    + "2 – calcular a raiz quadrada de 3 numeros \n"
                    + "3 – Visualizar a tabuada completa de 1 a 10\n"
                    + "4 – sair do programa");
            num = s.nextInt();

            if (num == 1) {
                System.out.println("Insira um numero entre 1 e 20 :");
                int x = s.nextInt();

                if (x > 0 && x < 21) {
                    for (n = 1; n <= x; n++) {
                        fatorial = fatorial * n;
                        System.out.println("O fatorial de " + n + " é (" + (n - 1) + "!) * " + n
                                + " = " + fatorial);
                    }
                } else {
                    System.out.println("Opçao Invalida !");
                }
            } else if (num == 2) {
                for (n = 1; n <= 3; n++) {
                    System.out.println("\n Insira o " + n + "º numero");
                    float x = s.nextFloat();
                    float raizresul = (float) Math.sqrt(x);
                    System.out.println(" A raiz quadradada de " + x + " é: " + raizresul);
                }
            } else if (num == 3) {
                for (n = 1; n <= 10; n++) {
                    System.out.println(n + " x 1 = " + (n * 1));
                    System.out.println(n + " x 2 = " + (n * 2));
                    System.out.println(n + " x 3 = " + (n * 3));
                    System.out.println(n + " x 4 = " + (n * 4));
                    System.out.println(n + " x 5 = " + (n * 5));
                    System.out.println(n + " x 6 = " + (n * 6));
                    System.out.println(n + " x 7 = " + (n * 7));
                    System.out.println(n + " x 8 = " + (n * 8));
                    System.out.println(n + " x 9 = " + (n * 9));

                }

            } else {
                if (num == 4) {
                    System.out.println("Programa Finalizado! ");
                } else {
                    System.out.println("Opção Invalida! ");
                }
            }
        } while (num != 4);
    }

    public void exercicio10() {

        /**
         * 10 - Escreva quatro instruções em Java diferentes para adicionar 1 a
         * uma variável inteira x
         */
        for (int x = 0; x < 10; ++x) {
            System.out.println("X=" + x);
        }
        for (int i = 10; i < 30; i = i + 1) {
            System.out.println("i=" + i);
        }
        for (int j = 30; j < 40; j += 1) {
            System.out.println("j=" + j);
        }
        for (int k = 40; k <= 50; k++) {
            System.out.println("k=" + k);
        }
    }

    public void exercicio11() {

        /**
         * 11- Escreva instruções Java para realizar a seguinte tarefa: atribuir
         * soma de x e y a z e incrementar x por 1 depois do calculo. Use
         * somente uma instrução;
         */
        int y = 10, z;
        for (int x = 1; x < 10; ++x) {
            z = y + x;
            System.out.println("Z= " + y + " + " + x + " = " + z);
        }
    }

    public void exercicio12() {

        /**
         * 12 - Escreva instruções Java para realizar a seguinte tarefa:
         * decrementar a variável x por 1, depois subtrair o resultado da
         * variável total com somente uma instrução.
         */
        int y = 10, z;
        for (int x = 10; x > 1; --x) {
            z = y - x;
            System.out.println("Z= " + y + " - " + x + " = " + z);
        }
    }

    public void exercicio13() {

        /**
         * 13 - Implemente um programa para calcular a área de um trapézio,
         * onde: h = altura b = base menor B = base maior Área = (h.(b+B))/2
         */
        Scanner entrada = new Scanner(System.in);
        float h, b, B, area;
        System.out.println("Insira a altura do trapézio:");
        h = entrada.nextFloat();
        System.out.println("Insira o valor da base menor do trapézio:");
        b = entrada.nextFloat();
        System.out.println("Insira o valor da base maior do trapézio:");
        B = entrada.nextFloat();
        area = ((b + B) * h) / 2f;
        System.out.println("A Área do trapézio é igual a : " + area + " m²");
    }

    public void exercicio14() {

        /**
         * 14- Fulano aplicou R$ 100,00 com rendimento de 5% ao mês. Quantos
         * meses serão necessários para o capital investido ultrapasse a R$
         * 200,00. Desenvolva um programa que realize essa operação.
         */
        float apli = 100;
        int meses = 0;

        while (apli <= 200f) {

            apli = apli * 1.05f;

            meses = meses + 1;

        }

        System.out.println("Foram necessários " + meses + " meses para atingir R$  " + apli);
    }

    public void exercicio15() {
        /**
         * 15 – Faça um programa que imprima os quadrados dos números inteiros
         * ímpares entre 15 e 35.
         */

        for (int x = 16; x < 34; x++) {

            if (x % 2 == 1) {
                System.out.println(x + "² = " + (x * x));
            }
        }
    }

    public void exercicio16() {
        /**
         * 16 - Escreva um aplicativo que imprime as seguintes formas. Você pode
         * utilizar instruções de saída que imprimem um único asterisco (*), um
         * único caractere de espaço ou uma nova linha. Maximize a utilização de
         * estruturas de repetição(com estruturas aninhadas for) e minimize o
         * número de instruções de saída. ** ** *** **** ***** ****** *******
         * ******* ****** ***** **** *** ** *
         *         
********
         *******
         ******
         *****
         ****
         ***
         **
         *
         *
         **
         ***
         ****
         *****
         ******
         *******
         ********
         *
         */

        for (int i = 0; i < 9; i++) {
            System.out.print("\n");
            for (int m = 0; m < (i + 1); m++) {
                if (m != i) {
                    System.out.print("*");
                    if (m == 7) {
                        for (int j = 0; j < 9; j++) {
                            System.out.print("\n");
                            for (int l = 9; l > (j - 1); l--) {
                                if (j != l) {
                                    System.out.print("*");
                                }
                            }
                        }
                    }
                }

            }
        }

        for (int i = 0; i < 9; i++) {
            System.out.print("\n");
            for (int m = 9; m > (i - 1); m--) {

                if (m == (i + 1)) {
                    for (int j = 0; j > 9; j++) {
                        System.out.print("\n");
                        for (int l = 0; l < (j + 1); l++) {
                            if (l != i) {
                                System.out.print("*");
                            }
                        }
                    }
                }
                if (m != i) {
                    System.out.print("*");
                }
            }
        }
    }


}
