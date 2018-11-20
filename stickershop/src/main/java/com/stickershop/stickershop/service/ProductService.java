package com.stickershop.stickershop.service;

import com.stickershop.stickershop.domain.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Page<Product> getList(Long category, Pageable pageable);
}
