package com.example.demo.exception;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.MethodArguementNotValidException.*;

@RestControllerAdvice
public class globalExceptionHandler{

    @ExceptionHandler(MethodArguementNotValidException.class)
    public ResponseEntity<?>handleFieldError(MethodArguementNotValidException ex){
        Map<String,String>error=new HashMap();

        ex.getBindingData().getFieldsError().forEach(err -> error.put(ex.getFields(),ex.get))
    }
}