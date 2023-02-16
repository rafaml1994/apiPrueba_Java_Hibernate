package com.example.api_hito2t.repositories;

import com.example.api_hito2t.models.Authorities;
import com.example.api_hito2t.models.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface UsuarioRepositorio extends JpaRepository<Usuarios,String> {
    @Query("select a.authority from Authorities a inner join Usuarios u on a.nif = u.nif")
    public List<String> getRol();

}
