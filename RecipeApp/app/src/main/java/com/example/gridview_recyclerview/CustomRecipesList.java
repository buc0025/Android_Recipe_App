package com.example.gridview_recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class CustomRecipesList extends AppCompatActivity {

    private CustomRecipeRecyclerViewAdapter customRecipeRecyclerViewAdapter;
    final int gridLayoutWidth = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_recipes_list);

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
                        startActivity(new Intent(getApplicationContext(), RecipeCategories.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.customNavigation:
                        startActivity(new Intent(getApplicationContext(), CustomRecipesList.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

        CustomRecipeManager customRecipeManager = new CustomRecipeManager(CustomRecipesList.this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.customRecipeRecyclerViewId);
        customRecipeRecyclerViewAdapter = new CustomRecipeRecyclerViewAdapter(this, customRecipeManager.getRecipes());
        recyclerView.setLayoutManager(new GridLayoutManager(this, gridLayoutWidth));
        recyclerView.setAdapter(customRecipeRecyclerViewAdapter);
    }
}