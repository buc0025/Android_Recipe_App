package com.example.gridview_recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OwnRecipe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_own_recipe);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String description = intent.getStringExtra("description");
        String ingredients = intent.getStringExtra("ingredients");
        String directions = intent.getStringExtra("directions");

        TextView ownTitle = findViewById(R.id.ownTitle);
        TextView ownDescription = findViewById(R.id.ownDescription);
        TextView ownIngredients = findViewById(R.id.ownIngredients);
        TextView ownDirections = findViewById(R.id.ownDirections);

        ownTitle.setText(title);
        ownDescription.setText(description);
        ownIngredients.setText(ingredients);
        ownDirections.setText(directions);
    }
}