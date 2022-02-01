package org.iesalixar.servidor.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.iesalixar.servidor.dao.UserDAO;
import org.iesalixar.servidor.dao.UserDAOImpl;
import org.iesalixar.servidor.model.User;

public class UserServiceImpl implements UserService{
	
	private UserDAO userDAO;
	
	public UserServiceImpl(final Session session) {
		this.userDAO = new UserDAOImpl(session);
	}

	public void insertNewUser(User user) {
		// Compruebo que no es nulo y que aún no existe
		// es decir no tiene ID
		if (user != null && user.getId() == null) {
			// Inserción del pedido
			userDAO.insert(user);
		}

	}

	public void updateUser(User user) {
		// Compruebo que no es nulo y que aún no existe
		// es decir no tiene ID
		if (user != null && user.getId() != null) {
			// Inserción del pedido
			userDAO.update(user);
		}
	}

	public void deleteUser(User user) {
		// Compruebo que no es nulo y que aún no existe
		// es decir no tiene ID
		if (user != null && user.getId() != null) {
			// Inserción del pedido
			userDAO.delete(user);
		}
	}

	public User searchById(Long userId) {
		User user = null;

		if (userId != null) {

			user = userDAO.searchById(userId);
		}

		return user;
	}

	public List<User> searchAll() {
		List<User> userList = new ArrayList<User>();

		userList = userDAO.searchAll();

		return userList;
	}

	public List<User> searchByName(String name) {
		List<User> userList = new ArrayList<User>();

		if (name!=null) {
			userList = userDAO.searchByUserName(name);
		}
		
		return userList;
	}
	
}
