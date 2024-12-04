package com.projetoPW.RotaCerta.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Entity
@Table(name = "TBL_DESPESA")
@Getter
@Setter
public class Despesa {
    @Id
    @Column(name = "ID_DESPESA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "VL_DESPESA", columnDefinition = "decimal")
    private Double valorDespesa;

    @Column(name = "TX_TIPO_DESPESA")
    private String tipoDespesa;

    @Column(name = "DT_DESPESA")
    private LocalDate dataDespesa;

    //@ManyToOne
    //@JoinColumn(name = "ID_CATEGORIA")
    //private Categoria categoria;
}
