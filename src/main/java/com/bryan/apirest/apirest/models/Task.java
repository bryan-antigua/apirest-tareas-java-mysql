package com.bryan.apirest.apirest.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalTime;

@Entity
public class Task {
    //generar el id de la tarea
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //la descripcion de la tarea
    private String description;

    //ver el estado de la tarea
    @Enumerated(EnumType.STRING)
    private EstadoTareas estado;

    //dia de creacion de la tarea

    @CreationTimestamp
    @Column(updatable = false)
    private LocalTime diaDeCreacion;;

    //fecha de actualizacion de la tarea

    @UpdateTimestamp
    private LocalTime diaDeActualizacion;;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EstadoTareas getEstado() {
        return estado;
    }

    public void setEstado(EstadoTareas estado) {
        this.estado = estado;
    }

    public LocalTime getDiaDeCreacion() {
        return diaDeCreacion;
    }

    public void setDiaDeCreacion(LocalTime diaDeCreacion) {
        this.diaDeCreacion = diaDeCreacion;
    }

    public LocalTime getDiaDeActualizacion() {
        return diaDeActualizacion;
    }

    public void setDiaDeActualizacion(LocalTime diaDeActualizacion) {
        this.diaDeActualizacion = diaDeActualizacion;
    }
}
