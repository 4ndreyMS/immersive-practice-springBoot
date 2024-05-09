package com.example.demo.exeptions;

import com.example.demo.models.ExceptionModel;
import com.example.demo.util.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@ControllerAdvice
public class GlobalExeptionController {
    @ExceptionHandler(value = { CustomException.class })
    protected ResponseEntity customExpectionHandler(CustomException ex, WebRequest request) {
        final List<ExceptionModel> errors = new ArrayList<>();
        errors.add(ex.toExceptionModel());


        return new ResponseEntity(new ApiResponse(false, new ArrayList<>(Collections.singleton(ex.toExceptionModel())), null), ex.getErrorCode());
    }
}