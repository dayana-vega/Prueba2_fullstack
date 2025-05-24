package com.EduTech.prueba2.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreRol;

    @OneToMany(mappedBy = "rol",cascade = CascadeType.ALL)
    private List<Usuario> usuarios;

    public Rol() {
    }
    
    public Rol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
    
    public Rol(Long id, String nombreRol, List<Usuario> usuarios) {
        this.id = id;
        this.nombreRol = nombreRol;
        this.usuarios = usuarios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    


}
