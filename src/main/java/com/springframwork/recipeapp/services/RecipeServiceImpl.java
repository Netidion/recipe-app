package com.springframwork.recipeapp.services;

import com.springframwork.recipeapp.domain.Recipe;
import com.springframwork.recipeapp.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Slf4j
public class RecipeServiceImpl implements RecipeService{

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        log.debug("I'm in the service!");

        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }

    public Recipe findById(long id) {

        Optional <Recipe> recipe = recipeRepository.findById(id);

        if(!recipe.isPresent()) {
            throw new RuntimeException("Recipe not found!");
        }

        return recipe.get();
    }

}
