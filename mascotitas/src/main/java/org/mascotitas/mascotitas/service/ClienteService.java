package org.mascotitas.mascotitas.service;

import java.util.ArrayList;

import org.mascotitas.mascotitas.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ClienteService {
	public final ArrayList<Cliente> lista = new ArrayList<Cliente>();
	@Autowired 
	public ClienteService() { 
		lista.add(new Cliente("Tania Cardenas","tania@gmail.com",
				"tania123","2451233456"));
		lista.add(new Cliente("Ana Campos","ana@gmail.com",
				"ana1234","2321678987"));
		lista.add(new Cliente("Yelitza Tapia","yeli@gmail.com",
				"yeli123","2541265678"));
		lista.add(new Cliente("Amanda Terecuerdo","amanda@gmail.com",
				"amanda12","8934602214"));
		lista.add(new Cliente("Pedro Perez","pedro@gmail.com",
				"pedro123","8134569909"));
	}//clienteservice
	public ArrayList<Cliente> getAllClientes() {
		
		return lista;
	}//getAllClientes
	
	public Cliente getCliente(long id) {
		Cliente clien=null;
		for (Cliente cliente : lista) {
			if(id == cliente.getId()) {
				clien=cliente;
				break;
			}//If
		}//foreach
		return clien;
	}//getCliente
	
	public Cliente deleteCliente(long id) {
		Cliente clien=null;
		for (Cliente cliente : lista) {
			if(id == cliente.getId()) {
				clien=cliente;
				lista.remove(cliente);
				break;
			}//If
		}//foreach
		return clien;
	}//delete producto
	public Cliente addCliente(Cliente cliente) {
		lista.add(cliente);
		return cliente;
	}//add producto
	
	public Cliente updateCliente(long id, String nombre, String email, String contraseña, String telefono) {
		
		Cliente clien=null;
			for (Cliente cliente : lista) {
				if(id == cliente.getId()) {
						if(nombre!= null)cliente.setNombre(nombre);
						if(email!= null)cliente.setEmail(email);
						if(contraseña!= null)cliente.setContraseña(contraseña);
						if(telefono!= null)cliente.setTelefono(telefono);
						clien=cliente;
						break;
				}//if
			}//foreach
			return clien;
} //constructor
}//ProductoService

	
	
	
	

