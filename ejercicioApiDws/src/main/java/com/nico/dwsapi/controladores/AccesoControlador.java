package com.nico.dwsapi.controladores;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nico.dwsapi.daos.Acceso;
import com.nico.dwsapi.servicios.AccesoRepositorio;
import com.nico.dwsapi.servicios.AccesoServicio;

@RestController
@RequestMapping("/accesos")
public class AccesoControlador {

	// Autowired Inyecta la dependencia instanciada lista para usar
	@Autowired
	private AccesoServicio accesoServicio;
	
	// GetMapping Define el endpoint al navegar para obtener todos los usuarios (http://localhost/accesos/todos)
	@GetMapping("/todos")
	public ArrayList<Acceso> obtenerTodos(){
		return (ArrayList<Acceso>) accesoServicio.obtenerTodos();
	}
	
	// La anotación @PathVariable mapea una parte de la URL de una
	// solicitud HTTP a un parámetro de un método en un controlador en este caso el
	// id (http://localhost/accesos/id/elidquesea)
	@GetMapping("/id/{id}")
	public Optional<Acceso> obtenerPorID(@PathVariable("id") long id){
		return accesoServicio.obtenerPorId(id);
	}
}
