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

    List<FoodItem> breakfastList;
    List<FoodItem> lunchList;
    List<FoodItem> dinnerList;
    List<FoodItem> appetizerList;
    List<FoodItem> dessertList;
    List<FoodItem> snackList;

    Map<String, List<FoodItem>> categoriesMap = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inside_recipe_category);


        breakfastList = new ArrayList<>();
        breakfastList.add(new FoodItem("Cereal", "Breakfast", "cereal", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n" +
                "Donec non ex in turpis porttitor mattis vel a velit.\n" +
                "Donec iaculis leo quis urna cursus, vitae molestie tortor aliquet.\n" +
                "Nulla volutpat turpis vel auctor efficitur.\n" +
                "Maecenas vulputate lorem sit amet dolor eleifend, at feugiat enim sollicitudin.\n" +
                "Sed ac ligula faucibus, dignissim risus auctor, blandit eros.\n" +
                "Aenean in tellus pulvinar, porttitor velit at, ullamcorper tellus.\n" +
                "Duis aliquam neque non lorem sagittis lobortis non sit amet arcu.",R.drawable.cereal));
        breakfastList.add(new FoodItem("Pancakes", "Breakfast", "pancakes","Flapjacks for days!",R.drawable.pancakes));
        breakfastList.add(new FoodItem("Waffles", "Breakfast", "waffles","Top this off with ice cream!",R.drawable.waffles));
        breakfastList.add(new FoodItem("Pancakes", "Breakfast", "pancakes","Flapjacks for days!",R.drawable.pancakes));
        breakfastList.add(new FoodItem("Cereal", "Breakfast", "cereal","The most important meal of the day",R.drawable.cereal));

        lunchList = new ArrayList<>();
        lunchList.add(new FoodItem("Burger", "Lunch", "burger", "big juicy burger", R.drawable.hamburger));
        lunchList.add(new FoodItem("Pizza", "Lunch", "Pizza", "big juicy burger", R.drawable.pizza));
        lunchList.add(new FoodItem("Burger", "Lunch", "burger", "big juicy burger", R.drawable.hamburger));
        lunchList.add(new FoodItem("Sushi", "Lunch", "sushi", "big juicy burger", R.drawable.sushi));

        dinnerList = new ArrayList<>();
        dinnerList.add(new FoodItem("Steak", "Dinner", "steak","Who can say no to a big juicy steak?",R.drawable.steak_dinner));
        dinnerList.add(new FoodItem("Sushi", "Dinner", "sushi","Yummy yummy sushi",R.drawable.sushi));
        dinnerList.add(new FoodItem("Fried Rice", "Dinner", "fried rice","Easy to prepare chinese food",R.drawable.fried_rice));
        dinnerList.add(new FoodItem("Fried Rice", "Dinner", "fried rice","Easy to prepare chinese food",R.drawable.fried_rice));
        dinnerList.add(new FoodItem("Steak", "Dinner", "steak","Who can say no to a big juicy steak?",R.drawable.steak_dinner));

        appetizerList = new ArrayList<>();
        appetizerList.add(new FoodItem("Sampler", "Appetizer", "sampler", "try everything", R.drawable.appetizers));
        appetizerList.add(new FoodItem("Fries", "Appetizer", "fries", "try everything", R.drawable.fries));
        appetizerList.add(new FoodItem("Sampler", "Appetizer", "sampler", "try everything", R.drawable.appetizers));
        appetizerList.add(new FoodItem("Sliders", "Appetizer", "sliders", "try everything", R.drawable.hamburger));

        snackList = new ArrayList<>();
        snackList.add(new FoodItem("Onion Rings", "Snacks", "onion rings","Great for any time of day", R.drawable.appetizers));
        snackList.add(new FoodItem("Ice Cream", "Snacks", "ice cream","I scream! You scream! We all scream for ice cream!",R.drawable.ice_cream));
        snackList.add(new FoodItem("Chips", "Snacks", "chips","Junk food to pig out to",R.drawable.chips));

        dessertList = new ArrayList<>();
        dessertList.add(new FoodItem("Ice Cream", "Dessert", "ice cream", "yummy ice cream", R.drawable.ice_cream));
        dessertList.add(new FoodItem("Waffles", "Dessert", "waffle", "yummy ice cream", R.drawable.waffles));
        dessertList.add(new FoodItem("Pancakes", "Dessert", "pancakes", "yummy ice cream", R.drawable.pancakes));
        dessertList.add(new FoodItem("Pancakes", "Dessert", "pancakes", "yummy ice cream", R.drawable.pancakes));


        categoriesMap.put("Breakfast", breakfastList);
        categoriesMap.put("Lunch", lunchList);
        categoriesMap.put("Dinner", dinnerList);
        categoriesMap.put("Appetizer", appetizerList);
        categoriesMap.put("Dessert", dessertList);
        categoriesMap.put("Snacks", snackList);

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