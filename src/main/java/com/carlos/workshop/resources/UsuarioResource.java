package com.carlos.workshop.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carlos.workshop.domain.Usuario;
import com.carlos.workshop.domain.dto.UsuarioDTO;
import com.carlos.workshop.services.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {
	
	@Autowired
	private UsuarioService service;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> listar() {
		List<Usuario> dados = service.listar();
		return ResponseEntity.ok(dados);
	}
	
	@GetMapping(value = "/{usuarioId}")
	public ResponseEntity<Usuario> obterPorId(@PathVariable String usuarioId) {
		return ResponseEntity.ok(service.obterPorId(usuarioId));
	}
	
	@PostMapping
	public ResponseEntity<Usuario> inserir(@RequestBody UsuarioDTO usuario) {
		return ResponseEntity.created(null).body(service.inserir(usuario.toUsuario()));
	}
	
	@DeleteMapping(value = "/{usuarioId}")
	public ResponseEntity<Usuario> remover(@PathVariable String usuarioId) {
		service.remover(usuarioId);
		return ResponseEntity.ok().body(null);
	}
}
