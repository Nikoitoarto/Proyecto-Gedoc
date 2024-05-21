package com.corhuila.electivaii.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "comunicado")
public class Comunicado extends ABaseEntity{

    @Column(name = "nombre_documento", length = 50, nullable = false)
    private String nombre_documento;

    @Column(name = "asunto", length = 50, nullable = false)
    private String asunto;

    @Column(name = "contenido", length = 50, nullable = false)
    private String contenido;

    @Column(name = "nombre_quienradica", length = 50, nullable = false)
    private String nombre_quienradica;

    @Column(name = "fecha_ingreso", length = 50, nullable = false)
    private String fecha_ingreso;

    @Column(name = "fecha_vencimiento", length = 50, nullable = false)
    private String fecha_vencimiento;

    @Column(name = "tipo_comunicado", length = 50, nullable = false)
    private String tipo_comunicado;

    @Column(name = "notificacion", length = 50, nullable = false)
    private String notificacion;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "persona_id", nullable = false)
    private Persona personaId;

    public String getNombre_documento() {
        return nombre_documento;
    }

    public void setNombre_documento(String nombre_documento) {
        this.nombre_documento = nombre_documento;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getNombre_quienradica() {
        return nombre_quienradica;
    }

    public void setNombre_quienradica(String nombre_quienradica) {
        this.nombre_quienradica = nombre_quienradica;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getTipo_comunicado() {
        return tipo_comunicado;
    }

    public void setTipo_comunicado(String tipo_comunicado) {
        this.tipo_comunicado = tipo_comunicado;
    }

    public String getNotificacion() {
        return notificacion;
    }

    public void setNotificacion(String notificacion) {
        this.notificacion = notificacion;
    }

    public Persona getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Persona personaId) {
        this.personaId = personaId;
    }
}