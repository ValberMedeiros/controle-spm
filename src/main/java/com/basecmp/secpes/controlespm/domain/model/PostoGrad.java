package com.basecmp.secpes.controlespm.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PostoGrad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    private String sigla;

    private String descricao;

    @OneToMany
    @JoinColumn(name = "posto_grad_id")
    private List<Militar> militares;

}
