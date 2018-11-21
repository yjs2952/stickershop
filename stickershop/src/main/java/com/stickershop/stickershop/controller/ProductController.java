package com.stickershop.stickershop.controller;

import com.stickershop.stickershop.domain.Product;
import com.stickershop.stickershop.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/product")
@Controller
public class ProductController {

    private ProductService productService;

    ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/list")
    public String productList(@RequestParam("category") Long category,@RequestParam("page") Integer page, ModelMap modelMap){
        if (page == null) {
            page = 0;
        }
        Pageable pageable = PageRequest.of(page, 5);
        Page<Product> products = productService.getList(category, pageable);
        modelMap.addAttribute("productList", products);

        return "product/productList";
    }
}
