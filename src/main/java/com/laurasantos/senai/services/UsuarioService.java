package com.laurasantos.senai.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laurasantos.senai.domain.Usuario;
import com.laurasantos.senai.exception.ObjectNotFoundException;
import com.laurasantos.senai.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	
	
	@Autowired
	private UsuarioRepository repo;
	
	@SuppressWarnings("unused")
	@Autowired
	private UsuarioRepository AluguelRepository;
	
	
	@SuppressWarnings("rawtypes")
	public Usuario buscar(Integer idCliente) {
		java.util.Optional<Usuario> obj = repo.findById(idCliente);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Número de id não encotrado. id: " + idCliente + ", tipo: "
				+ Usuario.class.getName()));
		
	}
	
	public void delete (Integer id) {
		buscar(id);
		repo.deleteById(id);
	}
}
