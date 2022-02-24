package org.iesalixar.servidor.dao;

import org.iesalixar.servidor.models.Usuario;

public interface DAOUsuario {

	public Usuario getUsuario(String nombre);
	public boolean registerUsuario(Usuario usuario);
	
	
	
}
