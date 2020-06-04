package com.example.navigationdrawerfromscratch.account.recipes;

import android.media.Rating;
import android.widget.RatingBar;

import java.util.HashMap;

public class Recipe {

    private String recipeId;
    private String recipeName;
    private String ingredientsList; //private HashMap<String, String> ingredientsList;
    private String preparationTime;
    private String category;
    private String recipeImage;
    private int recipeRating;
    //private String bewertung; //nice-to-have


    public Recipe(String recipeId, String recipeName, String ingredientsList, String preparationTime, String category, String recipeImage, int recipeRating) {
        this.recipeId = recipeId;
        this.recipeName = recipeName;
        this.ingredientsList = ingredientsList;
        this.preparationTime = preparationTime;
        this.category = category;
        this.recipeImage = recipeImage;
        this.recipeRating = recipeRating;
    }

    public Recipe() {

    }

    public String getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getIngredientsList() {
        return ingredientsList;
    }

    public void setIngredientsList(String ingredientsList) {
        this.ingredientsList = ingredientsList;
    }

    public String getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(String preparationTime) {
        this.preparationTime = preparationTime;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRecipeImage() {
        return recipeImage;
    }

    public void setRecipeImage(String recipeImage) {
        this.recipeImage = recipeImage;
    }

    public int getRecipeRating() {
        return recipeRating;
    }

    public void setRecipeRating(int recipeRating) {
        this.recipeRating = recipeRating;
    }

    /*
    public String getBewertung() {
        return bewertung;
    }

    public void setBewertung(String bewertung) {
        this.bewertung = bewertung;
    }
     */
}
