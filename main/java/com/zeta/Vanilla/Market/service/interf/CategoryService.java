package com.zeta.Vanilla.Market.service.interf;

import com.zeta.Vanilla.Market.dto.CategoryDto;
import com.zeta.Vanilla.Market.dto.Response;

public interface CategoryService {

    Response createCategory(CategoryDto categoryRequest);
    Response updateCategory(Long categoryId, CategoryDto categoryRequest);
    Response getAllCategories();
    Response getCategoryById(Long categoryId);
    Response deleteCategory(Long categoryId);
}
