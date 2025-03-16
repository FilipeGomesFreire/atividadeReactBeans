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

    @GetMapping
    public Pessoa getPessoa() {
        return pessoa;
    }
}