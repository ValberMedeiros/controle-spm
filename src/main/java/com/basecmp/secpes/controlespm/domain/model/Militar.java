package com.basecmp.secpes.controlespm.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Militar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    private String nomeCompleto;

    private String nomeGuerra;

    private String identidade;

    private String CPF;

    private LocalDate dataNascimento;

    private LocalDate dataPraca;

    private LocalDate dataLicenciamento;

    @ManyToOne
    private TipoMilitar tipoMilitar;

    @ManyToOne
    private PostoGrad postoGrad;

    @OneToMany
    @JoinColumn(name = "militar_id")
    private List<Promocao> promocaoes;

}
