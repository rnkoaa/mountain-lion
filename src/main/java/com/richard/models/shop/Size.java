package com.richard.models.shop;


import com.richard.models.AbstractEntity;

import java.math.BigDecimal;

/**
 * Created by rnkoaa on 8/13/14.
 */
public class Size extends AbstractEntity {
    private String size;
    private int available;
    private BigDecimal price;

    public Size(String size, int available, BigDecimal price) {
        this.size = size;
        this.available = available;
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
