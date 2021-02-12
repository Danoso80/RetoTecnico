package com.phptravels.pruebas.stepDefinitions;

import java.util.List;

import com.phptravels.pruebas.models.Login;
import com.phptravels.pruebas.step.InicioSesionStepDefinitions;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinitions {

	@Steps
	InicioSesionStepDefinitions inicio;

	@Dado("^que ingreso a la pagina y digito mi usuario, contrasena$")
	public void que_ingreso_a_la_pagina_y_digito_mi_usuario_contrasena() {
		inicio.abrirAplicacion();
	}

	@Dado("^realizo el login correctamente$")
	public void realizo_el_login_correctamente(List<Login> listaUsuario) {
		inicio.escribirCorreo(listaUsuario.get(0).getCorreo());
		inicio.escribirContraseña(listaUsuario.get(0).getClave());
	}

	@Cuando("^doy click en iniciar sesion$")
	public void doy_click_en_iniciar_sesion() throws InterruptedException {
		inicio.clickLogin();
		Thread.sleep(5000);
	}

}
