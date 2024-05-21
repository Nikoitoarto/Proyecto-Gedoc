package com.corhuila.electivaii.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "notificacion")
public class Notificacion extends ABaseEntity{

    @Column(name = "tipo_notificacion", length = 50, nullable = false)
    private String tipo_notifiacion;

    @Column(name = "fecha_cracion", length = 50, nullable = false)
    private String fecha_creacion;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "comunicado_id", nullable = false)
    private Comunicado comunicado;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    public String getTipo_notifiacion() {
        return tipo_notifiacion;
    }

    public void setTipo_notifiacion(String tipo_notifiacion) {
        this.tipo_notifiacion = tipo_notifiacion;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
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