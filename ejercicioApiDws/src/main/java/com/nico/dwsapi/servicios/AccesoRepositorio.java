package com.nico.dwsapi.servicios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nico.dwsapi.daos.Acceso;

//Indica que la interfaz es un componente de persistencia (un repositorio) y que debe ser escaneada y administrada por Spring
@Repository
public interface AccesoRepositorio extends JpaRepository<Acceso, Long>{

	// Los repositorios se utilizan para interactuar con la base de datos de manera
	// eficiente, y la interfaz JpaRepository proporciona una serie de funcionalidades para
	// simplificar CRUD con bases de datos.

}
