package com.springframwork.recipeapp.controllers;

import com.springframwork.recipeapp.domain.Category;
import com.springframwork.recipeapp.domain.UnitOfMeasure;
import com.springframwork.recipeapp.repositories.CategoryRepository;
import com.springframwork.recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByCategoryName("Greek");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByUom("gr");

        System.out.println("Category Id id: " + categoryOptional.get().getId());
        System.out.println("UOM Id id: " + unitOfMeasureOptional.get().getId());

        return "index";
    }
}
