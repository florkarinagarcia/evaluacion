package com.examen.evaluacion.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.evaluacion.dto.UsuarioRequestDto;
import com.examen.evaluacion.dto.UsuarioResponseDto;
import com.examen.evaluacion.service.IUsuarioService;



@RestController
@RequestMapping("/user") // API
public class UsuarioController {

	@Autowired
	private IUsuarioService service;
	
	@PostMapping
	public ResponseEntity<UsuarioResponseDto> registrar(@Valid @RequestBody UsuarioRequestDto dto)
			throws Exception {
		UsuarioResponseDto responseDto = service.registrar(dto);
		return new ResponseEntity<UsuarioResponseDto>(responseDto, HttpStatus.CREATED);
	}
}
