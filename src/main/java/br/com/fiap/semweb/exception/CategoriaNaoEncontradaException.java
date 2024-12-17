package br.com.fiap.semweb.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CategoriaNaoEncontradaException extends RuntimeException {
    public CategoriaNaoEncontradaException(String message) {
        super(message);
    }
}