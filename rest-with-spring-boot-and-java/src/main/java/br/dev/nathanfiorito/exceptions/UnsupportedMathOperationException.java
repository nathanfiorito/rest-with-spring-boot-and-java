package br.dev.nathanfiorito.exceptions;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(BAD_REQUEST)
public class UnsupportedMathOperationException extends RuntimeException {
	private static final long seriaVersionUID = 1L;
	
	public UnsupportedMathOperationException(String ex) {
		super(ex);
	}
}
