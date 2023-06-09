package com.example.demo.exception;

public class InSufficientAmountException extends RuntimeException{

    public  InSufficientAmountException(String msg){
        super(msg);
    }

}
