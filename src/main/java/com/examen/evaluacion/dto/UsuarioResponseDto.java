package com.examen.evaluacion.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import com.examen.evaluacion.entity.Phones;

public class UsuarioResponseDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String email;
	private String password;

	private List<Phones> phones;
	private UUID id;
	private LocalDateTime created;
	private LocalDateTime modified;
	private LocalDateTime last_login;
	private String token;
	private Boolean isactive;
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
	
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public LocalDateTime getCreated() {
		return created;
	}
	public void setCreated(LocalDateTime created) {
		this.created = created;
	}
	public LocalDateTime getModified() {
		return modified;
	}
	public void setModified(LocalDateTime modified) {
		this.modified = modified;
	}
	public LocalDateTime getLast_login() {
		return last_login;
	}
	public void setLast_login(LocalDateTime last_login) {
		this.last_login = last_login;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Boolean getIsactive() {
		return isactive;
	}
	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
