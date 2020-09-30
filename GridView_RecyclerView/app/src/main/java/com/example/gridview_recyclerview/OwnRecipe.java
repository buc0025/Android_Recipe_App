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
        String title = intent.getStringExtra("Custom Title");
        String category = intent.getStringExtra("Custom Category");
        String description = intent.getStringExtra("Custom Description");
        String ingredients = intent.getStringExtra("Custom Ingredients");
        String directions = intent.getStringExtra("Custom Directions");

        TextView ownTitle = findViewById(R.id.ownTitle);
        TextView ownCategory = findViewById(R.id.ownCategory);
        TextView ownDescription = findViewById(R.id.ownDescription);
        TextView ownIngredients = findViewById(R.id.ownIngredients);
        TextView ownDirections = findViewById(R.id.ownDirections);

        ownTitle.setText(title);
        ownCategory.setText(category);
        ownDescription.setText(description);
        ownIngredients.setText(ingredients);
        ownDirections.setText(directions);
    }
}