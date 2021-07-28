package itallodavid.github.citiesapi.controllers;

import itallodavid.github.citiesapi.dto.APIErrorResponseDTO;
import itallodavid.github.citiesapi.exceptions.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionsHandlerController extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<Object> handleEntityNotFound(
        EntityNotFoundException exception, WebRequest request
    ){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
            new APIErrorResponseDTO(exception.getMessage())
        );
    }
}
