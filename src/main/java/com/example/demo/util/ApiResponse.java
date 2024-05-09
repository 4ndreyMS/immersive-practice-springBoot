package com.example.demo.util;

import com.example.demo.models.ExceptionModel;

import java.util.List;

public class ApiResponse<T> {
    private boolean success;
    private List<ExceptionModel> errors;
    private T data;

    public ApiResponse() {
    }

    public ApiResponse(boolean success, List<ExceptionModel> errors, T data) {
        this.success = success;
        this.errors = errors;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<ExceptionModel> getErrors() {
        return errors;
    }

    public void setErrors(List<ExceptionModel> errors) {
        this.errors = errors;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
