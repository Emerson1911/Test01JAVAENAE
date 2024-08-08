package com.emerson.Test01JAVAENAE.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emerson.Test01JAVAENAE.model.categoriaanae;
import com.emerson.Test01JAVAENAE.repository.categoriaenaeRepository;

@Service
public class categoriaenaeService {


    @Autowired
    private categoriaenaeRepository categoriaenaeRepository;

    public List<categoriaanae> listarTodas() {
        return categoriaenaeRepository.findAll();
    }

    public categoriaanae guardar(categoriaanae categoriaanae) {
        return categoriaenaeRepository.save(categoriaanae);
    }

    public categoriaanae obtenerPorId(Long id) {
        return categoriaenaeRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        categoriaenaeRepository.deleteById(id);
    }
}
