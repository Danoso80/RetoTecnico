package com.phptravels.pruebas.stepDefinitions;

import java.util.List;

import com.phptravels.pruebas.models.Post;
import com.phptravels.pruebas.step.PostStepDefinitions;

import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class CrearPostStepDefinitions {

	@Steps
	PostStepDefinitions crear;

	@Entonces("^selecciono las opciones para ingresar formato$")
	public void selecciono_las_opciones_para_ingresar_formato() throws InterruptedException {
		crear.clickMenu();
		crear.clickSubMenu();
		Thread.sleep(3000);
		crear.clickPost();
		Thread.sleep(5000);
	}

	@Entonces("^ingreso los datos necesarios para continuar$")
	public void ingreso_los_datos_necesarios_para_continuar(List<Post> listaDatos) {
		crear.escribirTitulo(listaDatos.get(0).getTitulo());
		crear.escribirLink(listaDatos.get(0).getPermalink());
		crear.escribirKeywords(listaDatos.get(0).getKeywords());
		crear.escribirDescripcion(listaDatos.get(0).getDescripcion());
		crear.cambiarFrame();
		crear.escribirBody(listaDatos.get(0).getBodytext());
		crear.cambiarIndex();

	}

	@Entonces("^selecciono la categoria creada y el post relacionado$")
	public void selecciono_la_categoria_creada_y_el_post_relacionado(List<Post> listaDato) {
		crear.seleccionarCategoria(listaDato.get(0).getCategoria());
		crear.elegirPostRela(listaDato.get(0).getRela());

	}

	@Entonces("^subo la imagen y doy click en Summit$")
	public void doy_click_en_Summit() {
		crear.subirImagen();
		crear.clicSummit();
	}
}
