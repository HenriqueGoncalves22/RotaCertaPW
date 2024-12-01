package com.projetoPW.RotaCerta.controller;

import com.projetoPW.RotaCerta.entity.Despesa;
import com.projetoPW.RotaCerta.entity.Usuario;
import com.projetoPW.RotaCerta.service.DespesaService;
import com.projetoPW.RotaCerta.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/usuarios")
    public class UsuarioController {

        @Autowired
        private UsuarioService service;

        // Listar todos os usuarios
        @GetMapping
        public List<Usuario> listar() {
            return service.listar();
        }

        // Buscar usuario por ID
        @GetMapping("/{id}")
        public Usuario buscarPorId(@PathVariable Long id) {
            return service.buscaPorId(id);
        }

        // Cadastrar um novo usuario
        @PostMapping
        public Usuario cadastrar(@RequestBody Usuario usuario) {return service.cadastrar(usuario);}

        // Excluir usuario por ID
        @DeleteMapping("/{id}")
        public void excluir (@PathVariable Long id) {
            service.removerUsuario(id);
        }
    }
