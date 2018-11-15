package com.stickershop.stickershop.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_coupon")
public class UserCoupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "coupon_id", nullable = false)
    private Coupon coupon;

    @Temporal(TemporalType.TIMESTAMP)
    private Date expireDate;

    @Column(columnDefinition = "int default 0")
    private int useCheck;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date regDate;
}
