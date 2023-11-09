package dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Acceso {
	@JsonProperty("idAcceso")
	private long idAcceso;
	@JsonProperty("codigoAcceso")
	private String codigoAcceso;
	@JsonProperty("descripcionAcceso")	
	private String descripcionAcceso;
	@JsonProperty("listaUsuariosConAccesoo")
	private List<Usuario> listaUsuariosConAccesoo;

	public Acceso() {
		super();
	}

	public Acceso(String codigoAcceso, String descripcionAcceso) {
		super();
		this.codigoAcceso = codigoAcceso;
		this.descripcionAcceso = descripcionAcceso;
	}

	public long getIdAcceso() {
		return idAcceso;
	}

	public void setIdAcceso(long idAcceso) {
		this.idAcceso = idAcceso;
	}

	public String getCodigoAcceso() {
		return codigoAcceso;
	}

	public void setCodigoAcceso(String codigoAcceso) {
		this.codigoAcceso = codigoAcceso;
	}

	public String getDescripcionAcceso() {
		return descripcionAcceso;
	}

	public void setDescripcionAcceso(String descripcionAcceso) {
		this.descripcionAcceso = descripcionAcceso;
	}

	public List<Usuario> getListaUsuariosConAccesoo() {
		return listaUsuariosConAccesoo;
	}

	public void setListaUsuariosConAccesoo(List<Usuario> listaUsuariosConAccesoo) {
		this.listaUsuariosConAccesoo = listaUsuariosConAccesoo;
	}

	@Override
	public String toString() {
		return "--- Datos Acceso ---\nidAcceso: " + idAcceso + "\nCodigoAcceso: " + codigoAcceso + "\nDescripcionAcceso: "
				+ descripcionAcceso + "\nLista Usuarios con Acceso: " + listaUsuariosConAccesoo.toString();
	}
	
	
	
	

}



