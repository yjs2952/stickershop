package com.stickershop.stickershop.Repository;

import com.stickershop.stickershop.domain.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Page<Product> findAll(Pageable pageable);

    @Query(value = "SELECT p FROM Product p where p.name like CONCAT('%', :keyword, '%')")
    Page<Product> findByKeyword(@Param("keyword") String keyword, Pageable pageable);

    /*@Query(value = "select p.id, p.name, p.price, p.total_qty, p.cur_qty, p.reg_date, p.mod_date from product p " +
                   "inner join product_categories pc " +
                   "inner join category c " +
                   "where p.id = pc.product_id " +
                   "AND pc.category_id = c.id " +
                   "AND c.id = :id"
           , nativeQuery = true)*/
    @Query(value = "SELECT p FROM Product p " +
                   "WHERE p " +
                   "IN (SELECT p2 FROM Product p2 JOIN p2.categoryList c WHERE c.id = :id) " +
                   "ORDER BY p.regDate")
    Page<Product> findProductByCategoryId(@Param("id") Long id, Pageable pageable);

    @Query(value = "SELECT p FROM Product p WHERE p IN (SELECT p2 FROM Product p2 JOIN p2.categoryList c WHERE c.id = :id AND p2.name like concat('%', :keyword, '%'))")
    Page<Product> findProductByCategoryIdAndName(@Param("id") Long id, @Param("keyword") String keyword, Pageable pageable);
}
