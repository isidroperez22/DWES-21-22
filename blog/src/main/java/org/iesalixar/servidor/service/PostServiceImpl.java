package org.iesalixar.servidor.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.iesalixar.servidor.dao.PostDAO;
import org.iesalixar.servidor.dao.PostDAOImpl;
import org.iesalixar.servidor.model.Post;

public class PostServiceImpl implements PostService {
	
	private PostDAO postDAO;
	
	
	public PostServiceImpl(final Session session) {
		this.postDAO = new PostDAOImpl(session);
	}

	public void insertNewPost(Post post) {
		// Compruebo que no es nulo y que aún no existe
		// es decir no tiene ID
		if (post != null && post.getId() == null) {
			// Inserción del pedido
			postDAO.insert(post);
		}

	}

	public void updatePost(Post post) {
		// Compruebo que no es nulo y que aún no existe
		// es decir no tiene ID
		if (post != null && post.getId() != null) {
			// Inserción del pedido
			postDAO.update(post);	
		}
	}

	public void deletePost(Post post) {
		if (post != null && post.getId() != null) {
			// Inserción del pedido
			postDAO.delete(post);	
		}
		
	}

	public Post searchById(Long Id) {
		Post post = null;

		if (Id != null) {

			post = postDAO.searchById(Id);
		}

		return post;
	}

	public List<Post> searchAll() {
		List<Post> postList = new ArrayList<Post>();

		postList = postDAO.searchAll();

		return postList;
	}

	public List<Post> searchByName(String name) {
		List<Post> postList = new ArrayList<Post>();

		if (name!=null) {
			postList = postDAO.searchById(name);
		}
		return postList;
	}

}
