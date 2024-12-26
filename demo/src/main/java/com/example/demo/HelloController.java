package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Data;

@RestController
public class HelloController {
    
    @GetMapping("/hello")
    public ResponseDto getHello() {
        return new ResponseDto("Hello, World!", 200);
    }

    @Data
    @AllArgsConstructor
    private static class ResponseDto {
        private String message;
        private int statusCode;
    }
}
