package com.example.gridview_recyclerview;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class CustomRecipeManager {

    final private static String CUSTOM_RECIPES_SHARED_PREFS = "CUSTOM_RECIPES_SHARED_PREFS";
    private SharedPreferences sharedPreferences;

    public CustomRecipeManager(Context context) {
        sharedPreferences = context.getSharedPreferences(CUSTOM_RECIPES_SHARED_PREFS, Context.MODE_PRIVATE);
    }

    public void saveRecipe(Recipe customRecipe) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(customRecipe);
        editor.putString(customRecipe.getTitle(), json);
        editor.commit();
    }

    public List<Recipe> getRecipes() {
        List<Recipe> customRecipes = new ArrayList<>();

        for (String entry : sharedPreferences.getAll().keySet()) {
            Gson gson = new Gson();
            String json = sharedPreferences.getString(entry, null);
            Recipe obj = gson.fromJson(json, Recipe.class);

            if (entry != null) {
                customRecipes.add(obj);
            }
        }
        return customRecipes;
    }

    public void removeRecipe(Recipe customRecipe) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove(customRecipe.getTitle());
        editor.apply();
    }
}
