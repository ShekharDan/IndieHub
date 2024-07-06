package com.ecommerce.IndieHub.service;

import com.ecommerce.IndieHub.model.Category;

import java.util.List;

public interface CategoryService {
    public String deleteCategory(Long categoryId);

    List<Category> getAllCategories();
    void createCategory(Category category);

    Category updateCategory(Category category, Long categoryId);
}
