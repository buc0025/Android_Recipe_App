package com.example.gridview_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class OwnRecipe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_own_recipe);

        Intent intent = getIntent();
        final String title = intent.getStringExtra("Custom Title");
        final String category = intent.getStringExtra("Custom Category");
        final String description = intent.getStringExtra("Custom Description");
        final String ingredients = intent.getStringExtra("Custom Ingredients");
        final String directions = intent.getStringExtra("Custom Directions");

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

        final Button deleteRecipeBtn = findViewById(R.id.deleteRecipeBtn);
        final CustomRecipeManager customRecipeManager = new CustomRecipeManager(OwnRecipe.this);
        deleteRecipeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(OwnRecipe.this, "Custom Recipe is deleted", Toast.LENGTH_SHORT).show();
                CustomRecipe customRecipe = new CustomRecipe(title, category, description, ingredients, directions);
                customRecipeManager.removeRecipe(customRecipe);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.share_toolbar, menu);

        return true;
    }
}