package com.example.demo.Controller;

import com.example.demo.Modelo.Cliente;
import com.example.demo.Modelo.ClienteUpdatecampos;
import com.example.demo.Modelo.Reservas;
import com.example.demo.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
@Autowired
    private ClienteService clienteService;

    //devuelve cliente ya anda
    @GetMapping
    public Collection<Cliente> getCliente(){

        return clienteService.getCliente();
    }
    //crear cliente ya anda (@RequestBody Cliente cliente, Reservas reservas) hacer preuebas
        @PostMapping
        public ResponseEntity<Cliente> postCliente(@RequestBody Cliente cliente) {
        return ResponseEntity.ok(clienteService.crearcliente(cliente));

    }
    //obtener para hacer udte Optional por si no se encuentra el regitrso ya anda
    @GetMapping(value = "/{id}")
    public Optional<Cliente>getClineteById(@PathVariable("id")Integer id){

        return  clienteService.getClienteById(id);
    }
    //actualizar cliente
    @PutMapping(value = "/{id}")
    public Optional<Cliente>UpdateClineteById(@PathVariable("id")Integer id,@RequestBody ClienteUpdatecampos clienteUpdatecampos){
        return  clienteService.UpdateClineteById(id,clienteUpdatecampos);
    }
    //eleiminar cliente anda vien
    @DeleteMapping(value = "/{id}")
    public Optional<Cliente>deleteClineteById(@PathVariable("id")Integer id){
        return  clienteService.deleteClineteById(id);
}


}