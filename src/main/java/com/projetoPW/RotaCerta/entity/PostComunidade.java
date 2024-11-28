package com.projetoPW.RotaCerta.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "TBL_POST_COMUNIDADE")
@Getter
@Setter
public class PostComunidade {
    @Id
    @Column(name = "ID_POST")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DT_PUBLICACAO")
    private LocalDateTime dataPublicacao;

    @Column(name = "TX_TEXTO")
    private String texto;

    @Enumerated(EnumType.STRING)
    @Column(name = "TX_TIPO_POST")
    private TipoPostEnum tipoPost;

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO")
    private Usuario usuario;
}
