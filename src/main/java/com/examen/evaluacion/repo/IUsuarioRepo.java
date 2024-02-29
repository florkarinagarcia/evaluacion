package com.examen.evaluacion.repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen.evaluacion.entity.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario,UUID> {
	

}
