package com.phptravels.pruebas.step;

import com.phptravels.pruebas.pages.CategoriaPOM;

import net.thucydides.core.annotations.Step;

public class CategoriaStepDefinitions {

	CategoriaPOM agregarcat = new CategoriaPOM();

	@Step
	public void clickMenu() {
		agregarcat.SeleccionMenu();
	}

	@Step
	public void clickSubMenu() {
		agregarcat.SeleccionSubmenu();
	}

	@Step
	public void clickCategoria() {
		agregarcat.SeleccionCategoria();
	}

	@Step
	public void escribirNombre(String categoria) {
		agregarcat.escribirNombre(categoria);
	}

	@Step
	public void escribirNombreViet(String NViet) {
		agregarcat.escribirNombreViet(NViet);
	}

	@Step
	public void escribirNombreRus(String NRuso) {
		agregarcat.escribirNombreRus(NRuso);
	}

	@Step
	public void escribirNombreAra(String NArabe) {
		agregarcat.escribirNombreAra(NArabe);
	}

	@Step
	public void escribirNombreFarsi(String NFarsi) {
		agregarcat.escribirNombreFar(NFarsi);
	}

	@Step
	public void escribirNombreTurco(String NTurco) {
		agregarcat.escribirNombreTur(NTurco);
	}

	@Step
	public void escribirNombreFrances(String NFrances) {
		agregarcat.escribirNombreFra(NFrances);
	}

	@Step
	public void escribirNombreEsp(String NEsp) {
		agregarcat.escribirNombreSpa(NEsp);
	}

	@Step
	public void escribirNombreAle(String NAleman) {
		agregarcat.escribirNombreGer(NAleman);
	}

	@Step
	public void agregarCategoria() {
		agregarcat.agregarCategoria();
	}

	@Step
	public void validarCategoriaNueva(String validacion) {
		agregarcat.validarCategoriaNueva(validacion);
	}
}
