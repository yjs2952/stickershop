package com.stickershop.stickershop.repository;

import com.stickershop.stickershop.Repository.GradeRepository;
import com.stickershop.stickershop.domain.Grade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional
public class GradeRepositoryTest {

    @Autowired
    GradeRepository gradeRepository;

    @Test
    public void 등급_가져오기() throws Exception {
        Pageable pageable = PageRequest.of(0, 5);
        Grade grade = gradeRepository.findGradById(1L);

        System.out.println("=====================");
            System.out.println("grade_id : " + grade.getId());
            System.out.println("grade_id : " + grade.getName());
            System.out.println("=====================");
    }
}
