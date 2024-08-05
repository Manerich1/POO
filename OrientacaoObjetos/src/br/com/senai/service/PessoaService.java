package br.com.senai.service;

import br.com.senai.entity.PessoaEntity;

import java.util.Scanner;

public class PessoaService {

    Scanner tec = new Scanner(System.in);

    public PessoaEntity cadastrarPessoa(String nome, String cpf, String email, int idade, double altura){
        //Instânciando objeto PessoaEntity
        PessoaEntity pessoaEntity = new PessoaEntity();

        //pessoaEntity.nome = Pedro;
        pessoaEntity.nome = nome;
        pessoaEntity.cpf = cpf;
        pessoaEntity.email = email;
        pessoaEntity.idade = idade;
        pessoaEntity.altura = altura;
        return pessoaEntity;
    }

    public void listarPessoas(){

    }

    public void buscarPessoa(){

    }

    public PessoaEntity editarPessoa(PessoaEntity pessoaEntity){
        System.out.print("Informe o novo nome: ");
        String nome = tec.nextLine();
        pessoaEntity.nome = nome;
        return null;
    }

    public void removerPessoa(){

    }
}
