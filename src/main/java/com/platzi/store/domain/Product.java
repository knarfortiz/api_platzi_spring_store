package com.platzi.store.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Product {
    private Integer productId;
    private String name;
    private Integer categoryId;
    private double price;
    private int stock;
    private boolean active;
    private Category category;
}
