package lk.ijse.vehicleservice.exception;

import lk.ijse.vehicleservice.util.APIResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * --------------------------------------------
 * Author: Kokila Dewmini
 * GitHub: https://github.com/KokilaDev
 * --------------------------------------------
 * Created: 8/16/2026 9:13 PM
 * Project: SPMS
 * --------------------------------------------
 */

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(VehicleNotFoundException.class)
    public ResponseEntity<APIResponse<Object>> handleVehicleNotFoundException(VehicleNotFoundException e) {

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(APIResponse.builder()
                        .success(false)
                        .message(e.getMessage())
                        .data(null)
                        .build());
    }

    @ExceptionHandler(DuplicateVehicleNumberException.class)
    public ResponseEntity<APIResponse<Object>> handleDuplicateVehicleNumberException(DuplicateVehicleNumberException e) {

        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(APIResponse.builder()
                        .success(false)
                        .message(e.getMessage())
                        .data(null)
                        .build());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<APIResponse<Map<String, String>>> handleValidationErrors(
            MethodArgumentNotValidException ex) {

        Map<String, String> errors = new HashMap<>();

        for (FieldError error : ex.getBindingResult().getFieldErrors()) {
            errors.put(error.getField(), error.getDefaultMessage());
        }

        return ResponseEntity.badRequest()
                .body(APIResponse.<Map<String, String>>builder()
                        .success(false)
                        .message("Validation failed")
                        .data(errors)
                        .build());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<APIResponse<Object>> handleGeneralException(
            Exception ex) {

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(APIResponse.builder()
                        .success(false)
                        .message(ex.getMessage())
                        .data(null)
                        .build());
    }
}