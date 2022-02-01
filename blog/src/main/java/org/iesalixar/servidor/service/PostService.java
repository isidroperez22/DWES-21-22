package org.iesalixar.servidor.service;

import java.util.List;

import org.iesalixar.servidor.model.Post;

public interface PostService {
	public void insertNewPost(final Post post);	
	 
	public void updatePost(final Post post);	
	
	public void deletePost(final Post post);
	
	public Post searchById(final Long Id);
	
	public List<Post> searchAll();
	
	public List<Post> searchByName(String name);
}
