package com.example.gridview_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class CustomRecipesList extends AppCompatActivity {

    private CustomRecipeRecyclerViewAdapter customRecipeRecyclerViewAdapter;
    final int gridLayoutWidth = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_recipes_list);

        CustomRecipeManager customRecipeManager = new CustomRecipeManager(CustomRecipesList.this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.customRecipeRecyclerViewId);
        customRecipeRecyclerViewAdapter = new CustomRecipeRecyclerViewAdapter(this, customRecipeManager.getRecipes());
        recyclerView.setLayoutManager(new GridLayoutManager(this, gridLayoutWidth));
        recyclerView.setAdapter(customRecipeRecyclerViewAdapter);
    }
}