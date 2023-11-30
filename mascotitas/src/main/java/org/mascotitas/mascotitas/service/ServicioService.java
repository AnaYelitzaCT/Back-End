package org.mascotitas.mascotitas.service;

import java.util.ArrayList;

import org.mascotitas.mascotitas.model.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ServicioService {
	public final ArrayList<Servicio> lista = new ArrayList<Servicio>();
	@Autowired    
	public ServicioService() {  
		lista.add(new Servicio("Paseo a perros","Duración 30 min/incluye evidencia fotográfica o video","paseo.jpg", 150.00));

		lista.add(new Servicio("Aseo de mascotas","baño para perros y gatos",
							"baño.jpg", 300.00));

		lista.add(new Servicio("Hospedaje para mascotas","Incluye hospedaje, alimentación e hidratación",
							"hospedaje.jpg", 200.00));
	}//servicioService
	public ArrayList<Servicio> getAllServicios() {
		
		return lista;
	}//getAllServicios
	
	public Servicio getServicio(long id) {
		Servicio serv=null;
		for (Servicio servicio : lista) {
			if(id == servicio.getId()) {
				serv=servicio;
				break;
			}//If
		}//foreach
		return serv;
	}//getservicio
	
	public Servicio deleteServicio(long id) {
		Servicio serv=null;
		for (Servicio servicio : lista) {
			if(id == servicio.getId()) {
				serv=servicio;
				lista.remove(servicio);
				break;
			}//If
		}//foreach
		return serv;
	}//delete Servicio
	public Servicio addServicio(Servicio servicio) {
		lista.add(servicio);
		return servicio;
	}//add Servicio
	
	public Servicio updateServicio(long id,String nombre, String descripcion, String imagen, Double precio) {
		
		Servicio serv=null;
			for (Servicio servicio : lista) {
				if(id == servicio.getId()) {
						if(nombre!= null)servicio.setNombre(nombre);
						if(descripcion!= null)servicio.setDescripcion(descripcion);
						if(imagen!= null)servicio.setImage(imagen);
						if(precio!= null)servicio.setPrecio(precio);
						serv=servicio;
						break;
				}//if
			}//foreach
			return serv;
} //constructor
}//servicioService



