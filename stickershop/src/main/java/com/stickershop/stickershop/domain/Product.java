package com.stickershop.stickershop.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @ManyToMany
    @JoinTable(name = "product_categories", joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    List<Category> categoryList;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id", nullable = false)
    private List<Image> imageList;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false, columnDefinition = "int default 0")
    private int totalQty;

    @Column(nullable = false, columnDefinition = "int default 0")
    private int curQty;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date regDate;

    @Version
    @Temporal(TemporalType.TIMESTAMP)
    private Date modDate;
}
