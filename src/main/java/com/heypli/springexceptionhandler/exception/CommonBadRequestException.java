package com.heypli.springexceptionhandler.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 
 * @ExceptionHandler 우선순위가 더 높다 테스트시 ControllerAdvice주석
 * 
 */
@Slf4j
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class CommonBadRequestException extends RuntimeException{

    public CommonBadRequestException(String message) {
        super(message);
    }
}
