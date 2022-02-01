package org.iesalixar.servidor.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.iesalixar.servidor.model.Comments;
import org.iesalixar.servidor.utils.dao.GenericDAOImpl;

public class CommentsDAOImpl extends GenericDAOImpl<Comments> implements CommentsDAO {

	private Session session;
	
	public CommentsDAOImpl(Session session) {
		super(session);
		this.session = session;
	}

	public List<Comments> searchById(String id) {
		// Compruebo que la conexión está actica
		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
	}
		
		List<Comments> commentList = new ArrayList<Comments>();
			
		if (id!=null) {
			// Recupero todos los departamento con ese nombre		
			commentList = session.createQuery("FROM comments WHERE id=:id").setParameter("id", id).list();
		}				

	return commentList;
	}


	
	
}
