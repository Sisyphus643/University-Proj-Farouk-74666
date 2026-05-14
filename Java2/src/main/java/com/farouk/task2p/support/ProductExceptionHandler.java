package com.farouk.task2p.support;

import com.farouk.task2p.shared.api.response.ErrorMessageResponse;
import com.farouk.task2p.support.exception.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductExceptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorMessageResponse> handleProductNotFound(ProductNotFoundException exception) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ErrorMessageResponse(exception.getMessage()));
    }
}
