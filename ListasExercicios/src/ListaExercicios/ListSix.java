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
public class ListSix {

    public void exercicio1() {

        int i, quad;
        int[] n = new int[10];

        Scanner s = new Scanner(System.in);
        for (i = 0; i < 10; i++) {
            System.out.println("insira um numero:");
            n[i] = s.nextInt();
        }
        System.out.println("Os resultados sao:");
        for (i = 0; i < 10; i++) {
            quad = n[i] * n[i];
            System.out.println(n[i] + "²=" + quad);
        }

    }

    public void exercicio2() {

        int num1, soma = 0, n;

        Scanner s = new Scanner(System.in);
        System.out.println("insira um numero inteiro:");
        n = s.nextInt();

        for (int i = 0; i <= n; i++) {

            soma = soma + i;

        }

        System.out.println("A soma é igual a:\n" + soma);

    }

    public void exercicio3() {

        double maior = 0, menor = 100;
        double[] vet = new double[10];
        int n;

        Scanner s = new Scanner(System.in);

        System.out.println("Ha quantos alunos na turma?");
        n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Insira a nota do aluno " + (i + 1) + " :");
            vet[i] = s.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            if (vet[i] < menor && vet[i] >= 0) {
                menor = vet[i];
            }
            if (vet[i] > maior && vet[i] <= 100) {
                maior = vet[i];
            }

        }

        System.out.println("\nA maior nota da turma é: " + maior + " e a menor nota é: " + menor);

    }

    public void exercicio4() {

        int n;
        long fatorial = 1;
        Scanner s = new Scanner(System.in);

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

    }

    public void exercicio5() {

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

    public void exercicio6() {

        int num,
                bin,
                aux,
                dig,
                pot;

        Scanner s = new Scanner(System.in);

        System.out.println("Digite um numero natural: ");
        num = s.nextInt();
        aux = num;
        bin = 0;
        pot = 1;

        while (aux > 0) {
            dig = aux % 2;
            aux = aux / 2;
            bin = bin + dig * pot;
            pot = pot * 10;
        }
        System.out.println("O numero " + num + " escrito na base binaria:" + bin);

    }

    public void exercicio7() {

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

    public void exercicio8() {

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

    public void exercicio9() {

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

    public void exercicio10() {

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

    public void exercicio11() {

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

    public void exercicio12() {

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

    public void exercicio13() {

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

    public void exercicio14() {

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

    public void exercicio15() {

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

    public void exercicio16() {

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

    public void exercicio17() {

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
}
