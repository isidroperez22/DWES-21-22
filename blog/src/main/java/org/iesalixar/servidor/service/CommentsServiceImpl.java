package org.iesalixar.servidor.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.iesalixar.servidor.dao.CommentsDAO;
import org.iesalixar.servidor.dao.CommentsDAOImpl;
import org.iesalixar.servidor.dao.UserDAO;
import org.iesalixar.servidor.dao.UserDAOImpl;
import org.iesalixar.servidor.model.Comments;
import org.iesalixar.servidor.model.User;

public class CommentsServiceImpl implements CommentsService{
	
	private CommentsDAO commentDAO;
	
	public CommentsServiceImpl(final Session session) {
		this.commentDAO = new CommentsDAOImpl(session);
	}

	public void insertNewComment(Comments comment) {
		// Compruebo que no es nulo y que aún no existe
		// es decir no tiene ID
		if (comment != null && comment.getId() == null) {
			// Inserción del pedido
			commentDAO.insert(comment);
		}

	}

	public void updateComment(Comments comment) {
		// Compruebo que no es nulo y que aún no existe
		// es decir no tiene ID
		if (comment != null && comment.getId() != null) {
			// Inserción del pedido
			commentDAO.update(comment);
		}
	}

	public void deleteComment(Comments user) {
		// Compruebo que no es nulo y que aún no existe
		// es decir no tiene ID
		if (user != null && user.getId() != null) {
			// Inserción del pedido
			commentDAO.delete(user);
		}
	}

	public Comments searchById(Long Id) {
		Comments user = null;

		if (Id != null) {

			user = commentDAO.searchById(Id);
		}

		return user;
	}

	public List<Comments> searchAll() {
		List<Comments> userList = new ArrayList<Comments>();

		userList = commentDAO.searchAll();

		return userList;
	}

	public List<Comments> searchByName(String id) {
		List<Comments> userList = new ArrayList<Comments>();

		if (id!=null) {
			userList = commentDAO.searchById(id);
		}
		
		return userList;
	}
	
}
