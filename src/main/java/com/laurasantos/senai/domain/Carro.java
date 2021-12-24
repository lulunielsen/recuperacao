package com.laurasantos.senai.domain;

import java.util.Objects;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Carro implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name="id_carro")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String marca;
	private String modelo;
	public  String cor;
	public  String placa;
	
	public Carro(){
	}
	
	public Carro(Integer id,String marca, String modelo, String cor, String placa){
	     super();
	     this.id = id;
		 this.marca = marca;
		 this.modelo = modelo;    
		 this.cor = cor;
		 this.placa = placa;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}


	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, marca, modelo, cor, placa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals(id, other.id) && Objects.equals(cor, other.cor)
				&& Objects.equals(modelo, other.modelo) && Objects.equals(placa, other.placa)
				&& Objects.equals(id, other.id)&& Objects.equals(marca, other.marca);
	}

}