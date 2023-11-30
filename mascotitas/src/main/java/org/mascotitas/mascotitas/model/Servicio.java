package org.mascotitas.mascotitas.model;

public class Servicio {
	private Long id;
	private String nombre;
	private String descripcion;
	private String image;
	private Double precio;
	
	private static long total=0;

	public Servicio(String nombre, String descripcion, String image, Double precio) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.image = image;
		this.precio = precio;
		Servicio.total++;
		this.id = total;
	}//constructor
	public Servicio() {
		Servicio.total++;
		this.id = total;
	}//servicio
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Long getId() {
		return id;
	}//getId
	@Override
	public String toString() {
		return "Servicio [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", image=" + image
				+ ", precio=" + precio + "]";
	}//toString
	
	
	
}//class servicio
