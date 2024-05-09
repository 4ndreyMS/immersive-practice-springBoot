package com.example.demo.models;

//model to unify the exception
public class ExceptionModel {
    private String message;
    private int statusCode;

    public ExceptionModel() {}

    public ExceptionModel(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
