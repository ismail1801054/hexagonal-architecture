package com.hexagonal.architecture.infrastructure.controller;

import com.hexagonal.architecture.core.domain.model.CategoryDomainModel;
import com.hexagonal.architecture.core.domain.usecase.CategoryModifierUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/clean-arch/api/private/v1/category")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryModifierUseCase categoryModifierUseCase;


    @PostMapping
    public ResponseEntity<CategoryDomainModel> create(@RequestBody CategoryDomainModel category) {
        return ResponseEntity.ok(categoryModifierUseCase.createCategory(category));
    }

}
