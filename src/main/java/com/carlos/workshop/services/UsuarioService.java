package com.carlos.workshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlos.workshop.domain.Usuario;
import com.carlos.workshop.repository.UsuarioRepository;
import com.carlos.workshop.services.exceptions.ObjetoNaoEncontradoException;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repo;
	
	public List<Usuario> listar() {
		return repo.findAll();
	}
	
	public Usuario obterPorId(String usuarioId) {
		return repo.findById(usuarioId).orElseThrow(() -> new ObjetoNaoEncontradoException("Usuário não encontrado"));
	}
	
	public Usuario inserir(Usuario usuario) {
		return repo.save(usuario);
	}
}
