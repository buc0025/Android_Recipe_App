package com.example.gridview_recyclerview;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;

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
                foodItems.add(PredefinedRecipeManager.recipeById.get(entry));
            }
        }
        return foodItems;
    }

    public void saveFavorites(String uId) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(uId, "");
        editor.apply();
    }

    public void removeFavorites(String uId) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove(uId);
        editor.apply();
    }

    public boolean isFavorited(String uId) {
        return sharedPreferences.contains(uId);
    }
}
