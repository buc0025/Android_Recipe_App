package com.example.gridview_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    List<Food> lstFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lstFood = new ArrayList<>();
        lstFood.add(new Food("Breakfast", "breakfast", "The most important meal of the day",R.drawable.cereal));
        lstFood.add(new Food("Breakfast", "breakfast", "The most important meal of the day",R.drawable.cereal));
        lstFood.add(new Food("Breakfast", "breakfast", "The most important meal of the day",R.drawable.cereal));
        lstFood.add(new Food("Breakfast", "breakfast", "The most important meal of the day",R.drawable.cereal));
        lstFood.add(new Food("Breakfast", "breakfast", "The most important meal of the day",R.drawable.cereal));
        lstFood.add(new Food("Breakfast", "breakfast", "The most important meal of the day",R.drawable.cereal));
        lstFood.add(new Food("Breakfast", "breakfast", "The most important meal of the day",R.drawable.cereal));
        lstFood.add(new Food("Breakfast", "breakfast", "The most important meal of the day",R.drawable.cereal));
        lstFood.add(new Food("Breakfast", "breakfast", "The most important meal of the day",R.drawable.cereal));
        lstFood.add(new Food("Breakfast", "breakfast", "The most important meal of the day",R.drawable.cereal));
        lstFood.add(new Food("Breakfast", "breakfast", "The most important meal of the day",R.drawable.cereal));
        lstFood.add(new Food("Breakfast", "breakfast", "The most important meal of the day",R.drawable.cereal));




        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview2_id);
        RecyclerViewAdapter2 myAdapter = new RecyclerViewAdapter2(this, lstFood);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
    }
}