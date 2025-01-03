package com.sparta.impostor.commerce.backend.common.exception;

import com.sparta.impostor.commerce.backend.common.exception.dto.ErrorResponse;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ErrorResponse> illegalArgumentException(IllegalArgumentException ex) {
        HttpStatus status = HttpStatus.BAD_REQUEST;

        ErrorResponse response = ErrorResponse.of(status.value(), LocalDateTime.now(), ex.getMessage());

        return ResponseEntity
                .status(status)
                .body(response);
    }

    @ExceptionHandler(AuthenticationFailedException.class)
    public ResponseEntity<ErrorResponse> authenticationFailedException(AuthenticationFailedException ex) {
        HttpStatus status = HttpStatus.UNAUTHORIZED;

        ErrorResponse response = ErrorResponse.of(status.value(), LocalDateTime.now(), ex.getMessage());

        return ResponseEntity
                .status(status)
                .body(response);
    }

    @ExceptionHandler(ForbiddenAccessException.class)
    public ResponseEntity<ErrorResponse> forbiddenAccessException(ForbiddenAccessException ex) {
        HttpStatus status = HttpStatus.FORBIDDEN;

        ErrorResponse response = ErrorResponse.of(status.value(), LocalDateTime.now(), ex.getMessage());

        return ResponseEntity
                .status(status)
                .body(response);
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ErrorResponse> entityNotFoundException(EntityNotFoundException ex) {
        HttpStatus status = HttpStatus.NOT_FOUND;

        ErrorResponse response = ErrorResponse.of(status.value(), LocalDateTime.now(), ex.getMessage());

        return ResponseEntity
                .status(status)
                .body(response);
    }

    @ExceptionHandler(IllegalStateException.class)
    public ResponseEntity<ErrorResponse> illegalStateException(IllegalStateException ex) {
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;

        ErrorResponse response = ErrorResponse.of(status.value(), LocalDateTime.now(), ex.getMessage());

        return ResponseEntity
                .status(status)
                .body(response);
    }
}
