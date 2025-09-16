package com.hexagonal.architecture.core.domain.usecase;

import com.hexagonal.architecture.core.domain.model.CategoryDomainModel;

public interface CategoryModifierUseCase {
    CategoryDomainModel createCategory(CategoryDomainModel categoryDomainModel);

}
