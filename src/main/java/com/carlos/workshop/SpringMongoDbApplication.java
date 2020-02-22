package com.carlos.workshop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.carlos.workshop.domain.Postagem;
import com.carlos.workshop.domain.Usuario;
import com.carlos.workshop.services.PostagemService;
import com.carlos.workshop.services.UsuarioService;

@SpringBootApplication
public class SpringMongoDbApplication implements CommandLineRunner {

	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private PostagemService postagemService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMongoDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario autor = usuarioService.listar().get(0);
		List<Postagem> postagens = new ArrayList<Postagem>();
		
		postagens.add(new Postagem(null, new Date(System.currentTimeMillis()), "Viajando!", "Estou indo viajar!!!", autor));
		postagens.add(new Postagem(null, new Date(System.currentTimeMillis()), "Voltei!", "Voltei de viajem!!!", autor));
		
		postagens.forEach((Postagem x) -> postagemService.inserir(x));
	}
}
