package com.example.gridview_recyclerview;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class CustomRecipeManager {

    final private static String CUSTOM_SHARED_PREFS = "custom shared prefs";
    private SharedPreferences sharedPreferences;

    public CustomRecipeManager(Context context) {
        sharedPreferences = context.getSharedPreferences(CUSTOM_SHARED_PREFS, Context.MODE_PRIVATE);
    }

    public void saveRecipe(CustomRecipe item) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(CreateRecipe.class);
        editor.putString("custom list", json);
        editor.commit();
    }

    public void loadRecipe() {
        Gson gson = new Gson();
        String json = sharedPreferences.getString("custom list", null);
        Type type = new TypeToken<List<CustomRecipe>>() {}.getType();

    }


    public List<CustomRecipe> getRecipes() {

        List<CustomRecipe> customRecipes = new ArrayList<>();
//****************how to add user's input into custom recipe??*****************
//        for (String entry : sharedPreferences.getAll().keySet()) {
//            if (entry != null) {
//                customRecipes.add();
//            }
//        }
        return customRecipes;
    }
}
