package com.example.amr.recipesfoodsapp.view.category;

import com.example.amr.recipesfoodsapp.model.Meals;

import java.util.List;

public interface CategoryView {

    void showLoading();
    void hideLoading();
    void setMeals(List<Meals.Meal> meals);
    void onErrorLoading(String message);
}
