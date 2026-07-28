package com.example.project.uber.UberApp.exceptions;

public class ResourceNotFoundException extends Throwable {

    public ResourceNotFoundException() {
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
