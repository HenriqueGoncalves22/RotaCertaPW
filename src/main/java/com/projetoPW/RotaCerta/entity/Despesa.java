package com.projetoPW.RotaCerta.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.text.DecimalFormat;
import java.time.LocalDateTime;

@Entity
@Table(name = "TBL_POST_USUARIO")
@Getter
@Setter
public class Despesa {
    @Id
    @Column(name = "ID_DESPESA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "VL_DESPESA")
    private Double valorDespesa;

    @Column(name = "TX_TIPO_DESPESA")
    private TipoDespesaEnum tipoDespesa;

    @Column(name = "DT_DESPESA")
    private LocalDateTime dataDespesa;


}
