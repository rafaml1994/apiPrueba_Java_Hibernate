package com.example.api_hito2t.models;


import jakarta.persistence.*;


@Entity
@Table(name = "users")
public class Usuarios {
    @Id
    private String nif;

    private String nombre;

    private String pw;

    private String activo;



    public Usuarios(String nif, String nombre, String password, String activo) {
        this.nif = nif;
        this.nombre = nombre;
        this.pw = password;
        this.activo = activo;
    }

    public Usuarios() {

    }

    public String getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return pw;
    }

    public String getActivo() {
        return activo;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.pw = password;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }
}
