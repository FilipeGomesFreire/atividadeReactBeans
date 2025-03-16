package com.example.pessoa_app.config;

import com.example.pessoa_app.model.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PessoaConfig {

    @Autowired
    private PessoaProperties pessoaProperties;

    @Bean
    public Pessoa pessoa() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(pessoaProperties.getNome());
        pessoa.setIdade(pessoaProperties.getIdade());
        pessoa.setSexo(pessoaProperties.getSexo());
        pessoa.setEstadoCivil(pessoaProperties.getEstadoCivil());
        pessoa.setProfissao(pessoaProperties.getProfissao());
        return pessoa;
    }
}