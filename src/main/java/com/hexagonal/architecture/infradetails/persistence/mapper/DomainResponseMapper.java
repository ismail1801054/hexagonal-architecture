package com.hexagonal.architecture.infradetails.persistence.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;


public interface DomainResponseMapper<T, S> {

    T responseModelToDomainModel(S responseModel);

    S domainModelToResponseModel(T domainModel);

    List<T> responseModelToDomainModel(List<S> responseModel);

    List<S> domainModelToResponseModel(List<T> responseModel);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    S partialUpdate(T model, @MappingTarget S response);

}