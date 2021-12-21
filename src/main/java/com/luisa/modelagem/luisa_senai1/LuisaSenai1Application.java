package com.luisa.modelagem.luisa_senai1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Arrays;


import com.luisasantos.senai.domain.Aluguel;
import com.luisasantos.senai.domain.Usuario;
import com.luisasantos.senai.domain.enuns.TipoUsuario;
import com.luisasantos.senai.repositories.AluguelRepository;
import com.luisasantos.senai.repositories.UsuarioRepository;


@SpringBootApplication
public class LuisaSenai1Application implements CommandLineRunner {
	
	@Autowired
	private AluguelRepository aluguelRepository;
	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(LuisaSenai1Application.class, args);
	}
	
	@Override
	public void run(String...args) throws Exception{
		@SuppressWarnings("rawtypes")
		Aluguel alg1 = new Aluguel();
		@SuppressWarnings("rawtypes")
		Aluguel alg2 = new Aluguel();
		
		aluguelRepository.saveAll(Arrays.asList(alg1,alg2));
		
		Usuario<Object> usu = new Usuario<Object>(null, "Luisa Nielsen", TipoUsuario.PESSOAFISICA);
		usuarioRepository.saveAll (Arrays.asList(usu));
	}

}