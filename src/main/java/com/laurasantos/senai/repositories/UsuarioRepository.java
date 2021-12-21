package com.laurasantos.senai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laurasantos.senai.domain.Usuario;

@SuppressWarnings("rawtypes")
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
