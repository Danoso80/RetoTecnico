package com.phptravels.pruebas.models;

public class Login {

	String correo;
	String clave;
	String usuario;

	public Login(String correo, String clave, String usuario) {
		super();
		this.correo = correo;
		this.clave = clave;
		this.usuario = usuario;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

}
