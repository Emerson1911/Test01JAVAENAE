package com.emerson.Test01JAVAENAE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.emerson.Test01JAVAENAE.model.departamnetotrabajoenae;
import com.emerson.Test01JAVAENAE.service.departamnetotrabajoenaeService;


@Controller
@RequestMapping("departamento")
public class departamnetotrabajoenaeController {

    @Autowired
    private departamnetotrabajoenaeService service;

    @GetMapping
    public String listarDepertamento (Model model) {
        model.addAttribute("departamento", service.listarTodas());
        return "departamento/departamento-list";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuoDepartamento (Model model) {
        model.addAttribute("departamento", new departamnetotrabajoenae());
        return "departamento/departamento-forn";
    }

    @PostMapping
    public String guardardepartamento (departamnetotrabajoenae departamnetotrabajoenae) {
        service.guardar(departamnetotrabajoenae);
        return "redirect:/departamento";
    }

    @GetMapping("/editar/{id}")
      public String mostrarFormularioEditardepartamento (@PathVariable Long id, Model model) {
        model.addAttribute("departamento", service.obtenerPorId(id));
        return "departamento/departamento-forn";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminardepartamento (@PathVariable Long id) {
        service.eliminar(id);
        return "redirect:/departamento";
    }

}
