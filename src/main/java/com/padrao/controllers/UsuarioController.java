package com.padrao.controllers;

import com.padrao.models.Usuario;
import com.padrao.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioService service;

    @RequestMapping("/")
    public ModelAndView listaUsuarios(Usuario usuario) {
        ModelAndView mv = new ModelAndView("user");
        mv.addObject("usuarios", service.findAll());
        mv.addObject("usuario", usuario == null ? new Usuario() : usuario);

        return mv;
    }

    @PostMapping("/salvar")
    public String save(Usuario usuario) {
        service.save(usuario);

        return "redirect:/";
    }

    @RequestMapping("/editar/{id}")
    public ModelAndView update(@PathVariable Long id) {

        return listaUsuarios(service.findById(id));
    }

    @RequestMapping(value = "/deletar/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);

        return "redirect:/";
    }

}
