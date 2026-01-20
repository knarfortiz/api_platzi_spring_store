package com.platzi.store.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PurchaseItem {
    private Integer productId;
    private int quantity;
    private double total;
    private boolean active;
}
