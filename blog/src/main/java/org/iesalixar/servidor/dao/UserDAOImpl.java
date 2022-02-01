package org.iesalixar.servidor.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.iesalixar.servidor.model.User;
import org.iesalixar.servidor.utils.dao.GenericDAOImpl;

public class UserDAOImpl extends GenericDAOImpl<User> implements UserDAO{
	
	private Session session;
	

	public UserDAOImpl(Session session) {
		super(session);
		this.session = session;
	}


	public List<User> searchByUserName(String name) {
		// Compruebo que la conexión está actica
			if (!session.getTransaction().isActive()) {
				session.getTransaction().begin();
		}
			
			List<User> UserList = new ArrayList<User>();
				
			if (name!=null) {
				// Recupero todos los departamento con ese nombre		
				UserList = session.createQuery("FROM user WHERE userName=:name").setParameter("userName", name).list();
			}				

		return UserList;
	}

}
