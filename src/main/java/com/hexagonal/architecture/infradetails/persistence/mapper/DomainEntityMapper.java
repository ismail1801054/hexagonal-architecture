package com.hexagonal.architecture.infradetails.persistence.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.time.LocalDate;
import java.util.List;

public interface DomainEntityMapper<T, S> {

    T entityToDomainModel(S entity);

    S domainModelToEntity(T domainModel);

    List<T> entityToDomainModel(List<S> entity);

    List<S> domainModelToEntity(List<T> model);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    S partialUpdate(T model, @MappingTarget S entity);

    default LocalDate mapEmptyStringToNull(String value) {
        return (value == null || value.isEmpty()) ? null : LocalDate.parse(value);
    }

}