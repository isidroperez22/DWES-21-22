package org.iesalixar.servidor.dao;

import java.util.List;

import org.hibernate.Session;
import org.iesalixar.servidor.model.Post;
import org.iesalixar.servidor.utils.dao.GenericDAOImpl;

public class PostDAOImpl extends GenericDAOImpl<Post> implements PostDAO{
	
	private Session session;
	public PostDAOImpl(Session session) {
		super(session);
		this.session = session;
	}
	
	public List<Post> searchById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
