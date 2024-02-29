package com.examen.evaluacion.exception;

import java.time.LocalDateTime;

//POJO

public class ExcepcionResponse {

	private String mensaje;

	public  ExcepcionResponse(){}
	
	public ExcepcionResponse(String mensaje) {
		super();
		this.mensaje = mensaje;
	}
	
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
}
