package org.iesalixar.servidor.dto;

import java.io.Serializable;

public class MatriculaDTO implements Serializable {
	
	private String firstName;
	private String lastName;
	private String curso;
	private String email;
	
	
	public MatriculaDTO() {
		super();
	}
	
	public String getFirstName() {
		return firstName;
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
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
}
