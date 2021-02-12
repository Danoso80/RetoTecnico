package com.phptravels.pruebas.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/com/phptravels/pruebas/feature/Login.feature",
tags="@Login",
glue="com.phptravels.pruebas.stepDefinitions")
public class LoginRunner {

}
