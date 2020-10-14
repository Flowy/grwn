package com.flowyk.grwn;

import javax.persistence.*;
import java.util.List;

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
