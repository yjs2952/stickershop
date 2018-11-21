package com.stickershop.stickershop.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Entity
@Table(name = "order_info")
public class OrderInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shipping_id")
    private Shipping shipping;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_status_id")
    private OrderStatus orderStatus;

    @OneToMany(orphanRemoval = true)
    @JoinColumn(name = "order_id")
    private List<MemberCoupons> memberCouponList;

    @OneToMany(orphanRemoval = true)
    @JoinColumn(name = "order_id")
    private List<OrderInfoProducts> orderInfoProductList;

    @Column(nullable = false, columnDefinition = "int default 0")
    private int totalPrice;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date regDate;
}
