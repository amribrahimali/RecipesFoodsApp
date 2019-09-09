package com.example.amr.recipesfoodsapp.view.home;

import com.example.amr.recipesfoodsapp.model.Categories;
import com.example.amr.recipesfoodsapp.model.Meals;

import java.util.List;

public interface HomeView {

    void showLoading();
    void hideLoading();
    void setMeal(List<Meals.Meal> meal);
    void setCategory(List<Categories.Category> category);
    void onErrorLoading(String message);
}
