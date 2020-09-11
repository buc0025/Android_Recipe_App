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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InsideRecipeCategory extends AppCompatActivity {

    private InsideRecipeCategoryRecyclerViewAdapter recyclerViewAdapter2;

    List<Food> breakfast;
    List<Food> dinner;
    List<Food> snacks;
    Map<String, List<Food>> categoriesMap = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inside_recipe_category);


        breakfast = new ArrayList<>();
        breakfast.add(new Food("Cereal", "Breakfast", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n" +
                "Donec non ex in turpis porttitor mattis vel a velit.\n" +
                "Donec iaculis leo quis urna cursus, vitae molestie tortor aliquet.\n" +
                "Nulla volutpat turpis vel auctor efficitur.\n" +
                "Maecenas vulputate lorem sit amet dolor eleifend, at feugiat enim sollicitudin.\n" +
                "Sed ac ligula faucibus, dignissim risus auctor, blandit eros.\n" +
                "Aenean in tellus pulvinar, porttitor velit at, ullamcorper tellus.\n" +
                "Duis aliquam neque non lorem sagittis lobortis non sit amet arcu.",R.drawable.cereal));
        breakfast.add(new Food("Pancakes", "Breakfast", "Flapjacks for days!",R.drawable.pancakes));
        breakfast.add(new Food("Waffles", "Breakfast", "Top this off with ice cream!",R.drawable.waffles));
        breakfast.add(new Food("Pancakes", "Breakfast", "Flapjacks for days!",R.drawable.pancakes));
        breakfast.add(new Food("Cereal", "Breakfast", "The most important meal of the day",R.drawable.cereal));

        dinner = new ArrayList<>();
        dinner.add(new Food("Steak", "Dinner", "Who can say no to a big juicy steak?",R.drawable.steak_dinner));
        dinner.add(new Food("Sushi", "Dinner", "Yummy yummy sushi",R.drawable.sushi));
        dinner.add(new Food("Fried Rice", "Dinner", "Easy to prepare chinese food",R.drawable.fried_rice));
        dinner.add(new Food("Fried Rice", "Dinner", "Easy to prepare chinese food",R.drawable.fried_rice));
        dinner.add(new Food("Steak", "Dinner", "Who can say no to a big juicy steak?",R.drawable.steak_dinner));

        snacks = new ArrayList<>();
        snacks.add(new Food("Onion Rings", "Snacks", "Great for any time of day", R.drawable.appetizers));
        snacks.add(new Food("Ice Cream", "Snacks", "I scream! You scream! We all scream for ice cream!",R.drawable.ice_cream));
        snacks.add(new Food("Chips", "Snacks", "Junk food to pig out to",R.drawable.chips));


        categoriesMap.put("Breakfast", breakfast);
        categoriesMap.put("Dinner", dinner);
        categoriesMap.put("Snacks", snacks);

        Intent intent = getIntent();
        String category = intent.getExtras().getString("meal_type");


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview2_id);
        recyclerViewAdapter2 = new InsideRecipeCategoryRecyclerViewAdapter(this, categoriesMap.get(category));
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(recyclerViewAdapter2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);

        MenuItem searchItem = menu.findItem(R.id.action_search);
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