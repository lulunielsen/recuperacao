package com.laurasantos.senai.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import net.minidev.json.annotate.JsonIgnore;

@SuppressWarnings("hiding")
@Entity
public class Aluguel<Carro> implements Serializable {
	public static final long serialVersionUID = 1L;

	@Column(name="id_aluguel")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) Integer id;
	
	@Column(name = "nome_aluguel")
	private String nome;
	
	@JsonIgnore
	@OneToMany(mappedBy = "estado")
	private List<Carro> carros = new ArrayList<>();
	
	public Aluguel() {
}

	public Aluguel(Integer id, String nome, List<Carro> carros) {
		super();
		this.id = id;
		this.nome = nome;
		List<Carro> carro = null;
		this.carros = carro;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluguel<?> other = (Aluguel<?>) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (id.equals(other.id))
			return false;
		return true;
	}
}
