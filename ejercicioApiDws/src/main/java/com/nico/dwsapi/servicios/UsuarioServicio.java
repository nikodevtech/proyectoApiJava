package com.nico.dwsapi.servicios;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nico.dwsapi.daos.Usuario;

/**
 * Clase que define los metodos que daran servicio a la clase Usuario
 */
@Service
public class UsuarioServicio {
	
	@Autowired //Inyecta la dependencia instanciada
	private UsuarioRepositorio usuarioRepositorio;
	
	/**
	 * Acceso a la base de datos para obtener todos los usuarios
	 * @return ArrayList<Usuario> con los usuarios
	 */
	public ArrayList<Usuario> obtenerTodos() {
		return (ArrayList<Usuario>) usuarioRepositorio.findAll();
	}
	
	/**
	 * Acceso a la base de datos para obtener un usuario por su id 
	 * @param id
	 * @return Optional<Usuario> usuario buscado por id
	 */
	public Optional<Usuario> obtenerPorID(long id) {
		return usuarioRepositorio.findById(id);
	}

}
