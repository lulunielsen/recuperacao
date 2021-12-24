package com.laurasantos.senai.domain;

import java.util.Objects;

import javax.persistence.JoinColumn;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.Id;


@Entity
public class Aluguel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name="id_aluguel")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String data_aluguel;
	private String dias_aluguel;
	public String getData_aluguel;
	public double valor_diaria;
		
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "carro_id")
	private Carro carro;
	
	public Aluguel(){
}
	public Aluguel(Integer id, String data_aluguel, String dias_aluguel) {
		super();
		this.id = id;
		this.data_aluguel = data_aluguel;
		this.dias_aluguel = dias_aluguel;
		this.usuario = usuario;
		this.carro = carro;
		this.valor_diaria = valor_diaria;
	}
	
	public void setData_aluguel(String data_aluguel) {
		this.data_aluguel = data_aluguel;
	}
	public String getDias_aluguel() {
		return dias_aluguel;
	}
	public void setDias_aluguel(String dias_aluguel) {
		this.dias_aluguel = dias_aluguel;
		}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
			this.id = id;
	}
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Carro getCarro() {
		return carro;
	}

	public void setValor_diaria(Double valor_diaria) {
		this.valor_diaria = valor_diaria;
	}
    public void getValor_diaria() {
    	this.valor_diaria = valor_diaria;
    }
		public static long getSerialversionuid() {
			return serialVersionUID;
		}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluguel other = (Aluguel) obj;
		return Objects.equals(id, other.id)&& Objects.equals(data_aluguel, other.data_aluguel)
		&& Objects.equals(dias_aluguel, other.dias_aluguel) && Objects.equals(usuario, other.usuario)
		&& Objects.equals(id, other.id)&& Objects.equals(carro, other.carro)&& Objects.equals(valor_diaria, other.valor_diaria);
	}
}