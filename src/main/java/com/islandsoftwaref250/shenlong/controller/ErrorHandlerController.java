package com.islandsoftwaref250.shenlong.controller;


import com.islandsoftwaref250.shenlong.response.ErrorResponse;
import com.islandsoftwaref250.shenlong.exceptions.OrderSaveException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandlerController {

    @ExceptionHandler(OrderSaveException.class)
    public ResponseEntity<ErrorResponse> handleProductSaveException(OrderSaveException ex) {
        var errorResponse = new ErrorResponse(ex.getMessage());

        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
