package com.blogapp.blogapp.service;

import com.blogapp.blogapp.dto.CategoryDto;

import javax.servlet.http.HttpSession;

public interface CategoryService {

    Object createCategory(CategoryDto categoryDto, HttpSession session);
}
