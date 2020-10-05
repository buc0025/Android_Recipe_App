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

public class MainActivity2 extends AppCompatActivity {

    private RecyclerViewAdapter2 myAdapter;

    List<Food> breakfast;
    List<Food> dinner;
    List<Food> snacks;
    Map<String, List<Food>> map = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        breakfast = new ArrayList<>();
        breakfast.add(new Food("Cereal", "Breakfast", "The most important meal of the day",R.drawable.cereal));
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


        map.put("Breakfast", breakfast);
        map.put("Dinner", dinner);
        map.put("Snacks", snacks);

        Intent intent = getIntent();
        String category = intent.getExtras().getString("meal_type");


        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview2_id);
        myAdapter = new RecyclerViewAdapter2(this, map.get(category));
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
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
                myAdapter.getFilter().filter(newText);
                return false;
            }
        });
        return true;
    }
}