package com.example.autheticuser.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "🚀 API Autheticuser está funcionando!";
    }

    @GetMapping("/auth/login")
    public String auth() {
        return "Por aqui está ok";
    }

    @RestController
    public class TesteController {

    @GetMapping("/teste")
    public ResponseEntity<String> teste() {
        return ResponseEntity.ok("Rota pública acessível!");
    }
    
}


}
