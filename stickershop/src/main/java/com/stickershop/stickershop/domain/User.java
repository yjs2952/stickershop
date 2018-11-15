package com.stickershop.stickershop.domain;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @Column(length = 20, nullable = false, unique = true)
    private String id;

    @Column(length = 20, nullable = false)
    private String userName;

    @Column(length = 50, nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(length = 20, nullable = false, unique = true)
    private String nickname;

    @OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true)
    @JoinColumn(name = "user_id")
    private List<UserCoupon> userCouponList;

    @OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true)
    @JoinColumn(name = "user_id", nullable = false)
    private List<Cart> cartList;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"),
                                    inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<Order> orderList;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "favorite_products", joinColumns = @JoinColumn(name = "user_id"),
                                            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<Product> productList;

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
    private Date regDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date modDate;
}