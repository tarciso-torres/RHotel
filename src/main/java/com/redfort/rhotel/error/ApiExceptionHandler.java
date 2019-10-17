package com.redfort.rhotel.error;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.RequiredArgsConstructor;

@RestControllerAdvice
@RequiredArgsConstructor
public class ApiExceptionHandler {
	
	private static final String NO_MESSAGE_AVAILABLE = "No message available";
	private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(ApiExceptionHandler.class);

	private final MessageSource apiErrorMessageSource;

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorResponse> handleNotValidException(MethodArgumentNotValidException exception,
			Locale locale) {
		
		Stream<ObjectError> errors = exception.getBindingResult().getAllErrors().stream();
		
		List<ErrorResponse.ApiError> apiErrors = errors
				.map(ObjectError::getDefaultMessage)
				.map(code -> toApiError(code, locale))
				.collect(Collectors.toList());
		
		ErrorResponse errorResponse = ErrorResponse.od(HttpStatus.BAD_REQUEST, apiErrors);
		return ResponseEntity.badRequest().body(errorResponse);
		
	}
	
	private ErrorResponse.ApiError toApiError(String code, Locale locale){
		String message;
		try {
			message = apiErrorMessageSource.getMessage(code, null, locale);
			LOG.error("Could not find any message for {} code under {} locale", code, locale);
		}catch (NoSuchMessageException e) {
			message = NO_MESSAGE_AVAILABLE;
		}
		
		return new ErrorResponse.ApiError(code, message);
	}

}
