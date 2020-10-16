package com.basecmp.secpes.controlespm.domain.repository;

import com.basecmp.secpes.controlespm.domain.model.PostoGrad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostoGradRepository extends JpaRepository<PostoGrad, Long> {
}
