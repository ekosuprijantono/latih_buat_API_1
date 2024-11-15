package com.simple_api.simple_api2_crud.exception;

public class APINotFoundException extends RuntimeException {
    public APINotFoundException(String message) {
        super(message);
    }

    public APINotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
