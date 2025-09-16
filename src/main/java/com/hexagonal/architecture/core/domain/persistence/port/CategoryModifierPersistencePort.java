package com.hexagonal.architecture.core.domain.persistence.port;

import com.hexagonal.architecture.core.domain.model.CategoryDomainModel;


public interface CategoryModifierPersistencePort {

    CategoryDomainModel saveCategory(CategoryDomainModel categoryDomainModel);
}
