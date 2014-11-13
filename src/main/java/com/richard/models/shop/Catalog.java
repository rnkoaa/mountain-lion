package com.richard.models.shop;


import com.richard.models.AbstractEntity;

/**
 * Created by rnkoaa on 8/13/14.
 */
public class Catalog extends AbstractEntity {

    private String name;

    public Catalog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
