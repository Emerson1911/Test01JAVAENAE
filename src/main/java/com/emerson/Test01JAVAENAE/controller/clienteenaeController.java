package com.emerson.Test01JAVAENAE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.emerson.Test01JAVAENAE.model.clienteenae;
import com.emerson.Test01JAVAENAE.service.clienteenaeService;


@Controller
@RequestMapping("cliente")
public class clienteenaeController {

    @Autowired
    private clienteenaeService clienteenaeService;
    
    @GetMapping
    public String listarCliente(Model model) {
        model.addAttribute("cliente", clienteenaeService.listarTodas());
        return "cliente/cliente-list";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevoCliente (Model model) {
        model.addAttribute("cliente", new clienteenae());
        return "cliente/cliente-forn";
    }

    @PostMapping
    public String guardarCliente(clienteenae clienteenae) {
        clienteenaeService.guardar(clienteenae);
        return "redirect:/cliente";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarCliente(@PathVariable Long id, Model model) {
        model.addAttribute("cliente", clienteenaeService.obtenerPorId(id));
        return "cliente/cliente-forn";
    }

    @GetMapping("/eliminar/{id}")
      public String eliminarCliente(@PathVariable Long id) {
        clienteenaeService.eliminar(id);
        return "redirect:/cliente";
    }
}
