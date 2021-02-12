package com.phptravels.pruebas.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;

public class CategoriaPOM extends PageObject {

	WebDriver driver;
	By btnBlog = By.xpath("//*[@id=\"social-sidebar-menu\"]/li[14]/a");
	By btnSubMenu = By.xpath("//*[@id=\"Blog\"]/li[2]/a");
	By btnAdd = By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div[1]/button");
	By txtName = By.xpath("//html/body/div[3]/div/div[3]/div[2]/div/form/div[2]/div[1]/div/input");
	By txtNameViet = By.xpath("//html/body/div[3]/div/div[3]/div[2]/div/form/div[2]/div[3]/div/input");
	By txtNameRus = By.xpath("//html/body/div[3]/div/div[3]/div[2]/div/form/div[2]/div[4]/div/input");
	By txtNameAra = By.xpath("//html/body/div[3]/div/div[3]/div[2]/div/form/div[2]/div[5]/div/input");
	By txtNameFar = By.xpath("//html/body/div[3]/div/div[3]/div[2]/div/form/div[2]/div[6]/div/input");
	By txtNameTur = By.xpath("//html/body/div[3]/div/div[3]/div[2]/div/form/div[2]/div[7]/div/input");
	By txtNameFre = By.xpath("//html/body/div[3]/div/div[3]/div[2]/div/form/div[2]/div[8]/div/input");
	By txtNameSpa = By.xpath("//html/body/div[3]/div/div[3]/div[2]/div/form/div[2]/div[9]/div/input");
	By txtNameGer = By.xpath("//html/body/div[3]/div/div[3]/div[2]/div/form/div[2]/div[10]/div/input");
	By btnAgregar = By.xpath("//*[@id=\"ADD_BLOG_CAT\"]/div[2]/div/form/div[3]/button[2]");
	By validarCat = By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div[2]/div/div[1]/div[2]/table/tbody/tr[1]/td[3]");

	public void SeleccionMenu() {
		Serenity.takeScreenshot();
		getDriver().findElement(btnBlog).click();

	}

	public void SeleccionSubmenu() {
		Serenity.takeScreenshot();
		getDriver().findElement(btnSubMenu).click();

	}

	public void SeleccionCategoria() {
		Serenity.takeScreenshot();
		getDriver().findElement(btnAdd).click();

	}

	public void escribirNombre(String categoria) {
		Serenity.takeScreenshot();
		getDriver().findElement(txtName).sendKeys(categoria);
		System.out.println(txtName);
	}

	public void escribirNombreViet(String NViet) {
		Serenity.takeScreenshot();
		getDriver().findElement(txtNameViet).sendKeys(NViet);
	}

	public void escribirNombreRus(String NRuso) {
		Serenity.takeScreenshot();
		getDriver().findElement(txtNameRus).sendKeys(NRuso);
	}

	public void escribirNombreAra(String NArabe) {
		Serenity.takeScreenshot();
		getDriver().findElement(txtNameAra).sendKeys(NArabe);
	}

	public void escribirNombreFar(String NFarsi) {
		Serenity.takeScreenshot();
		getDriver().findElement(txtNameFar).sendKeys(NFarsi);
	}

	public void escribirNombreTur(String NTurco) {
		Serenity.takeScreenshot();
		getDriver().findElement(txtNameTur).sendKeys(NTurco);
	}

	public void escribirNombreFra(String NFrances) {
		Serenity.takeScreenshot();
		getDriver().findElement(txtNameFre).sendKeys(NFrances);
	}

	public void escribirNombreSpa(String NEsp) {
		Serenity.takeScreenshot();
		getDriver().findElement(txtNameSpa).sendKeys(NEsp);
	}

	public void escribirNombreGer(String NAleman) {
		Serenity.takeScreenshot();
		getDriver().findElement(txtNameGer).sendKeys(NAleman);
	}

	public void agregarCategoria() {
		Serenity.takeScreenshot();
		getDriver().findElement(btnAgregar).click();
	}

	public String validarLoginFallido() {

		return getDriver().findElement(validarCat).getText();
	}

	public void validarCategoriaNueva(String catego) {
		System.out.println(getDriver().findElement(validarCat).getText());
		getDriver().findElement(validarCat).getText().contains(catego);
	}
}
