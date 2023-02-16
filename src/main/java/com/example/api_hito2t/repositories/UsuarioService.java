package com.example.api_hito2t.repositories;


import com.example.api_hito2t.models.Authorities;
import com.example.api_hito2t.models.Usuarios;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import java.util.List;

@Service
@ApplicationScope
public class UsuarioService {
    private UsuarioRepositorio usuario;

    public UsuarioRepositorio getUsuario() {
        return usuario;
    }

    public UsuarioService(UsuarioRepositorio usuario) {
        this.usuario = usuario;
    }
    public List<String> UsuarioRol(){ return usuario.getRol();}
    public List<Usuarios> allUsuarios(){
        return usuario.findAll();
    }
}
