package com.corhuila.electivaii.Entity;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Modulo extends  ABaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column
    private String ruta;

    @ManyToMany(mappedBy = "modulos")
    private Set<Rol> roles;

    @ManyToMany
    @JoinTable(
            name = "modulo_vista",
            joinColumns = @JoinColumn(name = "modulo_id"),
            inverseJoinColumns = @JoinColumn(name = "vista_id")
    )
    private Set<Vista> vistas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Set<Rol> getRoles() {
        return roles;
    }

    public void setRoles(Set<Rol> roles) {
        this.roles = roles;
    }

    public Set<Vista> getVistas() {
        return vistas;
    }

    public void setVistas(Set<Vista> vistas) {
        this.vistas = vistas;
    }
}
