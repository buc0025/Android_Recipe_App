package com.example.gridview_recyclerview;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FavoritesManager {

    final private static String RECIPE_SHARED_PREFS = "shared prefs";
    private SharedPreferences sharedPreferences;

    public FavoritesManager(Context context) {
        sharedPreferences = context.getSharedPreferences(RECIPE_SHARED_PREFS, Context.MODE_PRIVATE);
    }

    public List<FoodItem> getFavorites() { //to do: return all food items

        List<FoodItem> foodItems = new ArrayList<>();

        for (String entry : sharedPreferences.getAll().keySet()) {
            if (entry != null) {
                foodItems.add(RecipeManager.recipeById.get(entry));
            }
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
