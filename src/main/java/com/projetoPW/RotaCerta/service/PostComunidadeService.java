package com.projetoPW.RotaCerta.service;

import com.projetoPW.RotaCerta.entity.PostComunidade;
import com.projetoPW.RotaCerta.repository.PostComunidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostComunidadeService {
    @Autowired
    private PostComunidadeRepository repository;

    public List<PostComunidade> listar(){ return repository.findAll();}

    public PostComunidade buscaPorId(Long id)
        {
            var existe = repository.findById(id);
            if (existe.isPresent())
                return existe.get();
            return null;
        }

    public PostComunidade criarPost (PostComunidade post) {return repository.save(post);}

    public PostComunidade alterarPost (PostComunidade post) {return repository.save(post);}

    public void deletarPost (Long id)
    {
        var existe = buscaPorId(id);
        if(existe != null)
            repository.deleteById(id);
    }

    public PostComunidade denunciarPost(Long id) {
        PostComunidade post = buscaPorId(id);
        if (post != null) {
            post.setDenuncias(post.getDenuncias() + 1);
            System.out.println("Post denunciado. Total de denúncias: " + post.getDenuncias());
        }
        if (post.getDenuncias() >= 5) {
            repository.deleteById(id);
            System.out.println("Post excluído devido a 5 denúncias.");
        }
        return repository.save(denunciarPost(id));
    }
    public PostComunidade curtirPost(PostComunidade post) {
        post.setCurtidas(post.getCurtidas() + 1);
        return repository.save(post);
    }
}

