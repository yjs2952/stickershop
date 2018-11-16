package com.stickershop.stickershop.Repository;

import com.stickershop.stickershop.domain.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GradeRepository extends JpaRepository<Grade, Long> {

    Grade findGradById(Long id);

    List<Grade> findAll();
}
