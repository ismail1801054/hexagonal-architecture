package com.hexagonal.architecture.infrastructure.exceptions;

import com.hexagonal.architecture.core.domain.model.ErrorMessageDomainModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorMessageDomainModel> resourceNotFoundException(NotFoundException ex) {
        ErrorMessageDomainModel message = new ErrorMessageDomainModel(
                HttpStatus.NOT_FOUND.value(),
                new Date(),
                ex.getMessage());

        return new ResponseEntity<ErrorMessageDomainModel>(message, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ConflictException.class)
    public ResponseEntity<ErrorMessageDomainModel> resourceConflictException(ConflictException ex) {
        ErrorMessageDomainModel message = new ErrorMessageDomainModel(
                HttpStatus.CONFLICT.value(),
                new Date(),
                ex.getMessage());

        return new ResponseEntity<ErrorMessageDomainModel>(message, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(UnprocessableContentException.class)
    public ResponseEntity<ErrorMessageDomainModel> unprocessableContentException(UnprocessableContentException ex) {
        ErrorMessageDomainModel message = new ErrorMessageDomainModel(
                HttpStatus.UNPROCESSABLE_ENTITY.value(),
                new Date(),
                ex.getMessage());

        return new ResponseEntity<ErrorMessageDomainModel>(message, HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @ExceptionHandler(InternalServerException.class)
    public ResponseEntity<ErrorMessageDomainModel> internalServerException(InternalServerException ex) {
        ErrorMessageDomainModel message = new ErrorMessageDomainModel(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                new Date(),
                ex.getMessage());

        return new ResponseEntity<ErrorMessageDomainModel>(message, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ErrorMessageDomainModel> badRequestException(BadRequestException ex) {
        ErrorMessageDomainModel message = new ErrorMessageDomainModel(
                HttpStatus.BAD_REQUEST.value(),
                new Date(),
                ex.getMessage());

        return new ResponseEntity<ErrorMessageDomainModel>(message, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(BookingOverlapException.class)
    public ResponseEntity<ErrorMessageDomainModel> resourceNotFoundException(BookingOverlapException ex) {
        ErrorMessageDomainModel message = new ErrorMessageDomainModel(
                HttpStatus.CONFLICT.value(),
                new Date(),
                ex.getMessage());

        return new ResponseEntity<ErrorMessageDomainModel>(message, HttpStatus.CONFLICT);
    }

//    @ExceptionHandler({ForbiddenException.class, AccessDeniedException.class})
//    public ResponseEntity<ErrorMessageDomainModel> forbiddenException(Exception ex){
//        ErrorMessageDomainModel message = new ErrorMessageDomainModel(
//                HttpStatus.FORBIDDEN.value(),
//                new Date(),
//                ErrorMessageConstant.ACCESS_DENIED.getMessage());
//        return new ResponseEntity<>(message, HttpStatus.FORBIDDEN);
//    }

    @ExceptionHandler(DataNotFoundException.class)
    public ResponseEntity<ErrorMessageDomainModel> dataNotFoundException(DataNotFoundException ex) {
        ErrorMessageDomainModel message = new ErrorMessageDomainModel(
                HttpStatus.OK.value(),
                new Date(),
                ex.getMessage());
        return new ResponseEntity<ErrorMessageDomainModel>(message, HttpStatus.OK);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorMessageDomainModel> globalExceptionHandler(Exception ex) {
        ErrorMessageDomainModel message = new ErrorMessageDomainModel(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                new Date(),
                ex.getMessage());

        return new ResponseEntity<ErrorMessageDomainModel>(message, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
