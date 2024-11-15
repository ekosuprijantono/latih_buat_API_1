package com.simple_api.simple_api2_crud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
//import com.simple_api.simple_api2_crud.exception.APIException;

@ControllerAdvice
public class APIExceptionHandler {

    @ExceptionHandler(value = {APINotFoundException.class})
    public ResponseEntity<Object> handleAPINotFoundException
            (APINotFoundException apiNotFoundException)
    {
        APIException apiException = new APIException(
                apiNotFoundException.getMessage(),
                apiNotFoundException.getCause(),
                HttpStatus.NOT_FOUND
        );

        return new ResponseEntity<>(apiException,HttpStatus.NOT_FOUND);
    }
}
