package me.dio.estudiodigital.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.NOT_FOUND)
public class AulaNotFoundException extends RuntimeException {
    public AulaNotFoundException(Long id) {
        super("Aula não encontrada com o id: " + id);
    }
}
