package com.laurasantos.senai.domain.enuns;

public enum TipoUsuario {
	
	PESSOAFISICA(1, "Pessoa Física"), PESSOAJURIDICA(2, "Pessoa jurídica");
	
	private int cod;
	private String descricao;
	
	TipoUsuario(int i, String string) {
	}

	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoUsuario toEnum(Integer cod) {
		if(cod == null) {
			return null;
			}
		for(TipoUsuario x : TipoUsuario.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
	throw new IllegalArgumentException("Id inválido: " + cod);
	
	}
}
