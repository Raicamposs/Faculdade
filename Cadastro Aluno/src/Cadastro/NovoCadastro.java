/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro;

/**
 *
 * @author Raiane Campos
 */
public class NovoCadastro {

    TelaPrincipal tela = new TelaPrincipal();
    String endereco, bairro, cidade,
            email, cpf, numTelefone, nome;

    public NovoCadastro() {
        this.tela.novoAluno[0] = new Alunos(0, "Raiane", "Primeiro de Janeiro", "Kubistcheck", "Guarapari", "Raianejanu@hotmail.com", "14760431756", "32620231");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String numTelefone) {
        this.numTelefone = numTelefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome(int mat) {
        return tela.novoAluno[mat].nome;
    }

    public String getEndereco(int mat) {
        return tela.novoAluno[mat].endereco;
    }

    public String getBairro(int mat) {
        return tela.novoAluno[mat].bairro;
    }

    public String getCidade(int mat) {
        return tela.novoAluno[mat].cidade;
    }

    public String getEmail(int mat) {
        return tela.novoAluno[mat].email;
    }

    public String getTelefone(int mat) {
        return tela.novoAluno[mat].numTelefone;
    }

    public String getCpf(int mat) {
        return tela.novoAluno[mat].cpf;
    }

    public void addCadastro() {
        tela.matricula();
        int i = (tela.matricula - 1);
        this.tela.novoAluno[i] = new Alunos(tela.matricula, nome, endereco, bairro, cidade, email, cpf, numTelefone);
//        System.out.println(tela.novoAluno[i].matricula);
//        System.out.println(tela.novoAluno[i].nome);
//        System.out.println(tela.novoAluno[i].endereco);
//        System.out.println(tela.novoAluno[i].bairro);
//        System.out.println(tela.novoAluno[i].cidade);
//        System.out.println(tela.novoAluno[i].email);
//        System.out.println(tela.novoAluno[i].cpf);

    }

    public void alteraCadastro(int matricula) {

        int i = matricula;
        this.tela.novoAluno[i] = new Alunos(tela.matricula, nome, endereco, bairro, cidade, email, cpf, numTelefone);
        System.out.println(tela.novoAluno[i].matricula);
        System.out.println(tela.novoAluno[i].nome);
        System.out.println(tela.novoAluno[i].endereco);
        System.out.println(tela.novoAluno[i].bairro);
        System.out.println(tela.novoAluno[i].cidade);
        System.out.println(tela.novoAluno[i].email);
        System.out.println(tela.novoAluno[i].cpf);

    }

}
