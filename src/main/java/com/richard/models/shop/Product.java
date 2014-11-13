package com.richard.models.shop;

import com.richard.models.AbstractEntity;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by rnkoaa on 8/11/14.
 */
@Document(collection = "products")
public class Product extends AbstractEntity {

    private String title;

    private List<Variant> variants;
    private String style;
    private String description;
    private boolean active;

    private List<Catalog> catalogs;

    private List<Category> categories;

    private List<Image> images;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Variant> getVariants() {
        return variants;
    }

    public void setVariants(List<Variant> variants) {
        this.variants = variants;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<Catalog> getCatalogs() {
        return catalogs;
    }

    public void setCatalogs(List<Catalog> catalogs) {
        this.catalogs = catalogs;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }
}
