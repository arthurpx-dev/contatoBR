package com.contatoBR.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contatoBR.model.Contato;
import com.contatoBR.repository.ContatoRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/contatos")
public class ContatoController {

    @Autowired
    private ContatoRepository contatoRepository;

    @GetMapping
    public List<Contato> listarContatos() {
        return contatoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Contato listarContato(@PathVariable Long id) {
        return contatoRepository.findById(id).orElseThrow(() -> new RuntimeException("Contato não encontrado"));
    }

    @PostMapping
    public Contato adicionarContato(@RequestBody Contato contato) {
        return contatoRepository.save(contato);
    }

    @PutMapping("/{id}")
    public Contato atualizarContato(@PathVariable Long id, @RequestBody Contato contatoAtualizado) {
        contatoAtualizado.setId(id);
        return contatoRepository.save(contatoAtualizado);
    }

    @DeleteMapping("/{id}")
    public void deletarContato(@PathVariable Long id) {
        contatoRepository.deleteById((id));

    }
}
