package com.hexagonal.architecture.core.domain.model;

import java.io.Serializable;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryDomainModel implements Serializable{
	private Long id;
	private String name;
	private Boolean available;
}
