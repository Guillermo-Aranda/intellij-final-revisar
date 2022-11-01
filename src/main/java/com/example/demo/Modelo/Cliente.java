package com.example.demo.Modelo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.util.Set;
@Data
@Document(collection = "Clientes")
public class Cliente {
@Id
private Integer id;
private String Razon_social;
private  int telefono;

private Set<ClienteReserva>Reserva;

    //Set<ClienteReserva>Reserva;

    public Integer getId() {
        return id;
    }


    public String getRazon_social() {
        return Razon_social;
    }

    public void setRazon_social(String razon_social) {
        Razon_social = razon_social;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
