package com.emerson.Test01JAVAENAE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.emerson.Test01JAVAENAE.model.categoriaanae;
import com.emerson.Test01JAVAENAE.service.categoriaenaeService;

@Controller
@RequestMapping("categoria")
public class categoriaenaeController {

    @Autowired
    private categoriaenaeService categoriaenaeService;

    @GetMapping
    public String listarCategoria(Model model) {
        model.addAttribute("categorias", categoriaenaeService.listarTodas());
        return "categoria/categoria-list";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevaCategoria(Model model) {
        model.addAttribute("categoria", new categoriaanae());
        return "categoria/categoria-forn";
    }

    @PostMapping
    public String guardarCategoria(categoriaanae categoriaanae) {
        categoriaenaeService.guardar(categoriaanae);
        return "redirect:/categoria";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarCategoria(@PathVariable Long id, Model model) {
        model.addAttribute("categoria", categoriaenaeService.obtenerPorId(id));
        return "categoria/categoria-forn";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarCategoria(@PathVariable Long id) {
        categoriaenaeService.eliminar(id);
        return "redirect:/categoria";
    }

}
