package com.example.gridview_recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateRecipe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_recipe);

        Button createRecipeBtn = (Button) findViewById(R.id.createRecipeBtn);
        createRecipeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openOwnRecipeActivity();
            }
        });
    }

    public void openOwnRecipeActivity() {
        EditText ownRecipeTitle = findViewById(R.id.ownRecipeTitle);
        String title = ownRecipeTitle.getText().toString();
        EditText ownRecipeDescription = findViewById(R.id.ownRecipeDescription);
        String description = ownRecipeDescription.getText().toString();
        EditText ownRecipeIngredients = findViewById(R.id.ownRecipeIngredients);
        String ingredients = ownRecipeIngredients.getText().toString();
        EditText ownRecipeDirections = findViewById(R.id.ownRecipeDirections);
        String directions = ownRecipeDirections.getText().toString();

        Intent intent = new Intent(this, OwnRecipe.class);
        intent.putExtra("title", title);
        intent.putExtra("description", description);
        intent.putExtra("ingredients", ingredients);
        intent.putExtra("directions", directions);

        startActivity(intent);
    }
}