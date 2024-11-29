package com.projetoPW.RotaCerta.service;

import com.projetoPW.RotaCerta.entity.Despesa;
import com.projetoPW.RotaCerta.entity.PostComunidade;
import com.projetoPW.RotaCerta.entity.Usuario;
import com.projetoPW.RotaCerta.repository.PostComunidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostComunidadeService {
    @Autowired
    private PostComunidadeRepository repository;

    public List<PostComunidade> listar(){ return repository.findAll();}

    public PostComunidade buscaPorId(Long id) {
        var existe = repository.findById(id);
        if (existe.isPresent())
            return existe.get();
        return null;
    }

    public PostComunidade criarPost (PostComunidade post)
    {
        return repository.save(post);
    }

    public PostComunidade alterarPost (PostComunidade post)
    {
        var existe = buscaPorId(PostComunidade.getId());
        if (existe != null)
            return repository.save(post);
        else
            System.out.println("Postagem não encontrada");
        return null;
    }

    public void deletarPost (Long id)
    {
        var existe = buscaPorId(id);
        if(existe != null)
            repository.deleteById(id);
    }

    public PostComunidade denunciarPost (PostComunidade post)
    {
        var existe = buscarPorId(PostComunidade.getId());
        if(existe != null)
    }

    public PostComunidade promoverPost (PostComunidade post)
    {
        var existe = buscarPorId(PostComunidade.getId());
        if(existe != null)
    }

}
