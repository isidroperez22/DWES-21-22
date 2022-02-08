package org.iesalixar.servidor.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MatriculaDTO implements Serializable {
	
	private String firstName;
	private String lastName;
	private List curso;
	private String dni;
	private List materias;
	
	public String getFirstName() {
		return firstName;
	}
	public MatriculaDTO() {
		materias = new ArrayList<>();
		curso = new ArrayList<>();
	}
	
	public List getMaterias() {
		return materias;
	}
	public void setMaterias(ArrayList materias) {
		this.materias = materias;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public List getCurso() {
		return curso;
	}
	public void setCurso(List curso) {
		this.curso = curso;
	}
	public void setMaterias(List materias) {
		this.materias = materias;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
	
	
}
