package com.basecmp.secpes.controlespm.domain.repository;

import com.basecmp.secpes.controlespm.domain.model.TipoMilitar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoMilitarRepository extends JpaRepository<TipoMilitar, Long> {
}
