package com.projetoPW.RotaCerta.service;

import com.projetoPW.RotaCerta.entity.Usuario;
import com.projetoPW.RotaCerta.repository.PostComunidadeRepository;
import com.projetoPW.RotaCerta.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsuarioService extends Usuario{
        @Autowired
        private UsuarioRepository repository;
        private PostComunidadeRepository repositoryPostComunidade;

        public List<Usuario> listar()
        {
            return repository.findAll();
        }

        public Usuario buscaPorId(Long id) {
            var existe = repository.findById(id);
            if (existe.isPresent())
                return existe.get();
            return null;
        }

        public Usuario cadastrar(Usuario usuario) {
            var existeEmail = repository.findByEmail(usuario.get());
            var existeWhatsapp = repository.findByTelefone(usuario.getTelefone());
            if (existeWhatsapp == null || existeEmail == null) {
                return repository.save(usuario);
            } else if (existeWhatsapp != null) {
                System.out.println("Número de Telefone já existe!");
            } else
                System.out.println("Endereço de Email já existe!");
            return null;
        }

        public Usuario login(Usuario usuario){

        }

        public Usuario alterar(Usuario usuario)
        {
            var existe = buscaPorId(usuario.getId());
            if (existe != null)
                return repository.save(usuario);
            else
                System.out.println("Disciplina não encontrada");
            return null;
        }

        public void excluir(Long id)
        {
            var existe = buscaPorId(id);
            if(existe != null)
                repository.deleteById(id);
        }
    }

