package com.luisasantos.senai.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.luisasantos.senai.domain.Usuario;
import com.luisasantos.senai.services.UsuarioService;

@RestController
@RequestMapping(value="/usuario")
public class UsuarioResources {
	
	
	@Autowired
	private UsuarioService service;
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Usuario> find(@PathVariable Integer id){
		Usuario obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
		
	}
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
		
	
}
