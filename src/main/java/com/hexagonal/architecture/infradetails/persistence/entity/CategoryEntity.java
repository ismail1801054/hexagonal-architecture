package com.hexagonal.architecture.infradetails.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "category")
public class CategoryEntity extends Auditable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "categorySeq")
	@SequenceGenerator(name = "categorySeq", sequenceName = "category_id_seq", allocationSize=1)
	private Long id;

	@Column(name = "name", unique = true)
	private String name;

	@Column(name = "available")
	private Boolean available;

}
