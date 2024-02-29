package com.examen.evaluacion.service;

import com.examen.evaluacion.dto.UsuarioRequestDto;
import com.examen.evaluacion.dto.UsuarioResponseDto;

public interface IUsuarioService {

  UsuarioResponseDto registrar(UsuarioRequestDto request) throws Exception;
}
