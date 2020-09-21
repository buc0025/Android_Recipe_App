package com.example.gridview_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Favorites extends AppCompatActivity {

    private FavoritesRecyclerViewAdapter recyclerViewAdapter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview3_id);
        recyclerViewAdapter3 = new FavoritesRecyclerViewAdapter(this, RecipeManager.dinnerList);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(recyclerViewAdapter3);
    }
}