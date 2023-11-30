package org.mascotitas.mascotitas.model;

public class Producto {
	private Long id;
	private String categoria;
	private String nombre;
	private String descripcion;
	private String image;
	private Double precio;
	
	private static long total=0;

	public Producto(String categoria, String nombre, String descripcion, String image, Double precio) {
		this.categoria = categoria;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.image = image;
		this.precio = precio;
		Producto.total++;
		this.id = total;
	}//constructor

	public Producto() {
		Producto.total++;
		this.id = total;
	}//constructorProducto

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

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
	}//GetId

	@Override
	public String toString() {
		return "Producto [id=" + id + ", categoria=" + categoria + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", image=" + image + ", precio=" + precio + "]";
	}
	

	
	
	
}//class
