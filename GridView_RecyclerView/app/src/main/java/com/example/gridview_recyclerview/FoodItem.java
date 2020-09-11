package com.example.gridview_recyclerview;

import java.io.Serializable;

public class FoodItem implements Serializable {

    private String title;
    private String category;
    private String description;
    private int thumbnail;
    private String key_id;

    public FoodItem() {
    }

    public FoodItem(String title, String category, String key_id, String description, int thumbnail) {
        this.title = title;
        this.category = category;
        this.description = description;
        this.thumbnail = thumbnail;
        this.key_id = key_id;
    }

    public String getKey_id() {
        return key_id;
    }

    public void setKey_id(String key_id) {
        this.key_id = key_id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
