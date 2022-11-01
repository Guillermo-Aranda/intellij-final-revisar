package com.example.demo.Modelo;

import lombok.Data;
import org.hibernate.mapping.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Table;
import java.util.Date;


@Table
   public class Reservas {

    private Integer numreserva;
    private Integer idcliente;
    private Date fechahora;
    private String descripcion;

    public Integer getNumreserva() {
        return numreserva;
    }

    public void setNumreserva(Integer numreserva) {
        this.numreserva = numreserva;
    }

    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public Date getFechahora() {
        return fechahora;
    }

    public void setFechahora(Date fechahora) {
        this.fechahora = fechahora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Reservas(Integer numreserva, Integer idcliente, Date fechahora, String descripcion) {
        this.numreserva = numreserva;
        this.idcliente = idcliente;
        this.fechahora = fechahora;
        this.descripcion = descripcion;
    }
}
