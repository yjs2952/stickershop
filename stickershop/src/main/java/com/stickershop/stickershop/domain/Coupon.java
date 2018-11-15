package com.stickershop.stickershop.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "coupon")
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(length = 10, nullable = false, columnDefinition = "int default 0")
    private int totalQty;

    @Column(length = 10, nullable = false, columnDefinition = "int default 0")
    private int curQty;

    @Column(length = 10, nullable = false, columnDefinition = "int default 0")
    private int saleMoney;

    @Column(length = 3, nullable = false)
    private double saleRatio;

    @Temporal(TemporalType.TIMESTAMP)
    private Date expireDate;

    @Column(length = 1, nullable = false, columnDefinition = "int default 0")
    private int expireType;

    @Column
    private Integer period;

    @Lob
    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date regDate;

    @Version
    @Temporal(TemporalType.TIMESTAMP)
    private Date modDate;
}
