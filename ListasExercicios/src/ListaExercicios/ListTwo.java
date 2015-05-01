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
public class ListTwo {

    public void exercicio1() {
        int num[] = new int[10];
        for (int i = 1; i <= 10; i++) {
            System.out.println("Quadrado de" + num[i] + "=" + (num[i] * num[i]));
        }
    }

    public void exercicio2() {

        int soma = 0, n;
        Scanner s = new Scanner(System.in);
        System.out.println("insira um numero inteiro:");
        n = s.nextInt();
        for (int i = 0; i <= n; i++) {
            soma = soma + i;
        }
        System.out.println("A soma e igual:" + soma);
    }

    public void exercicio3() {

        double n;
        double maior = 0, menor = 100;
        double[] vet = new double[10];

        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("insira um nota:");
            n = s.nextDouble();
            vet[i] = n;
        }
        System.out.println("Os resultados sao:");

        for (int i = 0; i < 10; i++) {
            if (vet[i] > maior && vet[i] <= 100) {
                maior = vet[i];
            }
            if (vet[i] < menor && vet[i] >= 0) {
                menor = vet[i];
            }
        }

        System.out.println(" A maior nota e: " + maior);
        System.out.println(" A menor nota e: " + menor);

    }

    public void exercicio4() {

//Dado um número natural na base binária, transformá-lo para a base decimal.
//Exemplo:
//Dado 10010 a saída será 18, pois 1. 2 4 + 0. 2 3 + 0. 2 2 + 1. 2 1 + 0. 2 0 = 18.
        int num, pot2, resul;

        Scanner s = new Scanner(System.in);
        System.out.println("Digite o numero a ser transformado da base 2 para a base 10: ");
        num = s.nextInt();

        resul = 0;
        pot2 = 1;

        System.out.println(num + " na base 10 é: ");

        while (num != 0) {
            resul = resul + num % 10 * pot2;
            num = num / 10;
            pot2 = pot2 * 2;
        }
        System.out.println(resul);
    }

    public void exercicio5() {
        /*
         * Dado um número natural na base decimal, transformá-lo para a base binária.
         * and open the template in the editor.
         */

        int num, resul;

        Scanner s = new Scanner(System.in);
        System.out.println("Digite o numero a ser transformado da base 10 para a base 2: ");
        num = s.nextInt();

        System.out.println(num + " na base 2 é: ");

        while (num != 0) {

            num = num / 2;
            System.out.print(num % 2);
        }

    }

    public void exercicio6() {

        // Dados três números, imprimi-los em ordem crescente.
        int n1, n2, n3;
        Scanner s = new Scanner(System.in);

        System.out.println("insira um numero:");
        n1 = s.nextInt();
        System.out.println("insira um numero:");
        n2 = s.nextInt();
        System.out.println("insira um numero:");
        n3 = s.nextInt();

        if (n1 >= n2 && n1 >= n3 && n2 >= n3) {
            System.out.println("Em ordem crescente: " + n3 + "," + n2 + "," + n1);
        } else if (n1 >= n2 && n1 >= n3 && n3 >= n2) {
            System.out.println("Em ordem crescente: " + n3 + "," + n2 + "," + n1);
        } else if (n2 >= n1 && n2 >= n3 && n1 >= n3) {
            System.out.println("Em ordem crescente: " + n3 + "," + n1 + "," + n2);
        } else if (n2 >= n1 && n2 >= n3 && n3 >= n1) {
            System.out.println("Em ordem crescente: " + n1 + "," + n3 + "," + n2);
        } else if (n3 >= n1 && n3 >= n3 && n1 >= n2) {
            System.out.println("Em ordem crescente: " + n2 + "," + n1 + "," + n3);
        } else if (n3 >= n1 && n3 >= n3 && n2 >= n1) {
            System.out.println("Em ordem crescente: " + n1 + "," + n2 + "," + n3);
        }
    }

    public void exercicio7() {
        //Dado um natural n, determine o número harmônico Hn definido por:
        float soma = 0;
        int i, n;

        Scanner s = new Scanner(System.in);
        System.out.println("Entre com o valor de n>0: ");
        n = s.nextInt();

        i = 1;
        while (i <= n) {

            soma = soma + (1f / i);
            i++;
        }

        System.out.println("o número harmonico H" + n + " = " + soma);
    }

    public void exercicio8() {

        /**
         * Os pontos (x,y) que pertencem à figura H (abaixo) são tais que x > 0,
         * y > 0 e x2 + y2 < 1. Dados um ponto real (x,y), verifique se ele
         * pertence ou não a H.
         */
        Float x, y;
        Scanner s = new Scanner(System.in);

        System.out.println("insira o valor de x:");
        x = s.nextFloat();
        System.out.println("insira o valor de y:");
        y = s.nextFloat();

        Float eq = (x * x) + (y * y);

        if (x >= 0 || y >= 0) {

            if (eq <= 1) {
                System.out.println("Pertence a H.");
            } else {
                System.out.println(" Não pertence a H");

            }
        } else {
            System.out.println(" Não pertence a H");
        }
    }

    public void exercicio9() {

        /**
         * Dada uma matriz Amxn apresentar na tela a matriz transposta.
         */
        int[][] matriz = new int[3][3];

        Scanner entrada = new Scanner(System.in);
        System.out.println("Matriz M[3][3]\n");

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.printf("Insira o elemento M[%d][%d]: ", linha + 1, coluna + 1);
                matriz[linha][coluna] = entrada.nextInt();
            }
        }

        System.out.println("\nA Matriz ficou: \n");
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.printf("\t %d \t", matriz[linha][coluna]);
            }

            System.out.println();
        }

        System.out.println("\nA Matriz transposta ficou: \n");
        for (int coluna = 0; coluna < 3; coluna++) {
            for (int linha = 0; linha < 3; linha++) {
                System.out.printf("\t %d \t", matriz[linha][coluna]);
            }

            System.out.println();
        }

    }

    public void exercicio10() {

        /**
         * Dada uma matriz real Amxn, verificar se existem elementos repetidos
         * em A.
         */
        int cont = 0;
        int[][] A = new int[3][3];
        int[] elem = new int[9];
        Scanner entrada = new Scanner(System.in);
        System.out.println("Matriz A[3][3]\n");

        for (int m = 0; m < 3; m++) {
            for (int n = 0; n < 3; n++) {
                System.out.printf("Insira o elemento M[%d][%d]: ", m + 1, n + 1);
                A[m][n] = entrada.nextInt();
            }
        }

        System.out.println("\nA Matriz ficou: \n");
        for (int m = 0; m < 3; m++) {
            for (int n = 0; n < 3; n++) {
                System.out.printf("\t %d \t", A[m][n]);

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (m != i && n != j) {
                            if (A[m][n] == A[i][j]) {
                                cont = cont + 1;
                            }
                        }

                    }

                }
            }
            System.out.println();

        }
        //System.out.println(cont);
        if (cont != 0) {
            System.out.println("\nA matriz possui elementos iguais!");
        }
        if (cont == 0) {
            System.out.println("\nA matriz não possui elementos iguais!");
        }
    }

    public void exercicio11() {

        /**
         * Para n alunos de uma determinada classe são dadas as 3 notas das
         * provas. Calcular a média aritmética das provas de cada aluno, a média
         * da classe, o número de aprovados e o número de reprovados (critério
         * de aprovação: média maior ou igual a cinco).
         */
        int n;
        float[][] matriz;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o numero de alunos da classe:");
        n = entrada.nextInt();

        matriz = new float[n][3];
        float[] media = new float[n];
        float mediatotal, soma = 0;
        int aprovados = 0, reprovados = 0;
        for (int linha = 0; linha < n; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.println("Insira a nota " + (coluna + 1) + " do aluno " + (linha + 1));
                matriz[linha][coluna] = entrada.nextFloat();
            }
        }

        for (int i = 0; i < n; i++) {
            media[i] = ((matriz[i][0] + matriz[i][1] + matriz[i][2]) / 3f);
            System.out.println("A media do aluno " + (i + 1) + " é: " + media[i]);
            soma = (soma + media[i]);

            if (media[i] < 5) {
                reprovados = (reprovados + 1);
            }
            if (media[i] >= 5) {
                aprovados = (aprovados + 1);
            }

        }
        mediatotal = soma / n;

        System.out.println("\nA média da classe é : " + mediatotal);
        System.out.println("\nNumero de alunos \naprovados:" + aprovados + "\nreprovados:" + reprovados);
    }

    public void exercicio12() {

        /**
         * Dado um inteiro positivo n, calcular e imprimir o valor da seguinte
         * soma:
         *
         */
        int i, j;
        Scanner s = new Scanner(System.in);
        float resul, div = 0;

        System.out.println("insira um numero:");
        int n = s.nextInt();

        for (i = 2; i <= n; i++) {
            j = 1;
            j++;
            div = div + (i / (n - j));
        }

        resul = div + (1f / n);
        System.out.println("O resultado é:" + resul);

    }

    public void exercicio13() {

        /**
         * Escreva um algoritmo que, dadas a data atual e a data de nascimento
         * de uma pessoa, determine quantos anos completos tem a pessoa.
         */
        int d1, d2, m1, m2, a1, a2;

        Scanner s = new Scanner(System.in);

        System.out.println("insira o dia do seu nascimento:");
        d1 = s.nextInt();
        System.out.println("insira o mes do seu nascimento");
        m1 = s.nextInt();
        System.out.println("insira o ano do seu nascimento:");
        a1 = s.nextInt();
        System.out.println("insira o dia atual:");
        d2 = s.nextInt();
        System.out.println("insira o mes atual:");
        m2 = s.nextInt();
        System.out.println("insira o ano atual:");
        a2 = s.nextInt();

        int idade = a2 - a1;
        int idade1 = (a2 - a1) - 1;

        if (m2 < m1) {
            System.out.println("Sua idade é: " + idade1);
        }
        if (m1 == m2) {
            if (d2 < d1) {
                System.out.println("Sua idade é: " + idade1);
            } else {
                System.out.println("Sua idade é: " + idade);
            }
        } else {
            System.out.println("Sua idade é: " + idade);
        }

    }

    public void exercicio14() {

        /**
         * Escreva um algoritmo para ler 50 números naturais e determinar
         * quantos deles são números impares.
         */
        double[] vet = new double[50];
        int n = 0;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 50; i++) {
            System.out.println("insira um numero:");
            vet[i] = s.nextDouble();
        }

        for (int i = 0; i < 50; i++) {
            if ((vet[i] % 2) == 1) {
                n = n + 1;
            }
        }
        System.out.println("quantidade de números impares inseridos: " + n);
    }

    public void exercicio15() {

        /**
         * Um número é primo se ele não tem divisores, exceto 1 e ele próprio.
         * Dado um inteiro positivo n, verificar se n é primo.
         */
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("insira um numero inteiro com no maximo 4 digitos:");
        n = s.nextInt();

        boolean ehPrimo = true;

        int i = 2;
        while ((ehPrimo == true) && (i <= (n / 2))) {
            if ((n % i) == 0) {
                ehPrimo = false;
            } else {
                i++;
            }
        }

        if (ehPrimo == true) {
            System.out.println(n + " é um numero primo.");
        } else {
            System.out.println(n + " nao é um numero primo.");
        }
    }

    public void exercicio16() {

        /**
         * Escreva um algoritmo para calcular a soma da série abaixo com 100
         * termos: 1 − 2 + 3 − 8 + 5 − 16 + 7 − 32 + 9 − 64 + . . .
         */
        int[] num = new int[100];
        int a = 0, b = 0, total;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 100; i++) {
            System.out.println("insira um numero:");
            num[i] = s.nextInt();

            if ((i % 2) == 0) {
                a = a + num[i];
            }
            if ((i % 2) == 1) {
                b = b + num[i];
            }
        }
        total = a - b;
        System.out.println("O resuntado da serie é: " + total);
    }

    public void exercicio17() {
        /*     
         * Dada uma seqüência de n números, imprimi-la na ordem inversa à da leitura.
         */
        int[] vet = new int[5];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("insira um numero:");
            vet[i] = s.nextInt();

            if (i == 4) {
                System.out.println("Os numeros na ordem inversa sao:");
                for (i = 4; i >= 0; i--) {
                    System.out.println(vet[i]);
                }
                break;
            }
        }
    }


}
