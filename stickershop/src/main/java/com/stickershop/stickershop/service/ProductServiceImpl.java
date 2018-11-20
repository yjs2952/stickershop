package com.stickershop.stickershop.service;

import com.stickershop.stickershop.Repository.ProductRepository;
import com.stickershop.stickershop.domain.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    private ProductRepository productRepository;

    ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Page<Product> getList(Long category, Pageable pageable) {
        return productRepository.findProductByCategoryId(category, pageable);
    }
}
