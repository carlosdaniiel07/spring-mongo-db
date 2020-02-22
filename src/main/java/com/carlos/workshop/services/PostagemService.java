package com.carlos.workshop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlos.workshop.domain.Postagem;
import com.carlos.workshop.repository.PostagemRepository;

@Service
public class PostagemService {

	@Autowired
	private PostagemRepository repo;
	
	public Postagem inserir(Postagem postagem) {
		return repo.save(postagem);
	}
}
