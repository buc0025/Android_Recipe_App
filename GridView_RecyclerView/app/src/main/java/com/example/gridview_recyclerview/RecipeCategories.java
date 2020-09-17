package com.example.gridview_recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class RecipeCategories extends AppCompatActivity {
    private RecipeCategoriesRecyclerViewAdapter recyclerViewAdapter;

    List<FoodItem> foodCategories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_categories_page);

        foodCategories = new ArrayList<>();
        foodCategories.add(new FoodItem("Breakfast", "Breakfast", "breakfast category", "The most important meal of the day",R.drawable.cereal, "no"));
        foodCategories.add(new FoodItem("Lunch", "Lunch", "lunch category","Meals to get rid of that afternoon hunger!",R.drawable.hamburger, "no"));
        foodCategories.add(new FoodItem("Dinner", "Dinner", "dinner category","Who can say no to a big juicy steak?",R.drawable.steak_dinner, "no"));
        foodCategories.add(new FoodItem("Appetizers", "Appetizer", "appetizer category","Great way to start off dinner", R.drawable.appetizers, "no"));
        foodCategories.add(new FoodItem("Dessert", "Dessert", "dessert category","I scream! You scream! We all scream for ice cream!",R.drawable.ice_cream, "no"));
        foodCategories.add(new FoodItem("Snacks", "Snacks", "snacks category","Junk food to pig out to",R.drawable.chips, "no"));



        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview_id);
        recyclerViewAdapter = new RecipeCategoriesRecyclerViewAdapter(this, foodCategories);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(recyclerViewAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.favorites_toolbar, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.favorites_toolBar) {
            Intent intent = new Intent(RecipeCategories.this, Favorites.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}