package org.iesalixar.servidor.dto;

import java.io.Serializable;

public class UsuarioDTO implements Serializable{
	private String user;
	private String password;
	
	public UsuarioDTO() {
		super();
	}	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	
	

}
