package com.stickershop.stickershop.domain;

import javax.persistence.*;

@Entity
@Table(name = "shipping")
public class Shipping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private String user_name;

    @Column(length = 5, nullable = false)
    private int zipCode;

    @Column(length = 255, nullable = false)
    private String address;

    @Column(length = 15, nullable = false)
    private String phone;

    @Column(length = 5, nullable = false, columnDefinition = "int default 0")
    private int fee;

    @Lob
    private String memo;
}
