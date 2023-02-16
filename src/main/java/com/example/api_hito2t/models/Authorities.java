package com.example.api_hito2t.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "authorities")
public class Authorities {
    @Id
    private int id;

    private String nif;

    private String authority;

    public Authorities(int id, String nif, String authority) {
        this.id = id;
        this.nif = nif;
        this.authority = authority;
    }

    public Authorities() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
