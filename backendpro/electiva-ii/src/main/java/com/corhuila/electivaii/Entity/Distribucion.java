package com.corhuila.electivaii.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "distribucion")
public class Distribucion extends ABaseEntity{

    @Column(name = "fecha_distribucion", length = 50, nullable = false)
    private String fecha_distribucion;

    @Column(name = "estado_distribucion", length = 50, nullable = false)
    private String estado_distribucion;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "comunicado_id", nullable = false)
    private Comunicado comunicado;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    public String getFecha_distribucion() {
        return fecha_distribucion;
    }

    public void setFecha_distribucion(String fecha_distribucion) {
        this.fecha_distribucion = fecha_distribucion;
    }

    public String getEstado_distribucion() {
        return estado_distribucion;
    }

    public void setEstado_distribucion(String estado_distribucion) {
        this.estado_distribucion = estado_distribucion;
    }

    public Comunicado getComunicado() {
        return comunicado;
    }

    public void setComunicado(Comunicado comunicado) {
        this.comunicado = comunicado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}