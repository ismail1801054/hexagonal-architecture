package com.hexagonal.architecture.infrastructure.exceptions;

public class BadRequestException extends InternalServerException {

    private static final long serialVersionUID = -5330068136795055851L;

    public BadRequestException(final String message) {
        super(message);
    }

}
