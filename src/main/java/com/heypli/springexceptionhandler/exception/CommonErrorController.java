//package com.heypli.springexceptionhandler.exception;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.boot.web.servlet.error.ErrorController;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@Slf4j
//@Controller
//public class CommonErrorController implements ErrorController {
//
//    @RequestMapping("/error")
//    public String handleError(HttpServletRequest request, HttpServletResponse response,  Model model) {
//        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
//
//        int statusCode = Integer.parseInt(status.toString());
//        response.setStatus(statusCode);
//
//        model.addAttribute("code", status.toString());
//        model.addAttribute("msg", HttpStatus.valueOf(Integer.valueOf(status.toString())));
//        return "error/error";
//    }
//
//}
