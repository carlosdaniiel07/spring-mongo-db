package com.carlos.workshop.domain.dto;

import com.carlos.workshop.domain.Usuario;

public class UsuarioDTO {
	
	private String nome;
	private String email;
	
	public UsuarioDTO() {
		
	}
	
	public UsuarioDTO(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
	
	public Usuario toUsuario() {
		return new Usuario(null, getNome(), getEmail());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
