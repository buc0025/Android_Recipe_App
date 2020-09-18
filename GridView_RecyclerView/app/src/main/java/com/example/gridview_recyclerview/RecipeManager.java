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
        breakfastList.add(new FoodItem("Pancakes", "Breakfast", "pancakes","Flapjacks for days!",R.drawable.pancakes));
        breakfastList.add(new FoodItem("Waffles", "Breakfast", "waffles","Top this off with ice cream!",R.drawable.waffles));
        breakfastList.add(new FoodItem("Pancakes", "Breakfast", "pancakes2","Flapjacks for days!",R.drawable.pancakes));
        breakfastList.add(new FoodItem("Cereal", "Breakfast", "cereal","The most important meal of the day",R.drawable.cereal));
        lunchList = new ArrayList<>();
        lunchList.add(new FoodItem("Burger", "Lunch", "burger", "big juicy burger", R.drawable.hamburger));
        lunchList.add(new FoodItem("Pizza", "Lunch", "pizza", "big juicy burger", R.drawable.pizza));
        lunchList.add(new FoodItem("Burger", "Lunch", "burger2", "big juicy burger", R.drawable.hamburger));
        lunchList.add(new FoodItem("Sushi", "Lunch", "sushi", "big juicy burger", R.drawable.sushi));
        dinnerList =  new ArrayList<>();
        dinnerList.add(new FoodItem("Steak", "Dinner", "steak","Who can say no to a big juicy steak?",R.drawable.steak_dinner));
        dinnerList.add(new FoodItem("Sushi", "Dinner", "sushi2","Yummy yummy sushi",R.drawable.sushi));
        dinnerList.add(new FoodItem("Fried Rice", "Dinner", "fried rice","Easy to prepare chinese food",R.drawable.fried_rice));
        dinnerList.add(new FoodItem("Fried Rice", "Dinner", "fried rice2","Easy to prepare chinese food",R.drawable.fried_rice));
        dinnerList.add(new FoodItem("Steak", "Dinner", "steak2","Who can say no to a big juicy steak?",R.drawable.steak_dinner));
        appetizerList = new ArrayList<>();
        appetizerList.add(new FoodItem("Sampler", "Appetizer", "sampler", "try everything", R.drawable.appetizers));
        appetizerList.add(new FoodItem("Fries", "Appetizer", "fries", "try everything", R.drawable.fries));
        appetizerList.add(new FoodItem("Sampler", "Appetizer", "sampler2", "try everything", R.drawable.appetizers));
        appetizerList.add(new FoodItem("Sliders", "Appetizer", "sliders", "try everything", R.drawable.hamburger));
        snackList = new ArrayList<>();
        snackList.add(new FoodItem("Onion Rings", "Snacks", "onion rings","Great for any time of day", R.drawable.appetizers));
        snackList.add(new FoodItem("Ice Cream", "Snacks", "ice cream","I scream! You scream! We all scream for ice cream!",R.drawable.ice_cream));
        snackList.add(new FoodItem("Chips", "Snacks", "chips","Junk food to pig out to",R.drawable.chips));
        dessertList = new ArrayList<>();
        dessertList.add(new FoodItem("Ice Cream", "Dessert", "ice cream2", "yummy ice cream", R.drawable.ice_cream));
        dessertList.add(new FoodItem("Waffles", "Dessert", "waffles2", "yummy ice cream", R.drawable.waffles));
        dessertList.add(new FoodItem("Pancakes", "Dessert", "pancakes3", "yummy ice cream", R.drawable.pancakes));
        dessertList.add(new FoodItem("Pancakes", "Dessert", "pancakes4", "yummy ice cream", R.drawable.pancakes));

        mainPageFoodCategories = new ArrayList<>();
        mainPageFoodCategories.add(new FoodItem("Breakfast", "Breakfast", "breakfast category", "The most important meal of the day",R.drawable.cereal));
        mainPageFoodCategories.add(new FoodItem("Lunch", "Lunch", "lunch category","Meals to get rid of that afternoon hunger!",R.drawable.hamburger));
        mainPageFoodCategories.add(new FoodItem("Dinner", "Dinner", "dinner category","Who can say no to a big juicy steak?",R.drawable.steak_dinner));
        mainPageFoodCategories.add(new FoodItem("Appetizers", "Appetizer", "appetizer category","Great way to start off dinner", R.drawable.appetizers));
        mainPageFoodCategories.add(new FoodItem("Dessert", "Dessert", "dessert category","I scream! You scream! We all scream for ice cream!",R.drawable.ice_cream));
        mainPageFoodCategories.add(new FoodItem("Snacks", "Snacks", "snacks category","Junk food to pig out to",R.drawable.chips));

        recipeById = new HashMap<>();
        recipeById.put("pancakes", new FoodItem("Pancakes", "Breakfast", "pancakes","Flapjacks for days!",R.drawable.pancakes));
        recipeById.put("waffles", new FoodItem("Waffles", "Breakfast", "waffles","Top this off with ice cream!",R.drawable.waffles));
        recipeById.put("pancakes2", new FoodItem("Pancakes", "Breakfast", "pancakes2","Flapjacks for days!",R.drawable.pancakes));
        recipeById.put("cereal", new FoodItem("Cereal", "Breakfast", "cereal","The most important meal of the day",R.drawable.cereal));
        recipeById.put("burger", new FoodItem("Burger", "Lunch", "burger", "big juicy burger", R.drawable.hamburger));
        recipeById.put("pizza", new FoodItem("Pizza", "Lunch", "pizza", "big juicy burger", R.drawable.pizza));
        recipeById.put("burger2", new FoodItem("Burger", "Lunch", "burger2", "big juicy burger", R.drawable.hamburger));
        recipeById.put("sushi",new FoodItem("Sushi", "Lunch", "sushi", "big juicy burger", R.drawable.sushi));
        recipeById.put("steak", new FoodItem("Steak", "Dinner", "steak","Who can say no to a big juicy steak?",R.drawable.steak_dinner));
        recipeById.put("sushi2", new FoodItem("Sushi", "Dinner", "sushi2","Yummy yummy sushi",R.drawable.sushi));
        recipeById.put("fried rice", new FoodItem("Fried Rice", "Dinner", "fried rice","Easy to prepare chinese food",R.drawable.fried_rice));
        recipeById.put("fried rice2", new FoodItem("Fried Rice", "Dinner", "fried rice2","Easy to prepare chinese food",R.drawable.fried_rice));
        recipeById.put("steak2", new FoodItem("Steak", "Dinner", "steak2","Who can say no to a big juicy steak?",R.drawable.steak_dinner));
        recipeById.put("sampler", new FoodItem("Sampler", "Appetizer", "sampler", "try everything", R.drawable.appetizers));
        recipeById.put("fries", new FoodItem("Fries", "Appetizer", "fries", "try everything", R.drawable.fries));
        recipeById.put("sampler2", new FoodItem("Sampler", "Appetizer", "sampler2", "try everything", R.drawable.appetizers));
        recipeById.put("sliders", new FoodItem("Sliders", "Appetizer", "sliders", "try everything", R.drawable.hamburger));
        recipeById.put("onion rings", new FoodItem("Onion Rings", "Snacks", "onion rings","Great for any time of day", R.drawable.appetizers));
        recipeById.put("ice cream", new FoodItem("Ice Cream", "Snacks", "ice cream","I scream! You scream! We all scream for ice cream!",R.drawable.ice_cream));
        recipeById.put("chips", new FoodItem("Chips", "Snacks", "chips","Junk food to pig out to",R.drawable.chips));
        recipeById.put("ice cream2", new FoodItem("Ice Cream", "Dessert", "ice cream2", "yummy ice cream", R.drawable.ice_cream));
        recipeById.put("waffles2", new FoodItem("Waffles", "Dessert", "waffles2", "yummy ice cream", R.drawable.waffles));
        recipeById.put("pancakes3", new FoodItem("Pancakes", "Dessert", "pancakes3", "yummy ice cream", R.drawable.pancakes));
        recipeById.put("pancakes4", new FoodItem("Pancakes", "Dessert", "pancakes4", "yummy ice cream", R.drawable.pancakes));
    }
    public List<FoodItem> getFoodCategory(Map<String, FoodItem> food) {
        List<FoodItem> items = new ArrayList<>();
        for (String f : foodId(food)) {
            items.add(recipeById.get(f));
        }

        return items;
    }
    public Set<String> foodId(Map<String, ?> food) {
        return food.keySet();
    }
}