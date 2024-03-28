package com.proyecto.deforestacion.exception;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;


@RestControllerAdvice   /*controlador de excepciones global con @ControllerAdvice*/
public class ManejadorDeExcepciones {
	
    @ExceptionHandler(RecursoNoEncontradoException.class)
    public ResponseEntity<Object> manejarRecursoNoEncontradoException(RecursoNoEncontradoException ex, WebRequest request) {
        Map<String, Object> cuerpo = new HashMap<>();
        cuerpo.put("error", true);
        cuerpo.put("mensaje", ex.getMessage());
        return new ResponseEntity<>(cuerpo, HttpStatus.NOT_FOUND);
    }
    
}
