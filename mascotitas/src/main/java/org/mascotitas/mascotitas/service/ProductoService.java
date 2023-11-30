package org.mascotitas.mascotitas.service;

import java.util.ArrayList;

import org.mascotitas.mascotitas.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductoService {
	public final ArrayList<Producto> lista = new ArrayList<Producto>();
	@Autowired    // se importa arriba
	public ProductoService() {                      //constructor vacio, para agregar productos con los datos establecidos anteriormente
		lista.add(new Producto("Alimento","Royal canin",
				" Alimento para gato/ 2.72 kg ",
					"royal.gif", 800.00));
		lista.add(new Producto("Alimento", "NUCAT",
				" Alimento para gato / 15 kg ",
				"nutcat.gif", 665.00));
		lista.add(new Producto("Alimento", "whiskas",
				" Alimento para gato de res / 1.5 kg",
				"whiskas.gif", 116.00));
		lista.add(new Producto("Alimento", "Purina felix",
				" Alimento para gato en croqueta / 1.5 kg",
				"purina.gif", 116.00));
		lista.add(new Producto("Alimento", "Fancy Feast",
				" Alimento para gato en lata sabor pollo / 1 unidad",
				"fancy.gif", 99.00));
		lista.add(new Producto("Juguetes","Kit Cat",
				" Alimento para gato en lata/ sabor atún ",
					"Kit Cat.jpg", 74.50));

		lista.add(new Producto("Juguetes","Ratón de tela",
				" De la mejor calidad",
					"ratón.jpg", 100.00));

		lista.add(new Producto("Juguetes","Juguete para mascota",
				" Atela suave en colores verde y amarillo ",
					"Aguacate.jpg", 60.20));

		lista.add(new Producto("Juguetes","Balón para mascota",
				" tela suave en forma de balón",
					"Balon.jpg", 45.70));

		lista.add(new Producto("Juguetes","Rascador para mascota",
				" Rascador para gato tamaño mediano",
					"rascador.jpg", 130.10));
	}//constructor
	
		public ArrayList<Producto> getAllProductos() {
			
			return lista;
		}//getAllProductos
		
		public Producto getProducto(long id) {
			Producto prod=null;
			for (Producto producto : lista) {
				if(id == producto.getId()) {
					prod=producto;
					break;
				}//If
			}//foreach
			return prod;
		}//getProducto
		
		public Producto deleteProducto(long id) {
			Producto prod=null;
			for (Producto producto : lista) {
				if(id == producto.getId()) {
					prod=producto;
					lista.remove(producto);
					break;
				}//If
			}//foreach
			return prod;
		}//delete producto
		public Producto addProducto(Producto producto) {
			lista.add(producto);
			return producto;
		}//add producto
		
		public Producto updateProducto(long id, String categoria,String nombre, String descripcion, String imagen, Double precio) {
			
			Producto prod=null;
				for (Producto producto : lista) {
					if(id == producto.getId()) {
							if(categoria!= null)producto.setCategoria(categoria);
							if(nombre!= null)producto.setNombre(nombre);
							if(descripcion!= null)producto.setDescripcion(descripcion);
							if(imagen!= null)producto.setImage(imagen);
							if(precio!= null)producto.setPrecio(precio);
							prod=producto;
							break;
					}//if
				}//foreach
				return prod;
	} //constructor
}//ProductoService
