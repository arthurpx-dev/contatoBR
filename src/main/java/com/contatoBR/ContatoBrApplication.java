package com.contatoBR;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.contatoBR.model.Contato;
import com.contatoBR.repository.ContatoRepository;

@SpringBootApplication
public class ContatoBrApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContatoBrApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(ContatoRepository contatoRepository) {
		return args -> {
			contatoRepository.deleteAll();

			Contato c = new Contato();
			c.setEmail("artpx@gmail.com");
			c.setTelefone("98989898");
			c.setNome("Arthur");
			contatoRepository.save(c);
		};
	}

}
