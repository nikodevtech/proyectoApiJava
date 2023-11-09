package dtos;

import java.util.Calendar;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Usuario {

	@JsonProperty("idUsuario")
	private long idUsuario;
	
	@JsonProperty("dniUsuario")
	private String dniUsuario;
	
	@JsonProperty("nombreUsuario")
	private String nombreUsuario;
	
	@JsonProperty("apellidosUsuario")
	private String apellidosUsuario;
	
	@JsonProperty("tlfUsuario")
	private String tlfUsuario;
	
	@JsonProperty("emailUsuario")
	private String emailUsuario;
	
	@JsonProperty("claveUsuario")
	private String claveUsuario;
	
	@JsonProperty("estaBloqueadoUsuario")
	private boolean estaBloqueadoUsuario;
	
	@JsonProperty("fchFinBloqueo")
	private Calendar fchFinBloqueo;
	
	@JsonProperty("fchAltaUsuario")
	private Calendar fchAltaUsuario;
	
	@JsonProperty("fchBajaUsuario")
	private Calendar fchBajaUsuario;

    @JsonIgnore // Indica que la propiedad no se serializa y evitar las estructuras de datos recursivas o infinitas en la respuesta JSON
	Acceso acceso;

	public Usuario() {
		super();
	}

	public Usuario(String dniUsuario, String nombreUsuario, String apellidosUsuario, String tlfUsuario,
			String emailUsuario, String claveUsuario, boolean estaBloqueadoUsuario, Calendar fchFinBloqueo,
			Calendar fchAltaUsuario, Calendar fchBajaUsuario, Acceso acceso) {
		super();
		this.dniUsuario = dniUsuario;
		this.nombreUsuario = nombreUsuario;
		this.apellidosUsuario = apellidosUsuario;
		this.tlfUsuario = tlfUsuario;
		this.emailUsuario = emailUsuario;
		this.claveUsuario = claveUsuario;
		this.estaBloqueadoUsuario = estaBloqueadoUsuario;
		this.fchFinBloqueo = fchFinBloqueo;
		this.fchAltaUsuario = fchAltaUsuario;
		this.fchBajaUsuario = fchBajaUsuario;
		this.acceso = acceso;
	}

	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getDniUsuario() {
		return dniUsuario;
	}

	public void setDniUsuario(String dniUsuario) {
		this.dniUsuario = dniUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getApellidosUsuario() {
		return apellidosUsuario;
	}

	public void setApellidosUsuario(String apellidosUsuario) {
		this.apellidosUsuario = apellidosUsuario;
	}

	public String getTlfUsuario() {
		return tlfUsuario;
	}

	public void setTlfUsuario(String tlfUsuario) {
		this.tlfUsuario = tlfUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getClaveUsuario() {
		return claveUsuario;
	}

	public void setClaveUsuario(String claveUsuario) {
		this.claveUsuario = claveUsuario;
	}

	public boolean isEstaBloqueadoUsuario() {
		return estaBloqueadoUsuario;
	}

	public void setEstaBloqueadoUsuario(boolean estaBloqueadoUsuario) {
		this.estaBloqueadoUsuario = estaBloqueadoUsuario;
	}

	public Calendar getFchFinBloqueo() {
		return fchFinBloqueo;
	}

	public void setFchFinBloqueo(Calendar fchFinBloqueo) {
		this.fchFinBloqueo = fchFinBloqueo;
	}

	public Calendar getFchAltaUsuario() {
		return fchAltaUsuario;
	}

	public void setFchAltaUsuario(Calendar fchAltaUsuario) {
		this.fchAltaUsuario = fchAltaUsuario;
	}

	public Calendar getFchBajaUsuario() {
		return fchBajaUsuario;
	}

	public void setFchBajaUsuario(Calendar fchBajaUsuario) {
		this.fchBajaUsuario = fchBajaUsuario;
	}

	public Acceso getAcceso() {
		return acceso;
	}

	public void setAcceso(Acceso acceso) {
		this.acceso = acceso;
	}

	@Override
	public String toString() {
		return "--- Datos Usuario ---\nidUsuario: " + idUsuario + "\ndniUsuario: " + dniUsuario + "\nnombreUsuario: " + nombreUsuario
				+ "\napellidosUsuario: " + apellidosUsuario + "\ntlfUsuario:" + tlfUsuario + ", emailUsuario="
				+ emailUsuario + "\nclaveUsuario: " + claveUsuario + "\nestaBloqueadoUsuario: " + estaBloqueadoUsuario
				+ "\nfchFinBloqueo: " + fchFinBloqueo + "\nfchAltaUsuario: " + fchAltaUsuario + "\nfchBajaUsuario: "
				+ fchBajaUsuario + "\nacceso: " + acceso;
	}

}
