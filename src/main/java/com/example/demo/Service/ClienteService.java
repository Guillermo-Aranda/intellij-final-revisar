package com.example.demo.Service;

import com.example.demo.DAO.ClienteDAO;
import com.example.demo.Modelo.Cliente;
import com.example.demo.Modelo.ClienteUpdatecampos;
import com.example.demo.Modelo.Reservas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class ClienteService {
@Autowired
    private ClienteDAO clienteDAO;
    public Collection<Cliente> getCliente(){
       return clienteDAO.getCliente();

    }
    public Cliente crearcliente(Cliente cliente) {

        return  clienteDAO.crearcliente(cliente);
    }


    public Optional<Cliente> getClienteById(Integer id) {

        return  clienteDAO.getClienteById(id);
    }

    public Optional<Cliente> deleteClineteById(Integer id) {

        return clienteDAO.deleteClineteById(id);
    }

    public Optional<Cliente> UpdateClineteById(Integer id, ClienteUpdatecampos clienteUpdatecampos) {
        return  clienteDAO.UpdateClineteById(id,clienteUpdatecampos);
    }


}
