/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parameta.exceptions;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.core.convert.ConversionFailedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 *
 * @author User
 */
@RestControllerAdvice
public class ApplicationExceptionHandler  {

    @ExceptionHandler(ConversionFailedException.class)
    public ResponseEntity<Object> handleNotFoundException(ConversionFailedException ex) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "El valor: " + ex.getValue() + " es incompatible, usar formato: dd/MM/yyyy");
        return new ResponseEntity<>(body, HttpStatus.EXPECTATION_FAILED);
    }
}
