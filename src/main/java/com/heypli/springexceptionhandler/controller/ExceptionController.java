package com.heypli.springexceptionhandler.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {

    @GetMapping("/exception")
    public ResponseEntity<String> exception() {
        throw new RuntimeException();
    }
}
