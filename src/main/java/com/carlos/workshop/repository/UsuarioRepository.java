package com.carlos.workshop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.carlos.workshop.domain.Usuario;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, String> {
	
}
