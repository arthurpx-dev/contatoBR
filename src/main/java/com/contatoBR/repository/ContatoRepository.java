package com.contatoBR.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contatoBR.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

}
