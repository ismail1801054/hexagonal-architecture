package com.hexagonal.architecture.infrastructure.configuration;

import com.hexagonal.architecture.core.domain.persistence.port.CategoryModifierPersistencePort;
import com.hexagonal.architecture.core.domain.usecase.CategoryModifierUseCase;
import com.hexagonal.architecture.core.domain.usecase.impl.CategoryModifierUseCaseImpl;
import com.hexagonal.architecture.infradetails.persistence.adapter.CategoryModifierPersistencePortImpl;
import com.hexagonal.architecture.infradetails.persistence.mapper.CategoryDomainEntityMapper;
import com.hexagonal.architecture.infradetails.persistence.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class CategoryConfiguration {

    private final CategoryRepository categoryRepository;
    private final CategoryDomainEntityMapper categoryDomainEntityMapper;

    @Bean
    public CategoryModifierPersistencePort getCategoryModifierPersistencePortImpl() {
        return new CategoryModifierPersistencePortImpl(categoryRepository, categoryDomainEntityMapper);
    }

    @Bean
    public CategoryModifierUseCase getCategoryModifierUseCase() {
        return new CategoryModifierUseCaseImpl(getCategoryModifierPersistencePortImpl());
    }

}