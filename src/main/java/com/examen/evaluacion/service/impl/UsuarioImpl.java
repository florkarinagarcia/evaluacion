package com.examen.evaluacion.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.evaluacion.dto.UsuarioRequestDto;
import com.examen.evaluacion.dto.UsuarioResponseDto;
import com.examen.evaluacion.entity.Phones;
import com.examen.evaluacion.entity.Usuario;
import com.examen.evaluacion.repo.IPhonesRepo;
import com.examen.evaluacion.repo.IUsuarioRepo;
import com.examen.evaluacion.service.IUsuarioService;

@Service
public class UsuarioImpl implements IUsuarioService{

	@Autowired
	private IPhonesRepo phoneRepo;

	@Autowired
	private IUsuarioRepo userRepo;
	
	@Override
	public UsuarioResponseDto registrar(UsuarioRequestDto request) throws Exception {
		//setea la entrada
		Usuario user = new Usuario();
		user.setName(request.getName());
		user.setEmail(request.getEmail());
		user.setPassword(request.getPassword());
		//user.setcreated(request.getcreate);
		//user.setmodified(request.getmodified)
		user.setLast_login(LocalDateTime.now());
		user.setToken(null);
		user.setIsactive(true);
		
		//Guarda y Recibe la Salida
		Usuario userResponseBD = userRepo.save(user);
		
		//para recibir la salida de los telefonos
		List<Phones> listPhones = new ArrayList<Phones>();
		
		//recorre la lista para recibir los telefonos
		request.getPhones().forEach(x -> {
			
			Phones phone = new Phones();
			phone.setNumber(x.getNumber());
			phone.setCitycode(x.getCitycode());
			phone.setContrycode(x.getContrycode());
			
			Phones telefono = phoneRepo.save(phone);
			
			listPhones.add(telefono);
		});
		
		
		// salida response dto
		UsuarioResponseDto responseDto = new UsuarioResponseDto();
		responseDto.setName(userResponseBD.getName());
		responseDto.setEmail(userResponseBD.getEmail());
		responseDto.setPassword(userResponseBD.getPassword());
		responseDto.setLast_login(userResponseBD.getLast_login());
		responseDto.setToken(userResponseBD.getToken());
		responseDto.setIsactive(userResponseBD.getIsactive());
		responseDto.setPhones(listPhones);	
		responseDto.setId(userResponseBD.getIdUsurio());
		responseDto.setCreated(userResponseBD.getCreated());
		responseDto.setModified(userResponseBD.getModified());
		
		return responseDto;
		
		
	}


}
