package com.examen.evaluacion.dto;

import java.io.Serializable;
import java.util.List;

import com.examen.evaluacion.entity.Phones;

public class UsuarioRequestDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String email;
	private String password;
	private List<Phones> phones;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Phones> getPhones() {
		return phones;
	}
	public void setPhones(List<Phones> phones) {
		this.phones = phones;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
