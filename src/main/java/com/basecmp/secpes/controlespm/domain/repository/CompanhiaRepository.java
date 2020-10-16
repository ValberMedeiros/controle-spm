package com.basecmp.secpes.controlespm.domain.repository;

import com.basecmp.secpes.controlespm.domain.model.Companhia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanhiaRepository extends JpaRepository<Companhia, Long> {
}
