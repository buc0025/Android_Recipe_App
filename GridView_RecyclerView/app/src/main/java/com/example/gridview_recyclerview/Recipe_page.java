package com.example.gridview_recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Recipe_page extends AppCompatActivity {

    private TextView recipe_name, recipe_description, recipe_category;
    private ImageView recipe_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_page);

        recipe_name = (TextView) findViewById(R.id.txtTitle);
        recipe_description = (TextView) findViewById(R.id.txtDescription);
        recipe_category = (TextView) findViewById(R.id.txtCategory);
        recipe_image = (ImageView) findViewById(R.id.bookthumbnail);

        //***********Receive data*************
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        String Category = intent.getExtras().getString("Category");
        int image = intent.getExtras().getInt("Thumbnail");

        //*********Setting values**********

        recipe_name.setText(Title);
        recipe_description.setText(Description);
        recipe_category.setText(Category);
        recipe_image.setImageResource(image);

    }
}