package com.springframwork.recipeapp.services;

import com.springframwork.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
