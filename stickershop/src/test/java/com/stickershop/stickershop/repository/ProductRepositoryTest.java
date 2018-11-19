package com.stickershop.stickershop.repository;

import com.stickershop.stickershop.Repository.ProductRepository;
import com.stickershop.stickershop.domain.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void 카테고리별_상품조회() throws Exception {
        Pageable pageable = PageRequest.of(0, 5);
        Page<Product> products = productRepository.findProductByCategoryIdAndName(1L, "백엔드", pageable);

        System.out.println(products.getTotalPages());
        System.out.println(products.getTotalElements());

        for (Product p : products) {
            System.out.println(p.getName());
        }
    }
}