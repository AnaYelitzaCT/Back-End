package org.mascotitas.mascotitas.model;

public class Cliente {

	private Long id;
	private String nombre;
	private String email;
	private String contraseña;
	private String telefono;
	
	private static long total=0;

	public Cliente(String nombre, String email, String contraseña, String telefono) {
		this.nombre = nombre;
		this.email = email;
		this.contraseña = contraseña;
		this.telefono = telefono;
		Cliente.total++;
		this.id = total;
	}//constructor
		public Cliente() {
			Cliente.total++;
			this.id = total;
		}//constructorProducto
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getContraseña() {
			return contraseña;
		}
		public void setContraseña(String contraseña) {
			this.contraseña = contraseña;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		public Long getId() {
			return id;
		}//getId
		@Override
		public String toString() {
			return "Cliente [id=" + id + ", nombre=" + nombre + ", email=" + email + ", contraseña=" + contraseña
					+ ", telefono=" + telefono + "]";
		}//toString

			
		

}//public class
