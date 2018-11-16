package com.stickershop.stickershop.domain;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "order_status")
public class OrderStatus {

    @Id
    @Column(length = 10, nullable = false, unique = true)
    private Long id;

    @Column(length = 20, nullable = false)
    private String name;
}
