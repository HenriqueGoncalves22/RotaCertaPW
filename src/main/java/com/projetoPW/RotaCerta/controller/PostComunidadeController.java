package com.projetoPW.RotaCerta.controller;

import com.projetoPW.RotaCerta.entity.PostComunidade;
import com.projetoPW.RotaCerta.service.PostComunidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/postComunidade")
public class PostComunidadeController {

    @Autowired
    private PostComunidadeService service;

    // Listar todas os posts
    @GetMapping
    public List<PostComunidade> listar() {
        return service.listar();
    }

    // Buscar post por ID
    @GetMapping("/{id}")
    public PostComunidade buscarPorId(@PathVariable Long id) {
        return service.buscaPorId(id);
    }

    // Cadastrar um novo post
    @PostMapping
    public PostComunidade cadastrar(@RequestBody PostComunidade post) {
        return service.criarPost(post);
    }

    // Alterar post
    @PutMapping("/{id}")
    public PostComunidade alterar(@RequestBody PostComunidade post, @PathVariable Long id) {
        post.setId(id);
        return service.alterarPost(post);
    }

    // Excluir post por ID
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.deletarPost(id);
    }

    // Denunciar post
    @DeleteMapping("/{id}")
    public PostComunidade denunciar(@RequestBody PostComunidade post, @PathVariable Long id) {
        post.setId(id);
        return service.denunciarPost(id);
    }

    //CurtirPost
    @PutMapping("/{id}")
    public PostComunidade curtir (@RequestBody PostComunidade post, @PathVariable Long id) {
        post.setId(id);
        return service.curtirPost(post);
    }
}


