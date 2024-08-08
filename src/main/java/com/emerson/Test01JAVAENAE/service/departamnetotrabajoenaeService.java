package com.emerson.Test01JAVAENAE.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emerson.Test01JAVAENAE.model.departamnetotrabajoenae;
import com.emerson.Test01JAVAENAE.repository.departamnetotrabajoenaeRepository;


@Service
public class departamnetotrabajoenaeService {

    @Autowired
    private departamnetotrabajoenaeRepository repository;

    public List<departamnetotrabajoenae> listarTodas() {
        return repository.findAll();
    }

    public departamnetotrabajoenae guardar (departamnetotrabajoenae departamnetotrabajoenae) {
        return repository.save(departamnetotrabajoenae);
    }

    public departamnetotrabajoenae obtenerPorId (Long id) {
        return repository.findById(id).orElse(null);
    }

    public void eliminar (Long id) {
        repository.deleteById(id);
    }

}
