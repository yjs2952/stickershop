package com.stickershop.stickershop.Repository;

import com.stickershop.stickershop.domain.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Page<Product> findAll(Pageable pageable);

    /*@Query(value = "SELECT p FROM Product p JOIN p.categoryList c WHERE  ")
    Page<Product> findByCategory(String category, Pageable pageable);*/

    @Query(value = "SELECT p FROM Product p where p.name like CONCAT('%', :keyword, '%')")
    Page<Product> findByKeyword(String keyword, Pageable pageable);

    Product findProductById();
}
