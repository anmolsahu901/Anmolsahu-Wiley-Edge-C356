package com.example.demo.exception;

public class DepNotFoundException extends Exception{

private static final long serialVersionUID = 1L;

    public DepNotFoundException() {

    }

    public DepNotFoundException(String message) {
        super(message);
    }

    public DepNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public DepNotFoundException(Throwable cause) {
        super(cause);
    }

    public DepNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


}
