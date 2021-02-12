package com.phptravels.pruebas.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;

public class PostPOM extends PageObject {

	By btnBlog = By.xpath("//*[@id=\"social-sidebar-menu\"]/li[14]/a");
	By btnSubMenu = By.xpath("//*[@id=\"Blog\"]/li[1]/a");
	By btnAdd = By.xpath("//*[@id=\"content\"]/div[2]/form/button");
	By txtTitulo = By.name("title");
	By txtPermalink = By.name("slug");
	By txtBodytext = By.xpath("//body[contains(@class, 'cke_editable')]/p");
	By txtKeywords = By.name("keywords");
	By txtDescripcion = By.name("metadesc");
	By selectCategory = By.name("category");
	By optionSelectCategory;
	By selectPostRelacionado = By.xpath("//*[@id='content']//div[2]//div[2]/div[3]//select");
	By listPostRela = By.xpath("//*[@id=\"s2id_autogen2\"]");
	By btnSummit = By.xpath("//*[@id='content']/form/div[1]/div/div[2]/button");
	By frameMain = By.xpath("//*[@id=\"cke_1_contents\"]/iframe");

	JavascriptExecutor js = (JavascriptExecutor) getDriver();

	public void SeleccionMenu() {
		Serenity.takeScreenshot();
		getDriver().findElement(btnBlog).click();

	}

	public void SeleccionSubmenu() {
		Serenity.takeScreenshot();
		getDriver().findElement(btnSubMenu).click();

	}

	public void SeleccionPost() {
		Serenity.takeScreenshot();
		getDriver().findElement(btnAdd).click();
	}

	public void escribirTitulo(String titulo) {
		getDriver().findElement(txtTitulo).sendKeys(titulo);

	}

	public void escribirLink(String permalink) {
		getDriver().findElement(txtPermalink).sendKeys(permalink);

	}

	public void escribirKeywords(String keywords) {
		getDriver().findElement(txtKeywords).sendKeys(keywords);

	}

	public void escribirDescripcion(String descripcion) {
		getDriver().findElement(txtDescripcion).sendKeys(descripcion);

	}

	public void seleccionarCategoria(String categoria) {
		getDriver().findElement(selectCategory).click();
		optionSelectCategory = By.xpath("//*[@name='category']/option[text()=' " + categoria + " ']");
		getDriver().findElement(optionSelectCategory).click();

	}

	public void elegirPostRelacionado(String rela) {
		getDriver().findElement(listPostRela).sendKeys(rela);
		Select lugar = new Select(getDriver().findElement(selectPostRelacionado));
		lugar.selectByVisibleText("Hotel Review: DOM Hotel In Rome");
		lugar.selectByIndex(0);
	}

	public void cambiarIframe() {
		WebElement frame = getDriver().findElement(frameMain);
		getDriver().switchTo().frame(frame);
	}

	public void escribirBodytext(String bodytext) {
		getDriver().findElement(txtBodytext).sendKeys(bodytext);
	}

	public void cambiarIndex() {
		getDriver().switchTo().defaultContent();
	}

	public void subirImagen() {
		WebElement chooseFile = getDriver().findElement(By.id("image_default"));
		chooseFile.sendKeys("C:/Users/ecm2862g/Documents/ProyectosEclipse/TestAutomation/src/main/resources/logo.png");

	}

	public void clicSummit() {
		Serenity.takeScreenshot();
		getDriver().findElement(btnSummit).click();
	}

}
