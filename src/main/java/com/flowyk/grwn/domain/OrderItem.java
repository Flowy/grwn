package com.flowyk.grwn.domain;

import javax.persistence.*;

@Entity
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @OneToOne(optional = false)
    Product product;
    @Embedded
    Price price;
    Integer count;

}
