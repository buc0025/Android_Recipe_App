package com.example.gridview_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {

    List<Food> lstFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        lstFood = new ArrayList<>();
        lstFood.add(new Food("Dinner", "Dinner", "Who can say no to a big juicy steak?",R.drawable.steak_dinner));
        lstFood.add(new Food("Dinner", "Dinner", "Who can say no to a big juicy steak?",R.drawable.steak_dinner));
        lstFood.add(new Food("Dinner", "Dinner", "Who can say no to a big juicy steak?",R.drawable.steak_dinner));
        lstFood.add(new Food("Dinner", "Dinner", "Who can say no to a big juicy steak?",R.drawable.steak_dinner));
        lstFood.add(new Food("Dinner", "Dinner", "Who can say no to a big juicy steak?",R.drawable.steak_dinner));
        lstFood.add(new Food("Dinner", "Dinner", "Who can say no to a big juicy steak?",R.drawable.steak_dinner));
        lstFood.add(new Food("Dinner", "Dinner", "Who can say no to a big juicy steak?",R.drawable.steak_dinner));
        lstFood.add(new Food("Dinner", "Dinner", "Who can say no to a big juicy steak?",R.drawable.steak_dinner));
        lstFood.add(new Food("Dinner", "Dinner", "Who can say no to a big juicy steak?",R.drawable.steak_dinner));
        lstFood.add(new Food("Dinner", "Dinner", "Who can say no to a big juicy steak?",R.drawable.steak_dinner));
        lstFood.add(new Food("Dinner", "Dinner", "Who can say no to a big juicy steak?",R.drawable.steak_dinner));
        lstFood.add(new Food("Dinner", "Dinner", "Who can say no to a big juicy steak?",R.drawable.steak_dinner));
        lstFood.add(new Food("Dinner", "Dinner", "Who can say no to a big juicy steak?",R.drawable.steak_dinner));




        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview3_id);
        RecyclerViewAdapter3 myAdapter = new RecyclerViewAdapter3(this, lstFood);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
    }
}