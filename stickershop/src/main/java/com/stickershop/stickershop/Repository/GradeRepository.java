package com.stickershop.stickershop.Repository;

import com.stickershop.stickershop.domain.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepository extends JpaRepository<Grade, Long> {

    public Grade findGradById(Long id);
}
