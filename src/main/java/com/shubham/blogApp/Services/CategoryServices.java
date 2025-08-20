package com.shubham.blogApp.Services;

import com.shubham.blogApp.Payloads.CategoryDto;

import java.util.List;

public interface CategoryServices {

    CategoryDto createCategory(CategoryDto categoryDto); //Create

    CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);  // update

    void deleteCategory(Integer categoryId); // Delete

    CategoryDto getCategory(Integer categoryId); // Get

    List<CategoryDto> getAllCategories(); // GetAll

}
