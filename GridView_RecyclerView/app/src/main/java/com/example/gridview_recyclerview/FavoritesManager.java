package com.example.gridview_recyclerview;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FavoritesManager {

    final private static String RECIPE_SHARED_PREFS = "shared prefs";
    private SharedPreferences sharedPreferences;

    public FavoritesManager(Context context) {

        sharedPreferences = context.getSharedPreferences(RECIPE_SHARED_PREFS, Context.MODE_PRIVATE);

    }

    public Set<FoodItem> getFavorites() { //to do: return all food items

        Set<FoodItem> foodItems = new HashSet<>();
        RecipeManager recipeManager = new RecipeManager();
        Map<String, ?> allEntries = sharedPreferences.getAll();

        for (String entry : allEntries.keySet()) {
            foodItems.add(recipeManager.recipes.get(entry));
        }

        return foodItems;
    }

    public void saveFavorites(FoodItem foodItem) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(foodItem.getuId(), "");
        editor.apply();

    }

    public void removeFavorites(FoodItem foodItem) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove(foodItem.getuId());
        editor.apply();

    }

    public boolean isFavorited(FoodItem foodItem) {
        return sharedPreferences.contains(foodItem.getuId());

    }
}
