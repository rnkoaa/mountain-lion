package com.richard.models.shop;


import com.richard.models.AbstractEntity;

/**
 * Created by rnkoaa on 8/13/14.
 */
public class Image extends AbstractEntity {

    private String url;
    private int width;
    private int height;
    private ImageKind imageKind;

    public Image(String url, ImageKind imageKind, int width, int height) {
        this.url = url;
        this.imageKind = imageKind;
        this.height = height;
        this.width = width;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public ImageKind getImageKind() {
        return imageKind;
    }

    public void setImageKind(ImageKind imageKind) {
        this.imageKind = imageKind;
    }

    public enum ImageKind {
        THUMBNAIL("thumbnail"), CATALOG("catalog"), DETAIL("detail"), ZOOM("zoom");
        private final String value;

        ImageKind(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public String toString() {
            return getValue();
        }
    }


}
