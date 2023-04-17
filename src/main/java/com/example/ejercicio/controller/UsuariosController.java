package com.example.ejercicio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.ejercicio.Usuario;

import java.util.Arrays;
import java.util.List;

@RestController
public class UsuariosController {

    @GetMapping(path = "/users")
    public List<Usuario> getUsers(){
        return Arrays.asList(new Usuario(1,"Paco"), new Usuario(2,"Pedro"), new Usuario(3, "Juan"));
    }

}
