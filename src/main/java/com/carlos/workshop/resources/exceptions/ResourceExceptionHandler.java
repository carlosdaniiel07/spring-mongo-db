package com.carlos.workshop.resources.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.carlos.workshop.services.exceptions.ObjetoNaoEncontradoException;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(value = ObjetoNaoEncontradoException.class)
	public ResponseEntity<Erro> objetoNaoEncontradoException(ObjetoNaoEncontradoException ex, HttpServletRequest request) {
		Erro err = new Erro(System.currentTimeMillis(), ex.getMessage(), HttpStatus.NOT_FOUND.value(), request.getRequestURI());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}
}
