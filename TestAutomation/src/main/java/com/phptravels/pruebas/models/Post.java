package com.phptravels.pruebas.models;

public class Post {

	String titulo;
	String permalink;
	String bodytext;
	String keywords;
	String descripcion;
	String categoria;
	String rela;

	public Post(String titulo, String permalink, String bodytext, String keywords, String descripcion, String categoria,
			String rela) {
		super();
		this.titulo = titulo;
		this.permalink = permalink;
		this.bodytext = bodytext;
		this.keywords = keywords;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.rela = rela;

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getPermalink() {
		return permalink;
	}

	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}

	public String getBodytext() {
		return bodytext;
	}

	public void setBodytext(String bodytext) {
		this.bodytext = bodytext;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getRela() {
		return rela;
	}

	public void setRela(String rela) {
		this.rela = rela;
	}
}
