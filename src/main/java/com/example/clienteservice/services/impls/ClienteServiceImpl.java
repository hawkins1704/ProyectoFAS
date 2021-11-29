package com.example.clienteservice.services.impls;

import com.example.clienteservice.entities.Cliente;
import com.example.clienteservice.repositories.ClienteRepository;
import com.example.clienteservice.services.ClienteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
    private ClienteRepository clienteRepository;


    @Override
    public Optional<Cliente> findByNumeroDocumento(String numeroDocumento) throws Exception {
        return clienteRepository.findByNumeroDocumento(numeroDocumento);
    }

    @Override
    public Cliente save(Cliente entity) throws Exception {
        return clienteRepository.save(entity);
    }

    @Override
    public List<Cliente> findAll() throws Exception {
        return clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> findById(Long aLong) throws Exception {
        return clienteRepository.findById(aLong);
    }

    @Override
    public Cliente update(Cliente entity) throws Exception {
        return clienteRepository.save(entity);
    }

    @Override
    public void deleteById(Long aLong) throws Exception {
        clienteRepository.deleteById(aLong);
    }
}
