package com.phptravels.pruebas.stepDefinitions;

import java.util.List;

import com.phptravels.pruebas.models.Categoria;
import com.phptravels.pruebas.step.CategoriaStepDefinitions;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class AgregarCategoriaStepDefinitions {

	@Steps
	CategoriaStepDefinitions agregar;

	@Entonces("^selecciono las opciones para ingresar al formulario$")
	public void selecciono_las_opciones_para_ingresar_al_formulario() throws InterruptedException {
		agregar.clickMenu();
		agregar.clickSubMenu();
		Thread.sleep(3000);
		agregar.clickCategoria();

	}

	@Entonces("^ingreso los datos solicitados en los formularios$")
	public void ingreso_los_datos_solicitados_en_los_formularios(List<Categoria> listaNombres)

	{

		agregar.escribirNombre(listaNombres.get(0).getCategoria());
		agregar.escribirNombreViet(listaNombres.get(0).getNViet());
		agregar.escribirNombreRus(listaNombres.get(0).getNRuso());
		agregar.escribirNombreAra(listaNombres.get(0).getNArabe());
		agregar.escribirNombreFarsi(listaNombres.get(0).getNFarsi());
		agregar.escribirNombreTurco(listaNombres.get(0).getNTurco());
		agregar.escribirNombreFrances(listaNombres.get(0).getNFrances());
		agregar.escribirNombreEsp(listaNombres.get(0).getNEsp());
		agregar.escribirNombreAle(listaNombres.get(0).getNAleman());

	}

	@Dado("^hago click en el boton agregar$")
	public void hago_click_en_el_boton_agregar() throws InterruptedException {
		agregar.agregarCategoria();
		Thread.sleep(1000);
	}

	@Entonces("^valido que aparezca la nueva categoria$")
	public void valido_que_aparezca_la_nueva_categoria(List<Categoria> Validacion) {
		agregar.validarCategoriaNueva(Validacion.get(0).getvalidacion());
	}

}
