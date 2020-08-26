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
        lstFood.add(new Food("Cereal", "breakfast", "The most important meal of the day",R.drawable.cereal));
        lstFood.add(new Food("Fries", "Snack", "Good to eat at any time!",R.drawable.fries));
        lstFood.add(new Food("Hamburger", "Lunch", "Big juicy lunch for all.",R.drawable.hamburger));
        lstFood.add(new Food("Sushi", "Dinner", "Fancy date night food",R.drawable.sushi));
        lstFood.add(new Food("Pizza", "Dinner", "Best food ever!",R.drawable.pizza));
        lstFood.add(new Food("Ice Cream", "Dessert", "You scream, I scream, we all scream for ice cream",R.drawable.ice_cream));
        lstFood.add(new Food("Hamburger", "Lunch", "Big juicy lunch for all.",R.drawable.hamburger));
        lstFood.add(new Food("Sushi", "Dinner", "Fancy date night food",R.drawable.sushi));
        lstFood.add(new Food("Cereal", "breakfast", "The most important meal of the day",R.drawable.cereal));
        lstFood.add(new Food("Fries", "Snack", "Good to eat at any time!",R.drawable.fries));
        lstFood.add(new Food("Pizza", "Dinner", "Best food ever!",R.drawable.pizza));
        lstFood.add(new Food("Ice Cream", "Dessert", "You scream, I scream, we all scream for ice cream",R.drawable.ice_cream));


        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, lstFood);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
    }
}