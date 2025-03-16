package com.example.pessoa_app.controller;


import com.example.pessoa_app.model.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private Pessoa pessoa;

    // @GetMapping
    // public Pessoa getPessoa() {
    //     return pessoa;
    // }
    @GetMapping
    public Pessoa getPessoa() {
        System.out.println("Dados da Pessoa:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Sexo: " + pessoa.getSexo());
        System.out.println("Estado Civil: " + pessoa.getEstadoCivil());
        System.out.println("Profissão: " + pessoa.getProfissao());
        return pessoa;
    }
}