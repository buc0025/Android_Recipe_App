package com.example.gridview_recyclerview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class PredefinedRecipeManager {

    public static HashMap<String, Recipe> recipeById;
    public static List<Recipe> mainPageFoodCategories;
    public static List<Recipe> breakfastList;
    public static List<Recipe> lunchList;
    public static List<Recipe> dinnerList;
    public static List<Recipe> appetizerList;
    public static List<Recipe> dessertList;
    public static List<Recipe> snackList;

    static {
        breakfastList = new ArrayList<>();
        breakfastList.add(new Recipe("Pancakes", "Pancakes", "Breakfast","Flapjacks for days!","salt\n"+"pepper\n"+"egg", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n" +
                "Vestibulum id nisi rutrum, lobortis nunc vitae, pretium justo.\n" +
                "Aliquam tempor risus ut lorem venenatis, ut ornare massa bibendum.\n" +
                "Etiam varius dui sit amet sapien euismod, in eleifend turpis gravida.\n" +
                "Maecenas a lorem ac nisi feugiat sodales non eu arcu.\n" +
                "Duis imperdiet neque sit amet felis egestas iaculis.\n" +
                "Quisque gravida tortor vel nisl laoreet euismod.",R.drawable.pancakes));
        breakfastList.add(new Recipe("Waffles", "Waffles", "Breakfast","Top this off with ice cream!","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.waffles));
        breakfastList.add(new Recipe("Pancakes2", "Pancakes", "Breakfast","Flapjacks for days!","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.pancakes));
        breakfastList.add(new Recipe("Cereal", "Cereal", "Breakfast","The most important meal of the day","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.cereal));
        lunchList = new ArrayList<>();
        lunchList.add(new Recipe("Burger", "Burger", "Lunch", "big juicy burger", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.hamburger));
        lunchList.add(new Recipe("Pizza", "Pizza", "Lunch", "big juicy burger", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.pizza));
        lunchList.add(new Recipe("Burger2", "Burger", "Lunch", "big juicy burger", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.hamburger));
        lunchList.add(new Recipe("Sushi", "Sushi", "Lunch", "big juicy burger", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.sushi));
        dinnerList =  new ArrayList<>();
        dinnerList.add(new Recipe("Steak", "Steak", "Dinner","Who can say no to a big juicy steak?","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.steak_dinner));
        dinnerList.add(new Recipe("Sushi", "Sushi", "Dinner","Yummy yummy sushi","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.sushi));
        dinnerList.add(new Recipe("Fried Rice", "Fried Rice", "Dinner","Easy to prepare chinese food","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.fried_rice));
        dinnerList.add(new Recipe("Fried Rice2", "Fried Rice", "Dinner","Easy to prepare chinese food","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.fried_rice));
        dinnerList.add(new Recipe("Steak2", "Steak", "Dinner","Who can say no to a big juicy steak?","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.steak_dinner));
        appetizerList = new ArrayList<>();
        appetizerList.add(new Recipe("Sampler", "Sampler", "Appetizer", "try everything", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.appetizers));
        appetizerList.add(new Recipe("Fries", "Fries", "Appetizer", "try everything", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.fries));
        appetizerList.add(new Recipe("Sampler2", "Sampler", "Appetizer", "try everything", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.appetizers));
        appetizerList.add(new Recipe("Sliders", "Sliders", "Appetizer", "try everything", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.hamburger));
        snackList = new ArrayList<>();
        snackList.add(new Recipe("Onion Rings", "Onion Rings", "Snacks","Great for any time of day", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.appetizers));
        snackList.add(new Recipe("Ice Cream", "Ice Cream", "Snacks","I scream! You scream! We all scream for ice cream!","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.ice_cream));
        snackList.add(new Recipe("Chips", "Chips", "Snacks","Junk food to pig out to","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.chips));
        dessertList = new ArrayList<>();
        dessertList.add(new Recipe("Ice Cream2", "Ice Cream", "Dessert", "yummy ice cream", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.ice_cream));
        dessertList.add(new Recipe("Waffles2", "Waffles", "Dessert", "yummy ice cream", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.waffles));
        dessertList.add(new Recipe("Pancakes3", "Pancakes", "Dessert", "yummy ice cream", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.pancakes));
        dessertList.add(new Recipe("Pancakes4", "Pancakes", "Dessert", "yummy ice cream", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.pancakes));

        mainPageFoodCategories = new ArrayList<>();
        mainPageFoodCategories.add(new Recipe("Breakfast category", "Breakfast", "Breakfast", "The most important meal of the day","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.cereal));
        mainPageFoodCategories.add(new Recipe("Lunch category", "Lunch", "Lunch","Meals to get rid of that afternoon hunger!","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.hamburger));
        mainPageFoodCategories.add(new Recipe("Dinner category", "Dinner", "Dinner","Who can say no to a big juicy steak?","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.steak_dinner));
        mainPageFoodCategories.add(new Recipe("Appetizer category", "Appetizer", "Appetizer","Great way to start off dinner", "salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.appetizers));
        mainPageFoodCategories.add(new Recipe("Dessert category", "Dessert", "Dessert","I scream! You scream! We all scream for ice cream!","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.ice_cream));
        mainPageFoodCategories.add(new Recipe("Snacks category", "Snacks", "Snacks","Junk food to pig out to","salt\n"+"pepper\n"+"egg", "put in over for 20 minutes\n"+"take out to cool",R.drawable.chips));

        recipeById = new HashMap<>();
        for (Recipe i : breakfastList) {
            recipeById.put(i.getuId(), i);
        }
        for (Recipe i : lunchList) {
            recipeById.put(i.getuId(), i);
        }
        for (Recipe i : dinnerList) {
            recipeById.put(i.getuId(), i);
        }
        for (Recipe i : dessertList) {
            recipeById.put(i.getuId(), i);
        }
        for (Recipe i : appetizerList) {
            recipeById.put(i.getuId(), i);
        }
        for (Recipe i : snackList) {
            recipeById.put(i.getuId(), i);
        }
    }
}