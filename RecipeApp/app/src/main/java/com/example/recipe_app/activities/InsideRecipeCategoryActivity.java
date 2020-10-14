package com.example.recipe_app.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.recipe_app.models.InsideRecipeCategoryRecyclerViewAdapter;
import com.example.recipe_app.managers.PredefinedRecipeManager;
import com.example.recipe_app.R;
import com.example.recipe_app.models.Recipe;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InsideRecipeCategoryActivity extends AppCompatActivity {

    private InsideRecipeCategoryRecyclerViewAdapter insideRecipeCategoryRecyclerViewAdapter;
    final int gridLayoutWidth = 3;

    Map<String, List<Recipe>> categoriesMap = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inside_recipe_category);

        categoriesMap.put("Breakfast", PredefinedRecipeManager.breakfastList);
        categoriesMap.put("Lunch", PredefinedRecipeManager.lunchList);
        categoriesMap.put("Dinner", PredefinedRecipeManager.dinnerList);
        categoriesMap.put("Appetizer", PredefinedRecipeManager.appetizerList);
        categoriesMap.put("Dessert", PredefinedRecipeManager.dessertList);
        categoriesMap.put("Snacks", PredefinedRecipeManager.snackList);

        Intent intent = getIntent();
        String category = intent.getExtras().getString("meal_type");

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

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.insideCategoryRecyclerViewId);
        insideRecipeCategoryRecyclerViewAdapter = new InsideRecipeCategoryRecyclerViewAdapter(this, categoriesMap.get(category));
        recyclerView.setLayoutManager(new GridLayoutManager(this, gridLayoutWidth));
        recyclerView.setAdapter(insideRecipeCategoryRecyclerViewAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.search_toolbar, menu);

        MenuItem searchItem = menu.findItem(R.id.actionSearch);
        SearchView searchView = (SearchView) searchItem.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                insideRecipeCategoryRecyclerViewAdapter.getFilter().filter(newText);
                return false;
            }
        });
        return true;
    }
}