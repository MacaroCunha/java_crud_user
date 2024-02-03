package github.api.macaro.domain.usuario.controller;

import github.api.macaro.domain.usuario.model.Usuario;
import github.api.macaro.domain.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiController {
    @Autowired
    private UsuarioRepository repository;

    @GetMapping("/buscarUser")
    public @ResponseBody List<Usuario> buscarUsuario() {
        return this.repository.findAll();
    }
    
    @PostMapping("createUser")
    public Usuario criarUser(@RequestBody Usuario source){
        return this.repository.save(source);
    }
}
