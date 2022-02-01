package org.iesalixar.servidor.service;

import java.util.List;

import org.iesalixar.servidor.model.Comments;
import org.iesalixar.servidor.model.User;


public interface CommentsService{
	public void insertNewComment(final Comments comment);	
	 
	public void updateComment(final Comments comment);	
	
	public void deleteComment(final Comments comment);
	
	public Comments searchById(final Long Id);
	
	public List<Comments> searchAll();
	
	public List<Comments> searchByName(String name);
}
