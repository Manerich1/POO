package br.com.senai.controller;

import br.com.senai.entity.PessoaEntity;
import br.com.senai.service.PessoaService;

public class PessoaController {

    //Instânciando objeto PessoaService
    PessoaService pessoaService = new PessoaService();

    public PessoaEntity cadastrarPessoa(String nome, String cpf, String email, int idade, double altura){
        return pessoaService.cadastrarPessoa(nome, cpf, email, idade, altura);
    }

    public void listarPessoas(){

    }

    public void buscarPessoa(){

    }

    public PessoaEntity editarPessoa(PessoaEntity pessoaEntity){
    return pessoaService.editarPessoa(pessoaEntity);
    }

    public void removerPessoa(){

    }
}
