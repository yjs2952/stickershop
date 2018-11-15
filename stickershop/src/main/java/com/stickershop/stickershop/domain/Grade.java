package com.stickershop.stickershop.domain;

import javax.persistence.*;

@Entity
@Table(name = "grade")
public class Grade {

    @Id
    @Column(length = 10, nullable = false, unique = true)
    private Long grade;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(length = 20, nullable = false, columnDefinition = "int default 0")
    private int saleMoney;


    private double saleRatio;
}
