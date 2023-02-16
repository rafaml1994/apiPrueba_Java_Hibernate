package com.example.api_hito2t.controllers;


import com.example.api_hito2t.models.Authorities;
import com.example.api_hito2t.models.Usuarios;
import com.example.api_hito2t.repositories.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/")
public class ApiControllers {

    @Autowired
    private UsuarioService usuarios;


    @RequestMapping("/")
    public List<Usuarios> getUsuarios(){
       return usuarios.allUsuarios();
    }

    @RequestMapping("/rol")
    public List<String> getRole(){
        return usuarios.UsuarioRol();
    }
}
