package com.laura.modelagem.laura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Arrays;


import com.laurasantos.senai.domain.Aluguel;
import com.laurasantos.senai.domain.Usuario;
import com.laurasantos.senai.domain.enuns.TipoUsuario;
import com.laurasantos.senai.repositories.AluguelRepository;
import com.laurasantos.senai.repositories.UsuarioRepository;


@SpringBootApplication
public class LauraSenai1Application implements CommandLineRunner {
	
	@Autowired
	private AluguelRepository aluguelRepository;
	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(LauraSenai1Application.class, args);
	}
	
	@Override
	public void run(String...args) throws Exception{
		@SuppressWarnings("rawtypes")
		Aluguel alg1 = new Aluguel();
		@SuppressWarnings("rawtypes")
		Aluguel alg2 = new Aluguel();
		
		aluguelRepository.saveAll(Arrays.asList(alg1,alg2));
		
		Usuario<Object> usu = new Usuario<Object>(null, "Laura Nielsen", TipoUsuario.PESSOAFISICA);
		usuarioRepository.saveAll (Arrays.asList(usu));
	}

}
