package com.example.clienteservice.services;

import com.example.clienteservice.entities.Cliente;

import java.util.Optional;

public interface ClienteService extends CrudService<Cliente,Long> {

    Optional<Cliente> findByNumeroDocumento(String numeroDocumento) throws Exception;

}
