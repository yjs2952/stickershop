package com.stickershop.stickershop.Repository;

import com.stickershop.stickershop.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
