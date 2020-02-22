package com.carlos.workshop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.carlos.workshop.domain.Postagem;

@Repository
public interface PostagemRepository extends MongoRepository<Postagem, String> {
	
}
