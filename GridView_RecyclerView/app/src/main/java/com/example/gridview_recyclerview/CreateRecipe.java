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
//                openOwnRecipeActivity();
                EditText ownRecipeTitle = findViewById(R.id.ownRecipeTitle);
                EditText ownRecipeCategory = findViewById(R.id.ownRecipeCategory);
                EditText ownRecipeDescription = findViewById(R.id.ownRecipeDescription);
                EditText ownRecipeIngredients = findViewById(R.id.ownRecipeIngredients);
                EditText ownRecipeDirections = findViewById(R.id.ownRecipeDirections);

                CustomRecipeManager customRecipeManager = new CustomRecipeManager(CreateRecipe.this);
                final CustomRecipe customRecipe = new CustomRecipe(ownRecipeTitle.getText().toString(),
                        ownRecipeCategory.getText().toString(),
                        ownRecipeDescription.getText().toString(),
                        ownRecipeIngredients.getText().toString(),
                        ownRecipeDirections.getText().toString());

                customRecipeManager.saveRecipe(customRecipe);

            }
        });
    }
        //***********Testing on saving recipe before opening new activity*****************
//    public void openOwnRecipeActivity() {
//        EditText ownRecipeTitle = findViewById(R.id.ownRecipeTitle);
//        String title = ownRecipeTitle.getText().toString();
//        EditText ownRecipeCategory = findViewById(R.id.ownRecipeCategory);
//        String category = ownRecipeCategory.getText().toString();
//        EditText ownRecipeDescription = findViewById(R.id.ownRecipeDescription);
//        String description = ownRecipeDescription.getText().toString();
//        EditText ownRecipeIngredients = findViewById(R.id.ownRecipeIngredients);
//        String ingredients = ownRecipeIngredients.getText().toString();
//        EditText ownRecipeDirections = findViewById(R.id.ownRecipeDirections);
//        String directions = ownRecipeDirections.getText().toString();
//
//        Intent intent = new Intent(this, OwnRecipe.class);
//        intent.putExtra("Custom Title", title);
//        intent.putExtra("Custom Category", category);
//        intent.putExtra("Custom Description", description);
//        intent.putExtra("Custom Ingredients", ingredients);
//        intent.putExtra("Custom Directions", directions);
//
//        startActivity(intent);
//    }
}