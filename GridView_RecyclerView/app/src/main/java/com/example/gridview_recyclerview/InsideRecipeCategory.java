package com.example.gridview_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InsideRecipeCategory extends AppCompatActivity {

    private InsideRecipeCategoryRecyclerViewAdapter recyclerViewAdapter2;

    Map<String, List<FoodItem>> categoriesMap = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inside_recipe_category);

        categoriesMap.put("Breakfast", RecipeManager.breakfastList);
        categoriesMap.put("Lunch", RecipeManager.lunchList);
        categoriesMap.put("Dinner", RecipeManager.dinnerList);
        categoriesMap.put("Appetizer", RecipeManager.appetizerList);
        categoriesMap.put("Dessert", RecipeManager.dessertList);
        categoriesMap.put("Snacks", RecipeManager.snackList);

        Intent intent = getIntent();
        String category = intent.getExtras().getString("meal_type");

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview2Id);
        recyclerViewAdapter2 = new InsideRecipeCategoryRecyclerViewAdapter(this, categoriesMap.get(category));
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(recyclerViewAdapter2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);

        MenuItem searchItem = menu.findItem(R.id.actionSearch);
        SearchView searchView = (SearchView) searchItem.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                recyclerViewAdapter2.getFilter().filter(newText);
                return false;
            }
        });
        return true;
    }
}