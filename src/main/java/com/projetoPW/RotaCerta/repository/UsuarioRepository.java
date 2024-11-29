package com.projetoPW.RotaCerta.repository;

import com.projetoPW.RotaCerta.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    Usuario findByEmail(String email);
    Usuario findByTelefone(String telefone);
}
