package org.mascotitas.mascotitas.service;

import java.util.ArrayList;

import org.mascotitas.mascotitas.model.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CategoriaService {
	public final ArrayList<Categoria> lista = new ArrayList<Categoria>();
	@Autowired
	public CategoriaService() {                      //constructor vacio, para agregar productos con los datos establecidos anteriormente
		lista.add(new Categoria("Alimento"));
		lista.add(new Categoria("Juguetes"));
		lista.add(new Categoria("Ropa"));
		lista.add(new Categoria("Otros"));

	}//constructor
	
		public ArrayList<Categoria> getAllCategorias() {
			
			return lista;
		}//getAllCategoria
		
		public Categoria getCategoria(long id) {
			Categoria cat=null;
			for (Categoria categoria : lista) {
				if(id == categoria.getId()) {
					cat=categoria;
					break;
				}//If
			}//foreach
			return cat;
		}//getProducto
		
		public Categoria deleteCategoria(long id) {
			Categoria cat=null;
			for (Categoria categoria : lista) {
				if(id == categoria.getId()) {
					cat=categoria;
					lista.remove(categoria);
					break;
				}//If
			}//foreach
			return cat;
		}//delete Categoria
		public Categoria addCategoria(Categoria categoria) {
			lista.add(categoria);
			return categoria;
		}//add categoria
		
		public Categoria updateCategoria(long id, String categoria) {
			Categoria cat=null;
				for (Categoria cate : lista) {
					if(id == cate.getId()) {
						if(categoria!= null)cate.setCategoria(categoria);
							cat=cate;
							break;
					}//if
				}//foreach
				return cat;
		}
		}
