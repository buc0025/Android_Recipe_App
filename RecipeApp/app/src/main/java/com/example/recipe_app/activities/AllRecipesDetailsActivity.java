package com.example.recipe_app.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recipe_app.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AllRecipesDetailsActivity extends AppCompatActivity {

    private TextView recipeName, recipeDescription, recipeCategory, recipeIngredients, recipeDirections;
    private ImageView recipeImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_recipes_details);

        recipeName = (TextView) findViewById(R.id.allRecipesTitle);
        recipeDescription = (TextView) findViewById(R.id.allRecipesDescription);
        recipeCategory = (TextView) findViewById(R.id.allRecipesCategory);
        recipeImage = (ImageView) findViewById(R.id.allRecipesThumbnail);
        recipeIngredients = (TextView) findViewById(R.id.allRecipesIngredients);
        recipeDirections = (TextView) findViewById(R.id.allRecipesDirections);

        //***********Receive data*************
        Intent intent = getIntent();
        final String id = intent.getExtras().getString("All Recipes Title");
        final String title = intent.getExtras().getString("All Recipes Title");
        final String category = intent.getExtras().getString("All Recipes Category");
        final String description = intent.getExtras().getString("All Recipes Description");
        final String ingredients = intent.getExtras().getString("All Recipes Ingredients");
        final String directions = intent.getExtras().getString("All Recipes Directions");
        final int image = intent.getExtras().getInt("All Recipes Thumbnail");

        //*********Setting values**********
        recipeName.setText(title);
        recipeDescription.setText(description);
        recipeCategory.setText(category);
        recipeImage.setImageResource(image);
        recipeIngredients.setText(ingredients);
        recipeDirections.setText(directions);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.homeNavigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.favoritesNavigation:
                        startActivity(new Intent(getApplicationContext(), FavoritesActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.homeNavigation:
                        startActivity(new Intent(getApplicationContext(), RecipeCategoriesActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.customNavigation:
                        startActivity(new Intent(getApplicationContext(), CustomRecipesListActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}