package ar.edu.utn.frm.sysacad_api.exception;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.validation.FieldError;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice // 1. Esto le dice a Spring: "Esta clase maneja los errores de toda la app"
public class GlobalExceptionHandler {

    // 2. Este método se activa SOLO cuando hay un error de base de datos (como duplicados)
    //@ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<Map<String, String>> handleDuplicateEntry(DataIntegrityViolationException ex) {

        // Creamos una respuesta JSON limpia
        Map<String, String> errorResponse = new HashMap<>();
        errorResponse.put("error", "Conflicto de Datos");
        errorResponse.put("message", "El legajo o el email ya están registrados en el sistema.");

        // 3. Devolvemos un error 409 (Conflict) en lugar de 500
        return new ResponseEntity<>(errorResponse, HttpStatus.CONFLICT);
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException ex) {

        Map<String, String> errors = new HashMap<>();

        // Iteramos sobre todos los campos que fallaron y guardamos el mensaje
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });

        // Devolvemos un 400 BAD REQUEST con la lista de errores
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }
}