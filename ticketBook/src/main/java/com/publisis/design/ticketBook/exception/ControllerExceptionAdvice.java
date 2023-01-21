package com.publisis.design.ticketBook.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.publisis.design.ticketBook.model.exception.ErrorResponse;

@ControllerAdvice
public class ControllerExceptionAdvice {

	@ExceptionHandler(CinemaNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleTheaterNotFoundException(final Exception exception,
			final HttpServletRequest request) {
		return new ResponseEntity<ErrorResponse>(new ErrorResponse(exception.getMessage()), HttpStatus.NOT_FOUND);
	}
}
