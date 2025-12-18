package com.example.demo.exception;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.MethodArguementNotValidException.*;
import java.util.*;
import org.springframework.http.ResponseEntity;

@RestControllerAdvice
public class globalExceptionHandler{

    @ExceptionHandler(MethodArguementNotValidException.class)
    public ResponseEntity<?>handleFieldError(MethodArguementNotValidException ex){
        Map<String,String>error=new HashMap();

        ex.getBindingResult().getFieldsError().forEach(err -> error.put(ex.getFields(),ex.getDefaultMessage()));

        return new ResponseEntity<>(error,HttpStatus.BAD-REQUEST);

    }
    @ExceptionHandler(StudentNotFounderException.class)
    public ResponseEntity<String.handleStudentNotValid(StudentNotFoundException ex){
        return new ResponseEnity<>(ex.getMessage()),HttpStatus.Not_FOUND);

    }
}