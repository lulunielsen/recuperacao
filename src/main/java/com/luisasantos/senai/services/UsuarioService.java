package com.luisasantos.senai.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luisasantos.senai.domain.Usuario;
import com.luisasantos.senai.exception.ObjectNotFoundException;
import com.luisasantos.senai.repositories.UsuarioRepository;

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
