package org.iesalixar.servidor.service;

import java.util.List;

import org.iesalixar.servidor.model.User;


public interface UserService{
	public void insertNewUser(final User user);	
	 
	public void updateUser(final User user);	
	
	public void deleteUser(final User user);
	
	public User searchById(final Long userId);
	
	public List<User> searchAll();
	
	public List<User> searchByName(String name);
}
