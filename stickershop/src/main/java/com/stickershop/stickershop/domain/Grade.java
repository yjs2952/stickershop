package com.stickershop.stickershop.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "grade")
public class Grade {

    @Id
    @Column(length = 10, nullable = false, unique = true)
    private Long id;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(length = 20, nullable = false, columnDefinition = "int default 0")
    private int saleMoney;

    @Column(nullable = false, columnDefinition = "double default 0.0")
    private double saleRatio;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date regDate;

    @Version
    @Temporal(TemporalType.TIMESTAMP)
    private Date modDate;
}
