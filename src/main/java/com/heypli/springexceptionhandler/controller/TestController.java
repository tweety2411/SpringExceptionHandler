package com.heypli.springexceptionhandler.controller;

import com.heypli.springexceptionhandler.exception.CommonBadRequestException;
import com.heypli.springexceptionhandler.exception.CommonNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@Slf4j
@RestController
public class TestController {

    @GetMapping("/getInfo")
    public ResponseEntity getInfo(@RequestParam("id") String id)  {
        if(id.equals("ex"))
            throw new RuntimeException();
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/test")
    public ResponseEntity notFoundTest() {
        throw new CommonNotFoundException();
    }

    /**
     * CommonBadRequestException 이 호출된다
     */
    @GetMapping("/resEx")
    public void resEx() {
//        throw new CommonBadRequestException("RES Exception");
        throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Res Exception");
    }

}
