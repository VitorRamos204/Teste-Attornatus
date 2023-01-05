package com.prova.api.prova.api.controller;

import com.prova.api.prova.api.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.prova.api.prova.api.model.Pessoa;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;
    // Listagem das pessoas atualmente criadas
    @GetMapping
    public List<Pessoa> pessoas() {
        return pessoaRepository.findAll();
    }
    // Criar a entidade pessoa
    @PostMapping
    public Pessoa criar(@RequestBody Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }
    // Deletar uma pessoa especifica
    @DeleteMapping
    public void deletarPessoa(@RequestBody Pessoa pessoa) {
        pessoaRepository.delete(pessoa);
    }
}
