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

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class RecipeCategories extends AppCompatActivity {
    private RecipeCategoriesRecyclerViewAdapter recipeCategoriesRecyclerViewAdapter;
    final int gridLayoutWidth = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_categories_page);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.homeNavigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.favoritesNavigation:
                        startActivity(new Intent(getApplicationContext(), Favorites.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.homeNavigation:
                        return true;
                    case R.id.customNavigation:
                        startActivity(new Intent(getApplicationContext(), CustomRecipesList.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.categoryRecyclerViewId);
        recipeCategoriesRecyclerViewAdapter = new RecipeCategoriesRecyclerViewAdapter(this, PredefinedRecipeManager.mainPageFoodCategories);
        recyclerView.setLayoutManager(new GridLayoutManager(this, gridLayoutWidth));
        recyclerView.setAdapter(recipeCategoriesRecyclerViewAdapter);
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
        if (id == R.id.favoritesToolBar) {
            Intent intent = new Intent(RecipeCategories.this, Favorites.class);
            startActivity(intent);
        }
        if (id == R.id.addRecipe) {
            Intent intent = new Intent(RecipeCategories.this, CreateRecipe.class);
            startActivity(intent);
        }
        if (id == R.id.ownRecipe) {
            Intent intent = new Intent(RecipeCategories.this, CustomRecipesList.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}