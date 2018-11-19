package com.stickershop.stickershop.repository;

import com.stickershop.stickershop.Repository.CategoryRepository;
import com.stickershop.stickershop.domain.Category;
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
public class CategoryRepositoryTest {

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    public void 카테고리별로_상품조회() throws Exception {
        Pageable pageable = PageRequest.of(0, 5);
        Category category = categoryRepository.findProductsByCategory(1L);
        System.out.println(category.getProductList().size());
    }
}
