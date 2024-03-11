package com.contatoBR.service;

import org.springframework.stereotype.Service;

import com.contatoBR.repository.ContatoRepository;

@Service
public class ContatoService {
    private final ContatoRepository contatoRepository;

    public ContatoService(ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;

    }
}
