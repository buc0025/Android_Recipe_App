package com.example.gridview_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class RecipeCategories extends AppCompatActivity {
    private RecipeCategoriesRecyclerViewAdapter recyclerViewAdapter;

    List<Food> categoriesOfFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_categories_page);

        categoriesOfFood = new ArrayList<>();
        categoriesOfFood.add(new Food("Breakfast", "Breakfast", "The most important meal of the day",R.drawable.cereal));
        categoriesOfFood.add(new Food("Lunch", "Lunch", "Meals to get rid of that afternoon hunger!",R.drawable.hamburger));
        categoriesOfFood.add(new Food("Dinner", "Dinner", "Who can say no to a big juicy steak?",R.drawable.steak_dinner));
        categoriesOfFood.add(new Food("Appetizers", "Appetizer", "Great way to start off dinner", R.drawable.appetizers));
        categoriesOfFood.add(new Food("Dessert", "Dessert", "I scream! You scream! We all scream for ice cream!",R.drawable.ice_cream));
        categoriesOfFood.add(new Food("Snacks", "Snacks", "Junk food to pig out to",R.drawable.chips));



        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview_id);
        recyclerViewAdapter = new RecipeCategoriesRecyclerViewAdapter(this, categoriesOfFood);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(recyclerViewAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.example_menu, menu);

        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) searchItem.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                recyclerViewAdapter.getFilter().filter(newText);
                return false;
            }
        });
        return true;
    }
}