package com.examen.evaluacion.exception;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class ResponseExceptionHandler  extends ResponseEntityExceptionHandler  {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExcepcionResponse> manejartodasExcepciones(Exception ex, WebRequest resquest) {
		ExcepcionResponse er = new ExcepcionResponse(ex.getMessage());
		return new ResponseEntity<ExcepcionResponse>(er, HttpStatus.INTERNAL_SERVER_ERROR);

	}
	
	 @ExceptionHandler(ModeloNotFoundException.class) 
	 public ResponseEntity<ExcepcionResponse> 
	 manejarModeloNotFoundException(ModeloNotFoundException ex, WebRequest request){
		 ExcepcionResponse er = new  ExcepcionResponse(ex.getMessage());
			 return new ResponseEntity<ExcepcionResponse> (er,HttpStatus.NOT_FOUND);
	 }

	//@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String mensaje = ex.getMessage();//collect(Collectors.joining());
		
		ExcepcionResponse er = new ExcepcionResponse(mensaje);
		return new ResponseEntity<Object>(er,HttpStatus.BAD_REQUEST);
	}
}
