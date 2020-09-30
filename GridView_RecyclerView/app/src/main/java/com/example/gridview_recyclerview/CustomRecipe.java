package com.example.gridview_recyclerview;

import java.io.Serializable;

public class CustomRecipe implements Serializable {

    private String title;
    private String category;
    private String description;
    private String ingredients;
    private String directions;

    public CustomRecipe() {

    }

    public CustomRecipe(String title, String category, String description, String ingredients, String directions) {
        this.title = title;
        this.category = category;
        this.description = description;
        this.ingredients = ingredients;
        this.directions = directions;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }
}
