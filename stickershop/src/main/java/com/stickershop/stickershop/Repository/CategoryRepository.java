package com.stickershop.stickershop.Repository;

import com.stickershop.stickershop.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    @Query(value = "SELECT c FROM Category c JOIN FETCH c.productList WHERE c.id = :id")
    Category findProductsByCategory(@Param("id") Long id);

}
