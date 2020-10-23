package com.example.recipe_app.managers;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.recipe_app.models.Recipe;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class AllRecipesManager {

    final private static String CUSTOM_RECIPES_SHARED_PREFS = "CUSTOM_RECIPES_SHARED_PREFS";
    private SharedPreferences sharedPreferences;

    public AllRecipesManager(Context context) {
        sharedPreferences = context.getSharedPreferences(CUSTOM_RECIPES_SHARED_PREFS, Context.MODE_PRIVATE);
    }

    public List<Recipe> getAllRecipes() {
        List<Recipe> allRecipes = new ArrayList<>();

        for (String entry : sharedPreferences.getAll().keySet()) {
            Gson gson = new Gson();
            String json = sharedPreferences.getString(entry, null);
            Recipe obj = gson.fromJson(json, Recipe.class);

            if (entry != null) {
                allRecipes.add(obj);
            }
        }

        for (Recipe recipe : PredefinedRecipeManager.allRecipesList) {
            allRecipes.add(recipe);
        }

        return allRecipes;
    }
}
