package org.mascotitas.mascotitas.service;

import java.util.List;
import java.util.Optional;

import org.mascotitas.mascotitas.model.Cliente;
import org.mascotitas.mascotitas.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
@Service
public class ClienteService {
	private final ClienteRepository clienteRepository;
	@Autowired 
	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}//constructor
	public List<Cliente> getAllClientes() {
		return clienteRepository.findAll();
	}//getAllClientes
	
	public Cliente getCliente(long id) {
		return clienteRepository.findById(id).orElseThrow(
				()-> new IllegalArgumentException("El Producto con el id [" +id
						+ "] no existe")
				);
			}//getcliente
	
	public Cliente deleteCliente(long id) {
		Cliente clien=null;
		if (clienteRepository.existsById(id)) {
			clien = clienteRepository.findById(id).get();
			clienteRepository.deleteById(id);
		}//if existById
		return clien;
	}//delete cliente
	
	@PostMapping
	public Cliente addCliente(Cliente cliente) {
		//TODO: validación 
				Optional<Cliente> tmpProd = clienteRepository.findByNombre(cliente.getNombre());
				
				if (tmpProd.isEmpty()) { 
				return clienteRepository.save(cliente);
				} else {
					System.out.println("Ya existe el producto con el nombre [" +
									cliente.getNombre() + "]");
					return null;
				}// else
				}//add cliente
	
	public Cliente updateCliente(long id, String nombre, String email, String contraseña, String telefono) {
		
		Cliente clien=null;
		if (clienteRepository.existsById(id)) {
			clien = clienteRepository.findById(id).get();
						if(nombre!= null)clien.setNombre(nombre);
						if(email!= null)clien.setEmail(email);
						if(contraseña!= null)clien.setContraseña(contraseña);
						if(telefono!= null)clien.setTelefono(telefono);
						clienteRepository.save(clien);
				}//existById
			return clien;
		}//updateCliente

}//Class 
	
	
	
	

