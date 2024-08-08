package com.emerson.Test01JAVAENAE.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emerson.Test01JAVAENAE.model.clienteenae;
import com.emerson.Test01JAVAENAE.repository.clienteenaeRepository;


@Service
public class clienteenaeService {

    @Autowired
    private clienteenaeRepository clienteenaeRepository;

    public List<clienteenae> listarTodas() {
        return clienteenaeRepository.findAll();
    }

    public clienteenae guardar(clienteenae clienteenae) {
        return clienteenaeRepository.save(clienteenae);
    }

    public clienteenae obtenerPorId(Long id) {
        return clienteenaeRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        clienteenaeRepository.deleteById(id);
    }

}
