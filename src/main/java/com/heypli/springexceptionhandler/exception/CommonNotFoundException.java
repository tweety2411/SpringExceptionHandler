package com.heypli.springexceptionhandler.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CommonNotFoundException extends RuntimeException {

    private String message;

    public CommonNotFoundException() {
        this.message = "Not Found";
    }

    public String getMessage() {
        return this.message;
    }
}
