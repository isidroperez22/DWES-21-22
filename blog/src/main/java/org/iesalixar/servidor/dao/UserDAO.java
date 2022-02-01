package org.iesalixar.servidor.dao;

import java.util.List;

import org.hibernate.Session;
import org.iesalixar.servidor.model.User;
import org.iesalixar.servidor.utils.dao.GenericDAO;
import org.iesalixar.servidor.utils.dao.GenericDAOImpl;

public interface UserDAO extends GenericDAO<User>{
	public List<User> searchByUserName(final String name);

	public void insert(User user);
}
