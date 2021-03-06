package com.flowyk.grwn.domain;

import javax.persistence.*;

@Entity
@Table(name="ORDER_TABLE")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @OneToOne()
    OrderItem orderItem;
    @Embedded
    Price totalPrice;
}
