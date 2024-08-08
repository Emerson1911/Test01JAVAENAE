package com.emerson.Test01JAVAENAE.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emerson.Test01JAVAENAE.model.marcaenae;
import com.emerson.Test01JAVAENAE.repository.marcaenaeRepository;


@Service
public class marcaenaeService {

    @Autowired
    private marcaenaeRepository repository;

    public List<marcaenae> listarTodas() {
        return repository.findAll();
    }

    public marcaenae guardar(marcaenae marcaoucr) {
        return repository.save(marcaoucr);
    }

    public marcaenae obtenerPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }

}
