package com.basecmp.secpes.controlespm.domain.repository;

import com.basecmp.secpes.controlespm.domain.model.Militar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MilitarRepository extends JpaRepository<Militar, Long> {
}
