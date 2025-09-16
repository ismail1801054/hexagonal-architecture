package com.hexagonal.architecture.infrastructure.exceptions;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;

@EqualsAndHashCode(callSuper = true)
@Data
public class BookingOverlapException extends RuntimeException {

    private HttpStatus httpStatus;

    public BookingOverlapException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}
