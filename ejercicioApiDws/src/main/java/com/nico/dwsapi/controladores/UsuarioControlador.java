package com.nico.dwsapi.controladores;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nico.dwsapi.servicios.UsuarioServicio;
import com.nico.dwsapi.daos.Usuario;

/**
 * Clase que actua como controlador para la entidad Usuario
 */
@RestController // RestController Define que la clase es un controlador
@RequestMapping("/usuarios") // Define el prefijo de la URL para todos los métodos en este controlador
public class UsuarioControlador {

	// Autowired Inyecta la dependencia instanciada lista para usar
	@Autowired 
	private UsuarioServicio usuarioServicio;

	// GetMapping Define el endpoint al navegar para obtener todos los usuarios (usuarios/todos)
	@GetMapping("/todos") 
	public ArrayList<Usuario> obtenerTodosUsuarios() {
		return usuarioServicio.obtenerTodos();
	}

	// La anotación @PathVariable mapea una parte de la URL de una
	// solicitud HTTP a un parámetro de un método en un controlador en este caso el
	// id (http://localhost/usuarios/id/elidquesea)
	@GetMapping("/id/{id}")
	public Optional<Usuario> obtenerPorId(@PathVariable("id") long id) {
		return usuarioServicio.obtenerPorID(id);
	}

}
