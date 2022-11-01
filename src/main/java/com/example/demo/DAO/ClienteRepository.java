package com.example.demo.DAO;

import com.example.demo.Modelo.Cliente;
import com.example.demo.Modelo.Reservas;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<Cliente,Integer> {




}
