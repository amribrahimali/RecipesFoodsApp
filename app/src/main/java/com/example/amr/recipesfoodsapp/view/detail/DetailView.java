package com.example.amr.recipesfoodsapp.view.detail;

import com.example.amr.recipesfoodsapp.model.Meals;

public interface DetailView {
    void showLoading();
    void hideLoading();
    void setMeal(Meals.Meal meal);
    void onErrorLoading(String message);

}
