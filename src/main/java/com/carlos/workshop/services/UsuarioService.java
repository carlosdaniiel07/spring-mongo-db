package com.carlos.workshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlos.workshop.domain.Usuario;
import com.carlos.workshop.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repo;
	
	public List<Usuario> listar() {
		return repo.findAll();
	}
}
