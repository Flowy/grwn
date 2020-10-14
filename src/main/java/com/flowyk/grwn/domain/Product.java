package com.flowyk.grwn.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String name;
    @OneToMany
    private List<AnimalCategory> animalCategories;
    @Embedded
    Price price;
    String description;
    String gallery;


    public Product(String name, Price price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }
}
