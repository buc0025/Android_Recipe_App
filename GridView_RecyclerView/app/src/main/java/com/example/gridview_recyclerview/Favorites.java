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

        FavoritesManager favoritesManager = new FavoritesManager(Favorites.this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview3Id);
        recyclerViewAdapter3 = new FavoritesRecyclerViewAdapter(this, favoritesManager.getFavorites());
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(recyclerViewAdapter3);
    }
}