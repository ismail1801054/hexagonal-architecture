package com.hexagonal.architecture.core.domain.usecase.impl;

import com.hexagonal.architecture.core.domain.model.CategoryDomainModel;
import com.hexagonal.architecture.core.domain.persistence.port.CategoryModifierPersistencePort;
import com.hexagonal.architecture.core.domain.usecase.CategoryModifierUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class CategoryModifierUseCaseImpl implements CategoryModifierUseCase {

    private final CategoryModifierPersistencePort categoryModifierPersistencePort;

    @Override
    public CategoryDomainModel createCategory(CategoryDomainModel category) {
        return categoryModifierPersistencePort.saveCategory(category);
    }

}
