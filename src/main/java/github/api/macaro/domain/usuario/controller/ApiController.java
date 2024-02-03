package github.api.macaro.domain.usuario.controller;

import github.api.macaro.domain.usuario.model.Usuario;
import github.api.macaro.domain.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ApiController {
    @Autowired
    private UsuarioRepository repository;

    @GetMapping("/buscarUser")
    public @ResponseBody List<Usuario> buscarUsuario() {
        List<Usuario> us = this.repository.findAll();
        return us;
    }
}
