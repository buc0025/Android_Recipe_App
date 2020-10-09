package com.example.gridview_recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class RecipeDetails extends AppCompatActivity {

    private TextView recipeName, recipeDescription, recipeCategory, recipeIngredients, recipeDirections;
    private ImageView recipeImage;
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
        final FavoritesManager favoritesManager = new FavoritesManager(RecipeDetails.this);
        final Recipe foodItem = new Recipe(id, title, category, description, ingredients, directions, image);
        favBtn.setChecked(favoritesManager.isFavorited(foodItem.getuId()));

        favBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (favBtn.isChecked()) {
                    Toast.makeText(RecipeDetails.this, "Recipe favorited", Toast.LENGTH_SHORT).show();
                    favoritesManager.saveFavorites(foodItem.getuId());
                    favBtn.setChecked(true);
                } else {
                    Toast.makeText(RecipeDetails.this, "Recipe unfavorited", Toast.LENGTH_SHORT).show();
                    favoritesManager.removeFavorites(foodItem.getuId());
                    favBtn.setChecked(false);
                }
            }
        });

        //*********************If a switch is decided to be used to add and remove favorites*****************************

//        favSwitch.setChecked(favoritesManager.isFavorited(foodItem));
//
//        favSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean changed) {
//                if (changed) {
//                    Toast.makeText(RecipeDetails.this, "Saved to favorites", Toast.LENGTH_SHORT).show();
//                    favoritesManager.saveFavorites(foodItem);
//                    favSwitch.setChecked(true);
//                } else {
//                    Toast.makeText(RecipeDetails.this, "Remove from favorites", Toast.LENGTH_SHORT).show();
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.share_toolbar, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.shareRecipe) {
            Intent sharingIntent = new Intent(Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            String shareBody = "Your Body Here"; // link to recipe
            String shareSubject = "Your Subject Here";

            sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
            sharingIntent.putExtra(Intent.EXTRA_SUBJECT, shareSubject);

            startActivity(Intent.createChooser(sharingIntent, "Share Using"));
        }
        return super.onOptionsItemSelected(item);
    }
}