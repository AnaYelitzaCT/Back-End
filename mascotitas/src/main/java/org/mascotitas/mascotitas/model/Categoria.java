package org.mascotitas.mascotitas.model;


public class Categoria {
	private Long id;
	private String categoria;
	
	private static long total=0;

	public Categoria(String categoria) {
		this.categoria = categoria;
		Categoria.total++;
		this.id = total;
	}//constructor
	public Categoria() {
		Categoria.total++;
		this.id = total;
	}//const
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Long getId() {
		return id;
	}//getid
	@Override
	public String toString() {
		return "Categoria [id=" + id + ", categoria=" + categoria + "]";
	}//toString
	
	
	
	
}//class
