package com.hexagonal.architecture.infradetails.persistence.repository;

import com.hexagonal.architecture.infradetails.persistence.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

}
