package com.nico.dwsapi.servicios;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nico.dwsapi.daos.Acceso;

/**
 * Clase que define los metodos que daran servicio a la clase Acceso
 */
@Service
public class AccesoServicio {
	
	@Autowired
	private AccesoRepositorio accesoRepositorio;
	
	/**
	 * Accede a la base de datos para obtener todos los accesos
	 * @return ArrayList<Acceso> con los accesos
	 */
	public ArrayList<Acceso> obtenerTodos(){
		return (ArrayList<Acceso>) accesoRepositorio.findAll();
	}
	
	/**
	 * Accede a la base de datos para obtener un acceso
	 * @return Optional<Acceso> un acceso
	 */
	public Optional<Acceso> obtenerPorId(long id){
		return accesoRepositorio.findById(id);
	}

	
	
}
