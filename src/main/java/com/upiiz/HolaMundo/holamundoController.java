package com.upiiz.HolaMundo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holamundoController {

    @GetMapping("/HolaMundo")
    public String hola() {
        return "Hola Mundo";
    }

    @GetMapping("/HolaMundoDos")
    public String holaDos() {
        return "Hola Mundo Dos";
    }
}
