package com.projetoPW.RotaCerta.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "TBL_USUARIO")
@Getter
@Setter
public class Usuario {
    @Id
    @Column(name = "ID_USUARIO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TX_TEMPO_PAGAMENTO")
    private TempoPagamentoEnum tempoPagamento;

    @Column(name = "TX_NOME")
    private String nome;

    @Column(name = "DT_NASCIMENTO")
    private LocalDate dataNascimento;

    @Column(name = "TELEFONE")
    private String telefone;

    @Column(name = "TX_EMAIL")
    private String email;

    @Column(name = "TX_SENHA")
    private String senha;


}
