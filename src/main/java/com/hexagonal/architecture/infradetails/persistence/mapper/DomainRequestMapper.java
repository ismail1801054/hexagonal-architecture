package com.hexagonal.architecture.infradetails.persistence.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.time.LocalDate;
import java.util.List;


public interface DomainRequestMapper<T, S> {

    T requestModelToDomainModel(S requestModel);

    S domainModelToRequestModel(T domainModel);

    List<T> requestModelToDomainModel(List<S> requestModel);

    List<S> domainModelToRequestModel(List<T> domainModel);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    S partialUpdate(T model, @MappingTarget S request);

    default LocalDate mapEmptyStringToNull(String value) {
        return (value == null || value.isEmpty()) ? null : LocalDate.parse(value);
    }

}