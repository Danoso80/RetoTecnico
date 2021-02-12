package com.phptravels.pruebas.models;

public class Categoria {

	String categoria;
	String nViet;
	String nRuso;
	String nArabe;
	String nFarsi;
	String nTurco;
	String nFrances;
	String nEsp;
	String nAleman;
	String validacion;

	public Categoria(String categoria, String nViet, String nRuso, String nArabe, String nFarsi, String nTurco,
			String nFrances, String nEsp, String nAleman, String validacion) {
		super();
		this.categoria = categoria;
		this.nViet = nViet;
		this.nRuso = nRuso;
		this.nArabe = nArabe;
		this.nFarsi = nFarsi;
		this.nTurco = nTurco;
		this.nFrances = nFrances;
		this.nEsp = nEsp;
		this.nAleman = nAleman;
		this.validacion = validacion;

	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getNViet() {
		return nViet;
	}

	public void setNViet(String nViet) {
		this.nViet = nViet;
	}

	public String getNRuso() {
		return nRuso;
	}

	public void setNRuso(String nRuso) {
		this.nRuso = nRuso;
	}

	public String getNArabe() {
		return nArabe;
	}

	public void setNArabe(String nArabe) {
		this.nArabe = nArabe;
	}

	public String getNFarsi() {
		return nFarsi;
	}

	public void setNFarsi(String nFarsi) {
		this.nFarsi = nFarsi;
	}

	public String getNTurco() {
		return nTurco;
	}

	public void setNTurco(String nTurco) {
		this.nTurco = nTurco;
	}

	public String getNFrances() {
		return nFrances;
	}

	public void setNFrances(String nFrances) {
		this.nFrances = nFrances;
	}

	public String getNEsp() {
		return nEsp;
	}

	public void setNEsp(String nEsp) {
		this.nEsp = nEsp;
	}

	public String getNAleman() {
		return nAleman;
	}

	public void setNAleman(String nAleman) {
		this.nAleman = nAleman;
	}

	public String getvalidacion() {
		return validacion;
	}

	public void setvalidacion(String validacion) {
		this.validacion = validacion;
	}

}
