package com.phptravels.pruebas.pages;

import org.openqa.selenium.By;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.phptravels.net/admin")
public class LoginPom extends PageObject {

	By txtCorreo = By.name("email");
	By txtClave = By.name("password");
	By btnLogin = By.xpath("/html/body/div[2]/form[1]/button");

	public void escribirCorreo(String correo) {
		getDriver().findElement(txtCorreo).sendKeys(correo);
	}

	public void escribirClave(String clave) {
		getDriver().findElement(txtClave).sendKeys(clave);

	}

	public void clickLogin() {
		Serenity.takeScreenshot();
		getDriver().findElement(btnLogin).click();

	}

}
