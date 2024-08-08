package com.emerson.Test01JAVAENAE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.emerson.Test01JAVAENAE.model.marcaenae;
import com.emerson.Test01JAVAENAE.service.marcaenaeService;

@Controller
@RequestMapping("marca")
public class marcaController {

    @Autowired
    private marcaenaeService service;

    @GetMapping
    public String listarMarcas(Model model) {
        model.addAttribute("marcas", service.listarTodas());
        return "marca/marca-list";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevaMarca(Model model) {
        model.addAttribute("marca", new marcaenae());
        return "marca/marca-forn";
    }

    @PostMapping
    public String guardarMarca(marcaenae marca) {
        service.guardar(marca);
        return "redirect:/marca";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarMarca(@PathVariable Long id, Model model) {
        model.addAttribute("marca", service.obtenerPorId(id));
        return "marca/marca-forn";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarMarca(@PathVariable Long id) {
        service.eliminar(id);
        return "redirect:/marca";
    }
}
