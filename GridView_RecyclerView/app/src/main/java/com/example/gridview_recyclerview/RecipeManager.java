package com.example.gridview_recyclerview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecipeManager {

    public Map<String, FoodItem> recipes = new HashMap<>();
    public List<FoodItem> breakfast;
    public List<FoodItem> lunch;
    public List<FoodItem> dinner;
    public List<FoodItem> appetizers;
    public List<FoodItem> dessert;
    public List<FoodItem> snacks;

    public RecipeManager() {
        breakfast = new ArrayList<>();
        breakfast.add(new FoodItem("Cereal", "Breakfast", "cereal", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n" +
                "Donec non ex in turpis porttitor mattis vel a velit.\n" +
                "Donec iaculis leo quis urna cursus, vitae molestie tortor aliquet.\n" +
                "Nulla volutpat turpis vel auctor efficitur.\n" +
                "Maecenas vulputate lorem sit amet dolor eleifend, at feugiat enim sollicitudin.\n" +
                "Sed ac ligula faucibus, dignissim risus auctor, blandit eros.\n" +
                "Aenean in tellus pulvinar, porttitor velit at, ullamcorper tellus.\n" +
                "Duis aliquam neque non lorem sagittis lobortis non sit amet arcu.",R.drawable.cereal, "no"));
        breakfast.add(new FoodItem("Pancakes", "Breakfast", "pancakes","Flapjacks for days!",R.drawable.pancakes, "no"));
        breakfast.add(new FoodItem("Waffles", "Breakfast", "waffles","Top this off with ice cream!",R.drawable.waffles, "no"));
        breakfast.add(new FoodItem("Pancakes", "Breakfast", "pancakes","Flapjacks for days!",R.drawable.pancakes, "no"));
        breakfast.add(new FoodItem("Cereal", "Breakfast", "cereal","The most important meal of the day",R.drawable.cereal, "no"));

        for (FoodItem b : breakfast) {
            recipes.put(b.getuId(), b);
        }

        lunch = new ArrayList<>();
        lunch.add(new FoodItem("Burger", "Lunch", "burger", "big juicy burger", R.drawable.hamburger, "no"));
        lunch.add(new FoodItem("Pizza", "Lunch", "Pizza", "big juicy burger", R.drawable.pizza, "no"));
        lunch.add(new FoodItem("Burger", "Lunch", "burger", "big juicy burger", R.drawable.hamburger, "no"));
        lunch.add(new FoodItem("Sushi", "Lunch", "sushi", "big juicy burger", R.drawable.sushi, "no"));
        for (FoodItem b : lunch) {
            recipes.put(b.getuId(), b);
        }

        dinner = new ArrayList<>();
        dinner.add(new FoodItem("Steak", "Dinner", "steak","Who can say no to a big juicy steak?",R.drawable.steak_dinner, "no"));
        dinner.add(new FoodItem("Sushi", "Dinner", "sushi","Yummy yummy sushi",R.drawable.sushi, "no"));
        dinner.add(new FoodItem("Fried Rice", "Dinner", "fried rice","Easy to prepare chinese food",R.drawable.fried_rice, "no"));
        dinner.add(new FoodItem("Fried Rice", "Dinner", "fried rice","Easy to prepare chinese food",R.drawable.fried_rice, "no"));
        dinner.add(new FoodItem("Steak", "Dinner", "steak","Who can say no to a big juicy steak?",R.drawable.steak_dinner, "no"));
        for (FoodItem b : dinner) {
            recipes.put(b.getuId(), b);
        }

        appetizers = new ArrayList<>();
        appetizers.add(new FoodItem("Sampler", "Appetizer", "sampler", "try everything", R.drawable.appetizers, "no"));
        appetizers.add(new FoodItem("Fries", "Appetizer", "fries", "try everything", R.drawable.fries, "no"));
        appetizers.add(new FoodItem("Sampler", "Appetizer", "sampler", "try everything", R.drawable.appetizers, "no"));
        appetizers.add(new FoodItem("Sliders", "Appetizer", "sliders", "try everything", R.drawable.hamburger, "no"));
        for (FoodItem b : appetizers) {
            recipes.put(b.getuId(), b);
        }

        snacks = new ArrayList<>();
        snacks.add(new FoodItem("Onion Rings", "Snacks", "onion rings","Great for any time of day", R.drawable.appetizers, "no"));
        snacks.add(new FoodItem("Ice Cream", "Snacks", "ice cream","I scream! You scream! We all scream for ice cream!",R.drawable.ice_cream, "no"));
        snacks.add(new FoodItem("Chips", "Snacks", "chips","Junk food to pig out to",R.drawable.chips, "no"));
        for (FoodItem b : snacks) {
            recipes.put(b.getuId(), b);
        }

        dessert = new ArrayList<>();
        dessert.add(new FoodItem("Ice Cream", "Dessert", "ice cream", "yummy ice cream", R.drawable.ice_cream, "no"));
        dessert.add(new FoodItem("Waffles", "Dessert", "waffle", "yummy ice cream", R.drawable.waffles, "no"));
        dessert.add(new FoodItem("Pancakes", "Dessert", "pancakes", "yummy ice cream", R.drawable.pancakes, "no"));
        dessert.add(new FoodItem("Pancakes", "Dessert", "pancakes", "yummy ice cream", R.drawable.pancakes, "no"));
        for (FoodItem b : dessert) {
            recipes.put(b.getuId(), b);
        }
    }
}
