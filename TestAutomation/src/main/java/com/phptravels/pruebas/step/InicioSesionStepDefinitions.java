package com.phptravels.pruebas.step;

import com.phptravels.pruebas.pages.LoginPom;

import net.thucydides.core.annotations.Step;

public class InicioSesionStepDefinitions {

	LoginPom inicioSesion = new LoginPom();

	@Step
	public void abrirAplicacion() {
		inicioSesion.open();
	}

	@Step
	public void escribirCorreo(String correo) {
		inicioSesion.escribirCorreo(correo);
	}

	@Step
	public void escribirContraseña(String clave) {
		inicioSesion.escribirClave(clave);
	}

	@Step
	public void clickLogin() {
		inicioSesion.clickLogin();
	}

}
