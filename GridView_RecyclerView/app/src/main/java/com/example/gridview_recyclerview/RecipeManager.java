package com.example.gridview_recyclerview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class RecipeManager {

    public static HashMap<String, FoodItem> recipeById;
    public static List<FoodItem> mainPageFoodCategories;
    public static List<FoodItem> breakfastList;
    public static List<FoodItem> lunchList;
    public static List<FoodItem> dinnerList;
    public static List<FoodItem> appetizerList;
    public static List<FoodItem> dessertList;
    public static List<FoodItem> snackList;

    static {
        breakfastList = new ArrayList<>();
        breakfastList.add(new FoodItem("Pancakes", "Pancakes", "Breakfast","Flapjacks for days!","salt\n"+"pepper\n"+"egg", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n" +
                "Vestibulum id nisi rutrum, lobortis nunc vitae, pretium justo.\n" +
                "Aliquam tempor risus ut lorem venenatis, ut ornare massa bibendum.\n" +
                "Etiam varius dui sit amet sapien euismod, in eleifend turpis gravida.\n" +
                "Maecenas a lorem ac nisi feugiat sodales non eu arcu.\n" +
                "Duis imperdiet neque sit amet felis egestas iaculis.\n" +
                "Quisque gravida tortor vel nisl laoreet euismod.",R.drawable.pancakes));
        breakfastList.add(new FoodItem("Waffles", "Waffles", "Breakfast","Top this off with ice cream!","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.waffles));
        breakfastList.add(new FoodItem("Pancakes2", "Pancakes", "Breakfast","Flapjacks for days!","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.pancakes));
        breakfastList.add(new FoodItem("Cereal", "Cereal", "Breakfast","The most important meal of the day","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.cereal));
        lunchList = new ArrayList<>();
        lunchList.add(new FoodItem("Burger", "Burger", "Lunch", "big juicy burger", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.hamburger));
        lunchList.add(new FoodItem("Pizza", "Pizza", "Lunch", "big juicy burger", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.pizza));
        lunchList.add(new FoodItem("Burger2", "Burger", "Lunch", "big juicy burger", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.hamburger));
        lunchList.add(new FoodItem("Sushi", "Sushi", "Lunch", "big juicy burger", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.sushi));
        dinnerList =  new ArrayList<>();
        dinnerList.add(new FoodItem("Steak", "Steak", "Dinner","Who can say no to a big juicy steak?","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.steak_dinner));
        dinnerList.add(new FoodItem("Sushi", "Sushi", "Dinner","Yummy yummy sushi","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.sushi));
        dinnerList.add(new FoodItem("Fried Rice", "Fried Rice", "Dinner","Easy to prepare chinese food","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.fried_rice));
        dinnerList.add(new FoodItem("Fried Rice2", "Fried Rice", "Dinner","Easy to prepare chinese food","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.fried_rice));
        dinnerList.add(new FoodItem("Steak2", "Steak", "Dinner","Who can say no to a big juicy steak?","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.steak_dinner));
        appetizerList = new ArrayList<>();
        appetizerList.add(new FoodItem("Sampler", "Sampler", "Appetizer", "try everything", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.appetizers));
        appetizerList.add(new FoodItem("Fries", "Fries", "Appetizer", "try everything", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.fries));
        appetizerList.add(new FoodItem("Sampler2", "Sampler", "Appetizer", "try everything", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.appetizers));
        appetizerList.add(new FoodItem("Sliders", "Sliders", "Appetizer", "try everything", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.hamburger));
        snackList = new ArrayList<>();
        snackList.add(new FoodItem("Onion Rings", "Onion Rings", "Snacks","Great for any time of day", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.appetizers));
        snackList.add(new FoodItem("Ice Cream", "Ice Cream", "Snacks","I scream! You scream! We all scream for ice cream!","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.ice_cream));
        snackList.add(new FoodItem("Chips", "Chips", "Snacks","Junk food to pig out to","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.chips));
        dessertList = new ArrayList<>();
        dessertList.add(new FoodItem("Ice Cream2", "Ice Cream", "Dessert", "yummy ice cream", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.ice_cream));
        dessertList.add(new FoodItem("Waffles2", "Waffles", "Dessert", "yummy ice cream", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.waffles));
        dessertList.add(new FoodItem("Pancakes3", "Pancakes", "Dessert", "yummy ice cream", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.pancakes));
        dessertList.add(new FoodItem("Pancakes4", "Pancakes", "Dessert", "yummy ice cream", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.pancakes));

        mainPageFoodCategories = new ArrayList<>();
        mainPageFoodCategories.add(new FoodItem("Breakfast category", "Breakfast", "Breakfast", "The most important meal of the day","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.cereal));
        mainPageFoodCategories.add(new FoodItem("Lunch category", "Lunch", "Lunch","Meals to get rid of that afternoon hunger!","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.hamburger));
        mainPageFoodCategories.add(new FoodItem("Dinner category", "Dinner", "Dinner","Who can say no to a big juicy steak?","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.steak_dinner));
        mainPageFoodCategories.add(new FoodItem("Appetizer category", "Appetizer", "Appetizer","Great way to start off dinner", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.appetizers));
        mainPageFoodCategories.add(new FoodItem("Dessert category", "Dessert", "Dessert","I scream! You scream! We all scream for ice cream!","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.ice_cream));
        mainPageFoodCategories.add(new FoodItem("Snacks category", "Snacks", "Snacks","Junk food to pig out to","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.chips));

        recipeById = new HashMap<>();
        recipeById.put("pancakes", new FoodItem("Pancakes", "Pancakes", "Breakfast","Flapjacks for days!","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.pancakes));
        recipeById.put("waffles", new FoodItem("Waffles", "Waffles", "Breakfast","Top this off with ice cream!","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.waffles));
        recipeById.put("pancakes2", new FoodItem("Pancakes2", "Pancakes", "Breakfast","Flapjacks for days!","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.pancakes));
        recipeById.put("cereal", new FoodItem("Cereal", "Cereal", "Breakfast","The most important meal of the day","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.cereal));
        recipeById.put("burger", new FoodItem("Burger", "Burger", "Lunch", "big juicy burger", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.hamburger));
        recipeById.put("pizza", new FoodItem("Pizza", "Pizza", "Lunch", "big juicy burger", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.pizza));
        recipeById.put("burger2", new FoodItem("Burger2", "Burger", "Lunch", "big juicy burger", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.hamburger));
        recipeById.put("sushi",new FoodItem("Sushi", "Sushi", "Lunch", "big juicy burger", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.sushi));
        recipeById.put("steak", new FoodItem("Steak", "Steak", "Dinner","Who can say no to a big juicy steak?","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.steak_dinner));
        recipeById.put("sushi2", new FoodItem("Sushi2", "Sushi", "Dinner","Yummy yummy sushi","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.sushi));
        recipeById.put("fried rice", new FoodItem("Fried Rice", "Fried Rice", "Dinner","Easy to prepare chinese food","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.fried_rice));
        recipeById.put("fried rice2", new FoodItem("Fried Rice2", "Fried Rice", "Dinner","Easy to prepare chinese food","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.fried_rice));
        recipeById.put("steak2", new FoodItem("Steak2", "Steak", "Dinner","Who can say no to a big juicy steak?","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.steak_dinner));
        recipeById.put("sampler", new FoodItem("Sampler", "Sampler", "Appetizer", "try everything", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.appetizers));
        recipeById.put("fries", new FoodItem("Fries", "Fries", "Appetizer", "try everything", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.fries));
        recipeById.put("sampler2", new FoodItem("Sampler2", "Sampler", "Appetizer", "try everything", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.appetizers));
        recipeById.put("sliders", new FoodItem("Sliders", "Sliders", "Appetizer", "try everything", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.hamburger));
        recipeById.put("onion rings", new FoodItem("Onion Rings", "Onion Rings", "Snacks","Great for any time of day", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.appetizers));
        recipeById.put("ice cream", new FoodItem("Ice Cream", "Ice Cream", "Snacks","I scream! You scream! We all scream for ice cream!","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.ice_cream));
        recipeById.put("chips", new FoodItem("Chips", "Chips", "Snacks","Junk food to pig out to","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.chips));
        recipeById.put("ice cream2", new FoodItem("Ice Cream2", "Ice Cream", "Dessert", "yummy ice cream", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.ice_cream));
        recipeById.put("waffles2", new FoodItem("Waffles2", "Waffles", "Dessert", "yummy ice cream", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.waffles));
        recipeById.put("pancakes3", new FoodItem("Pancakes3", "Pancakes", "Dessert", "yummy ice cream", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.pancakes));
        recipeById.put("pancakes4", new FoodItem("Pancakes4", "Pancakes", "Dessert", "yummy ice cream", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.pancakes));
    }
}