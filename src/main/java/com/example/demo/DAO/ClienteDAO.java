package com.example.demo.DAO;

import com.example.demo.Modelo.Cliente;
import com.example.demo.Modelo.ClienteUpdatecampos;
import com.example.demo.Modelo.Reservas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Optional;

@Component
public class ClienteDAO {
    @Autowired
    private ClienteRepository repository;
    public  Collection<Cliente>getCliente() {

        return repository.findAll();
    }
     //en vez de crear new cliente
    //llamas al objeto cliente como parametro dentro de la funcion crear cliente
    public Cliente crearcliente(Cliente cliente) {

        return repository.insert(cliente);
    }

    public Optional<Cliente> getClienteById(Integer id) {

        return  repository.findById(id);
    }

    public Optional<Cliente> deleteClineteById(Integer id) {
        Optional<Cliente>cliente=repository.findById(id);
        cliente.ifPresent(b->repository.delete(b));
        return cliente;
    }

//revisar
    public Optional<Cliente> UpdateClineteById(Integer id, ClienteUpdatecampos clienteUpdatecampos) {
        Optional<Cliente>cliente=repository.findById(id);
        cliente.ifPresent(b->b.setRazon_social(clienteUpdatecampos.getRazon_social()));
        cliente.ifPresent(b->b.setTelefono(clienteUpdatecampos.getTelefono()));
        cliente.ifPresent(b->repository.save(b));
        return cliente;
    }
}
