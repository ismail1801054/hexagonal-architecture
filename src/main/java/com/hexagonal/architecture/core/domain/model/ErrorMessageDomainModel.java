package com.hexagonal.architecture.core.domain.model;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ErrorMessageDomainModel {
    private int statusCode;
    private Date timestamp;
    private String message;
}
