package com.laurasantos.senai.domain; 

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

	@Entity
	public class Usuario implements Serializable {
		private static final long serialVersionUID = 1L;
		
		@Column 
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer idUsuario;

		private String nome;
		private String CNH;

		@OneToMany(mappedBy = "usuario")
		private List<Carro> carros = new ArrayList<>();
		
	
		public Usuario() {
		}
            public Usuario(Integer idUsuario, String nome, String CNH) {
			super();
			this.idUsuario = idUsuario;
			this.nome = nome;
			this.CNH = CNH;
			
		}

		public Integer getIdUsuario() {
			return idUsuario;
		}

		public void setIdUsuario(Integer idUsuario) {
			this.idUsuario = idUsuario;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCNH() {
			return CNH;
		}

		public void setCNH(String CNH) {
			this.CNH = CNH;
		}



		@Override
		public int hashCode() {
			return Objects.hash(idUsuario);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Usuario other = (Usuario) obj;
			return Objects.equals(idUsuario, other.idUsuario)&& Objects.equals(nome, other.nome)&& Objects.equals(CNH, other.CNH);
		}
	}
		