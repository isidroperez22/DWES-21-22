package org.iesalixar.servidor.dto;

import java.util.ArrayList;
import java.util.List;

public class ConciertoDTO {
	
	private List<String> grupos;
	private int numero;
	private String tipo;

	
	public ConciertoDTO() {
		this.grupos = new ArrayList<>();
	}
	public List<String> getGrupos() {
		return grupos;
	}
	public void setGrupos(List<String> grupos) {
		this.grupos = grupos;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
