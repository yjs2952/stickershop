package com.stickershop.stickershop.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Entity
@Table(name = "role")
public class Role {

    @Id
    @Column(nullable = false, unique = true)
    private Long id;

    @Column(name = "name", length = 20, nullable = false)
    private String name;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date regDate;

    @Version
    @Temporal(TemporalType.TIMESTAMP)
    private Date modDate;
}
