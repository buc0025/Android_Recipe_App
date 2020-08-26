package com.example.gridview_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Food> lstFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstFood = new ArrayList<>();
        lstFood.add(new Food("Breakfast", "breakfast", "The most important meal of the day",R.drawable.cereal));
        lstFood.add(new Food("Lunch", "Lunch", "Meals to get rid of that afternoon hunger!",R.drawable.hamburger));
        lstFood.add(new Food("Dinner", "Dinner", "Who can say no to a big juicy steak?",R.drawable.steak_dinner));
        lstFood.add(new Food("Appetizers", "Appetizer", "Great way to start off dinner", R.drawable.appetizers));
        lstFood.add(new Food("Dessert", "Dessert", "I scream! You scream! We all scream for ice cream!",R.drawable.ice_cream));
        lstFood.add(new Food("Snacks", "Snacks", "Junk food to pig out to",R.drawable.chips));



        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, lstFood);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
    }
}