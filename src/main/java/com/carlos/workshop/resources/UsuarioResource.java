package com.carlos.workshop.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carlos.workshop.domain.Usuario;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {
	
	@GetMapping
	public ResponseEntity<List<Usuario>> listar() {
		List<Usuario> dados = new ArrayList<Usuario>();
		
		dados.add(new Usuario("1", "Carlos", "carlos@email.com"));
		dados.add(new Usuario("2", "Daniel", "daniel@email.com"));
		
		return ResponseEntity.ok(dados);
	}
}
