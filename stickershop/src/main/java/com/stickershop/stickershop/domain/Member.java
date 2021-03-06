package com.stickershop.stickershop.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "member")
public class Member {

    @Id
    @Column(length = 20, nullable = false, unique = true)
    private String id;

    @Column(length = 20, nullable = false)
    private String memberName;

    @Column(length = 50, nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(length = 20, nullable = false, unique = true)
    private String nickname;

    @OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true)
    @JoinColumn(name = "member_id", nullable = false)
    private List<MemberCoupons> memberCouponList;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "member_roles", joinColumns = @JoinColumn(name = "member_id"),
                                    inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    @OneToMany(mappedBy = "member", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<OrderInfo> orderList;

    @OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true)
    @JoinColumn(name = "member_id")
    private List<CartProducts> cartProductList;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "favorite_products", joinColumns = @JoinColumn(name = "member_id"),
                                            inverseJoinColumns = @JoinColumn(name = "favorite_id"))
    private List<Product> favoriteProductList;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "grade_id")
    private Grade grade;

    @Column(name = "Address", nullable = false)
    private String address;

    @Column(name = "phone", length = 15, nullable = false)
    private String phone;

    @Column(name = "zip_code", length = 5, nullable = false)
    private int zipCode;

    @Column(columnDefinition = "int default 0")
    private int mileage;


    @Temporal(TemporalType.TIMESTAMP)
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date regDate;

    @Version
    @Temporal(TemporalType.TIMESTAMP)
    private Date modDate;
}