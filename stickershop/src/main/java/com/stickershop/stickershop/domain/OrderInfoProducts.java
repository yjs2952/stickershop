package com.stickershop.stickershop.domain;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "order_info_products")
public class OrderInfoProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(nullable = false, columnDefinition = "int default 1")
    private int quantity;

    @Column(nullable = false, columnDefinition = "int default 1000")
    private int price;

    @Column(nullable = false, columnDefinition = "int default 0")
    private int mileage;
}
