package com.example.registration.exception;

public class TelNumberNotFoundException extends RuntimeException {
    public TelNumberNotFoundException(String message) {
        super(message);
    }
}
