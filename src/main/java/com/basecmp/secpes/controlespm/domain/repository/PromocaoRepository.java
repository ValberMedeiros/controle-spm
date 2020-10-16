package com.basecmp.secpes.controlespm.domain.repository;

import com.basecmp.secpes.controlespm.domain.model.Promocao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromocaoRepository extends JpaRepository<Promocao, Long> {
}
