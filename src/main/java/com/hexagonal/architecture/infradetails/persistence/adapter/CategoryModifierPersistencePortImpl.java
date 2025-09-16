package com.hexagonal.architecture.infradetails.persistence.adapter;

import com.hexagonal.architecture.core.domain.model.CategoryDomainModel;
import com.hexagonal.architecture.core.domain.persistence.port.CategoryModifierPersistencePort;
import com.hexagonal.architecture.infradetails.persistence.entity.CategoryEntity;
import com.hexagonal.architecture.infradetails.persistence.mapper.CategoryDomainEntityMapper;
import com.hexagonal.architecture.infradetails.persistence.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CategoryModifierPersistencePortImpl implements CategoryModifierPersistencePort {
    private final CategoryRepository categoryRepository;
    private final CategoryDomainEntityMapper categoryDomainEntityMapper;


    @Override
    public CategoryDomainModel saveCategory(CategoryDomainModel categoryDomainModel) {
        CategoryEntity entity = categoryRepository.save(categoryDomainEntityMapper.domainModelToEntity(categoryDomainModel));
        return categoryDomainEntityMapper.entityToDomainModel(entity);
    }

}
