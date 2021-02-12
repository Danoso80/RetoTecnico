package com.phptravels.pruebas.step;

import com.phptravels.pruebas.pages.PostPOM;

import net.thucydides.core.annotations.Step;

public class PostStepDefinitions {

	PostPOM crear = new PostPOM();

	@Step
	public void clickMenu() {
		crear.SeleccionMenu();
	}

	@Step
	public void clickSubMenu() {
		crear.SeleccionSubmenu();
	}

	@Step
	public void clickPost() {
		crear.SeleccionPost();
	}

	@Step
	public void escribirTitulo(String titulo) {
		crear.escribirTitulo(titulo);
	}

	@Step
	public void escribirLink(String permalink) {
		crear.escribirLink(permalink);
	}

	@Step
	public void escribirBody(String bodytext) {
		crear.escribirBodytext(bodytext);
	}

	@Step
	public void escribirKeywords(String keywords) {
		crear.escribirKeywords(keywords);
	}

	@Step
	public void escribirDescripcion(String descripcion) {
		crear.escribirDescripcion(descripcion);
	}

	@Step
	public void seleccionarCategoria(String categoria) {
		crear.seleccionarCategoria(categoria);
	}

	@Step
	public void elegirPostRela(String rela) {
		crear.elegirPostRelacionado(rela);
	}

	@Step
	public void cambiarFrame() {
		crear.cambiarIframe();
	}

	@Step
	public void cambiarIndex() {
		crear.cambiarIndex();
	}

	@Step
	public void subirImagen() {
		crear.subirImagen();
	}

	@Step
	public void clicSummit() {
		crear.clicSummit();
	}

}
