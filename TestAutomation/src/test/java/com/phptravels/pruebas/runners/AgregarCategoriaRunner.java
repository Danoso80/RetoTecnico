package com.phptravels.pruebas.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/com/phptravels/pruebas/feature/AgregarCategoria.feature",
glue="com.phptravels.pruebas.stepDefinitions")
public class AgregarCategoriaRunner {

}
