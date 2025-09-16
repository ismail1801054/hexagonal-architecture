package com.hexagonal.architecture.infradetails.persistence.mapper;

import com.hexagonal.architecture.core.domain.model.CategoryDomainModel;
import com.hexagonal.architecture.infradetails.persistence.entity.CategoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CategoryDomainEntityMapper extends DomainEntityMapper<CategoryDomainModel, CategoryEntity> {

}
