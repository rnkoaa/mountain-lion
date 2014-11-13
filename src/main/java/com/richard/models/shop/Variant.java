package com.richard.models.shop;


import com.richard.models.AbstractEntity;

//import javax.persistence.Embedded;
import java.util.List;

/**
 * Created by rnkoaa on 8/13/14.
 */
public class Variant extends AbstractEntity {

    private String color;

    //@Embedded
    private List<Size> sizes;

    public Variant(String color, List<Size> sizes) {
        this.color = color;
        this.sizes = sizes;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Size> getSizes() {
        return sizes;
    }

    public void setSizes(List<Size> sizes) {
        this.sizes = sizes;
    }
}
