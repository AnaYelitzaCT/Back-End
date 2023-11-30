package org.mascotitas.mascotitas.controller;

import java.util.ArrayList;

import org.mascotitas.mascotitas.model.Producto;
import org.mascotitas.mascotitas.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//CRUD  -  Create  -Read  -Update  -Delete
//HTTP  -  POST    -GET   - PUT    -DELETE
@RestController
@RequestMapping(path="/api/productos/") // http://localhost:8080/api/productos/
public class ProductoController {
	//instanciar producto service
		private final ProductoService productoService;
		@Autowired
		public ProductoController(ProductoService productoService) {
			this.productoService = productoService;
		}//constructor
		@GetMapping	
		public ArrayList<Producto> getAllProductos(){
			return productoService.getAllProductos();
		}//getAllProductos
		
		@GetMapping(path="{prodId}")    //http://localhost:8080/api/productos/1
		public Producto getProducto(@PathVariable ("prodId") long id){            //esta instrucción trae el valor que se le ponga arriba en el URL
			return productoService.getProducto(id);
		}//getAllProducto
		
		@DeleteMapping(path="{prodId}")    //http://localhost:8080/api/productos/1
		public Producto deleteProducto(@PathVariable ("prodId") long id){            //esta instrucción trae el valor que se le ponga arriba en el URL
			return productoService.deleteProducto(id);
		}//getAllProducto
		
		@PostMapping   //http://localhost:8080/api/productos/
		public Producto addProducto(@RequestBody Producto producto){            //esta instrucción trae el valor que se le ponga arriba en el URL
			return productoService.addProducto(producto);
		}//addProducto
		

		@PutMapping(path="{prodId}")    //http://localhost:8080/api/productos/1?precio=55.80&imagen=bic40.jpg
		public Producto updateProducto(@PathVariable ("prodId") long id,
				@RequestParam(required=false) String categoria,
				@RequestParam(required=false) String nombre,
				@RequestParam(required=false) String descripcion,
				@RequestParam(required=false) String imagen,
				@RequestParam(required=false) Double precio){            //esta instrucción modifica el valor que se le ponga arriba en el URL
			return productoService.updateProducto(id, categoria, nombre, descripcion, imagen, precio);
		}//updateProducto
		
	}//Class ProductoController
