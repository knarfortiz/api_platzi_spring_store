package com.platzi.store.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Category {
    private Integer categoryId;
    private String category;
    private boolean active;
}
