/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro;

import java.util.Scanner;

/**
 *
 * @author Raiane Campos
 */
public class TelaCadastro {

    public static void main(String[] argas) {

        Scanner entrada = new Scanner(System.in);

        Alunos[] novoAluno;
        novoAluno = new Alunos[10];
        int nmx = 0;
        boolean sair = true, sair2 = true;
        String opcao2;
      
        do {
            System.out.println("\nO que deseja fazer?"
                    + "\n1 - Registrar aluno"
                    + "\n2 - Pesquisar aluno"
                    + "\n3 - Alterar aluno"
                    + "\n4 - Sair");

            int opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    Scanner regis = new Scanner(System.in);
                    int matricula = nmx + 1;
                    System.out.println("Matricula " + matricula + ":");
                    System.out.println("Digite o nome: ");
                    String nome = regis.nextLine();
                    System.out.println("Digite o CPF: ");
                    String cpf = regis.nextLine();
                    novoAluno[nmx] = new Alunos(matricula, nome, cpf);
                    System.out.println("Registrando aluno...");
                    break;
                case 2:
                    System.out.println("\nDigite o numero de matricula a ser pesquisado");
                    int matriculado = entrada.nextInt();
                    int posi = matriculado - 1;
                    try {

                        System.out.println("Matricula: " + novoAluno[posi].matricula);
                        System.out.println("Nome: " + novoAluno[posi].nome);
                        System.out.println("CPF: " + novoAluno[posi].cpf + "\nEncontrado!");
                        break;
                    } catch (NullPointerException erro) {
                        System.out.println("Aluno não encontrado!");
                        break;
                    }

                case 3:
                    try {
                        System.out.println("\nDigite a matricula para alterar: ");
                        matriculado = entrada.nextInt();
                        posi = matriculado - 1;
                        System.out.println("Matricula: " + novoAluno[posi].matricula);
                        System.out.println("Nome: " + novoAluno[posi].nome);
                        System.out.println("CPF: " + novoAluno[posi].cpf);
                        do {
                            System.out.println("\nO que deseja alterar?"
                                    + "\n1-Nome"
                                    + "\n2-CPF"
                                    + "\n3-Cancelar");
                            opcao2 = entrada.next();

                            switch (opcao2) {

                                case "1":
                                    System.out.println("Altere o nome!");
                                    novoAluno[posi].nome = entrada.nextLine();
                                    System.out.println("Concluido!");
                                    System.out.println("Matricula: " + novoAluno[posi].matricula);
                                    System.out.println("Nome: " + novoAluno[posi].nome);
                                    System.out.println("CPF: " + novoAluno[posi].cpf);
                                    sair2 = false;
                                    break;
                                case "2":
                                    System.out.println("Altere o CPF:");
                                    novoAluno[posi].cpf = entrada.nextLine();
                                    System.out.println("Concluido!");
                                    System.out.println("Matricula: " + novoAluno[posi].matricula);
                                    System.out.println("Nome: " + novoAluno[posi].nome);
                                    System.out.println("CPF: " + novoAluno[posi].cpf);
                                    sair2 = false;
                                    break;
                                case "3":
                                    System.out.println("Finalizando...");
                                    sair2 = false;
                                    break;
                                default:
                                    System.out.println("Opção invalida!");
                                    break;
                            }
                        } while (sair2);
                        break;

                    } catch (NullPointerException erro) {
                        System.out.println("Aluno não encontrado!");
                    }

                case 4:
                    sair = false;
                    break;
            }
        } while (sair);
    }
}
