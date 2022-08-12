package com.springframwork.recipeapp.repositories;

import com.springframwork.recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}