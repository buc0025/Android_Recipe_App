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

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.insideCategoryRecyclerViewId);
        insideRecipeCategoryRecyclerViewAdapter = new InsideRecipeCategoryRecyclerViewAdapter(this, categoriesMap.get(category));
        recyclerView.setLayoutManager(new GridLayoutManager(this, gridLayoutWidth));
        recyclerView.setAdapter(insideRecipeCategoryRecyclerViewAdapter);
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
                insideRecipeCategoryRecyclerViewAdapter.getFilter().filter(newText);
                return false;
            }
        });
        return true;
    }
}