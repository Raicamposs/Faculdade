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
public class Alunos {

    final int matricula;
    public String nome;
    public String email, numTelefone;
    public String endereco, bairro, cidade;
    public String cpf;

    public Alunos(int matricula, String nome,
            String endereco, String bairro, String cidade,
            String email, String cpf, String numTelefone) {

        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.email = email;
        this.cpf = cpf;
        this.numTelefone = numTelefone;

    }

}
