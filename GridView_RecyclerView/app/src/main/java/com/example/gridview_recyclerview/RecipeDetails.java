package com.example.gridview_recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class RecipeDetails extends AppCompatActivity {

    private TextView recipeName, recipeDescription, recipeCategory, recipeIngredients, recipeDirections;
    private ImageView recipeImage;
    private Button favBtn;
    private Switch favSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_page);

        recipeName = (TextView) findViewById(R.id.txtTitle);
        recipeDescription = (TextView) findViewById(R.id.txtDescription);
        recipeCategory = (TextView) findViewById(R.id.txtCategory);
        recipeImage = (ImageView) findViewById(R.id.bookThumbnail);
        recipeIngredients = (TextView) findViewById(R.id.txtIngredients);
        recipeDirections = (TextView) findViewById(R.id.txtDirections);
//        favBtn = findViewById(R.id.favBtn);
//        favSwitch = findViewById(R.id.favSwitch);

        //***********Receive data*************
        Intent intent = getIntent();
        final String id = intent.getExtras().getString("Title");
        final String title = intent.getExtras().getString("Title");
        final String category = intent.getExtras().getString("Category");
        final String description = intent.getExtras().getString("Description");
        final String ingredients = intent.getExtras().getString("Ingredients");
        final String directions = intent.getExtras().getString("Directions");
        final int image = intent.getExtras().getInt("Thumbnail");

        final ToggleButton favBtn = findViewById(R.id.favBtn);
        FavoritesManager favoritesManager = new FavoritesManager(RecipeDetails.this);
        FoodItem foodItem = new FoodItem(id, title, category, description, ingredients, directions, image);
        favBtn.setChecked(favoritesManager.isFavorited(foodItem));

        favBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (favBtn.isChecked()) {
                    Toast.makeText(RecipeDetails.this, "Recipe favorited", Toast.LENGTH_SHORT).show();
                    FoodItem foodItem = new FoodItem(id, title, category, description, ingredients, directions, image);
                    FavoritesManager favoritesManager = new FavoritesManager(RecipeDetails.this);
                    favoritesManager.saveFavorites(foodItem);
                    favBtn.setChecked(true);
                } else {
                    Toast.makeText(RecipeDetails.this, "Recipe unfavorited", Toast.LENGTH_SHORT).show();
                    FoodItem foodItem = new FoodItem(id, title, category, description, ingredients, directions, image);
                    FavoritesManager favoritesManager = new FavoritesManager(RecipeDetails.this);
                    favoritesManager.removeFavorites(foodItem);
                    favBtn.setChecked(false);
                }
            }
        });

        //*********************If a switch is decided to be used to add and remove favorites*****************************

//        FavoritesManager favoritesManager = new FavoritesManager(RecipeDetails.this);
//        FoodItem foodItem = new FoodItem(id,title,category,description,ingredients,directions,image);
//        favSwitch.setChecked(favoritesManager.isFavorited(foodItem));
//
//        favSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean changed) {
//                if (changed) {
//                    Toast.makeText(RecipeDetails.this, "Saved to favorites", Toast.LENGTH_SHORT).show();
//                    FoodItem foodItem = new FoodItem(id, title, category, description, ingredients, directions, image);
//                    FavoritesManager favoritesManager = new FavoritesManager(RecipeDetails.this);
//                    favoritesManager.saveFavorites(foodItem);
//                    favSwitch.setChecked(true);
//                } else {
//                    Toast.makeText(RecipeDetails.this, "Remove from favorites", Toast.LENGTH_SHORT).show();
//                    FoodItem foodItem = new FoodItem(id, title, category, description, ingredients, directions, image);
//                    FavoritesManager favoritesManager = new FavoritesManager(RecipeDetails.this);
//                    favoritesManager.removeFavorites(foodItem);
//                    favSwitch.setChecked(false);
//                }
//            }
//        });

        //*********Setting values**********
        recipeName.setText(title);
        recipeDescription.setText(description);
        recipeCategory.setText(category);
        recipeImage.setImageResource(image);
        recipeIngredients.setText(ingredients);
        recipeDirections.setText(directions);
    }
}