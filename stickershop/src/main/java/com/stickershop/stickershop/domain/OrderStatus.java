package com.stickershop.stickershop.domain;

import javax.persistence.*;

@Entity
@Table(name = "order_status")
public class OrderStatus {

    @Id
    @Column(length = 10, nullable = false, unique = true)
    private Long id;

    @Column(length = 20, nullable = false)
    private String name;
}
