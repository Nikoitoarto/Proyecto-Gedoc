package com.corhuila.electivaii.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "respuesta")
public class Respuesta extends ABaseEntity{

    @Column(name = "contenido_respuesta", length = 50, nullable = false)
    private String contenido_respuesta;

    @Column(name = "fecha_creacion", length = 50, nullable = false)
    private String fecha_creacion;

    @Column(name = "fecha_modificacion", length = 50, nullable = false)
    private String fecha_modificacion;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "comunicado_id", nullable = false)
    private Comunicado comunicado;

    public String getContenido_respuesta() {
        return contenido_respuesta;
    }

    public void setContenido_respuesta(String contenido_respuesta) {
        this.contenido_respuesta = contenido_respuesta;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getFecha_modificacion() {
        return fecha_modificacion;
    }

    public void setFecha_modificacion(String fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }

    public Comunicado getComunicado() {
        return comunicado;
    }

    public void setComunicado(Comunicado comunicado) {
        this.comunicado = comunicado;
    }
}