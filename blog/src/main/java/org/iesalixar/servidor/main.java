package org.iesalixar.servidor;

import org.hibernate.Session;
import org.iesalixar.servidor.model.User;
import org.iesalixar.servidor.service.CommentsService;
import org.iesalixar.servidor.service.CommentsServiceImpl;
import org.iesalixar.servidor.service.PostService;
import org.iesalixar.servidor.service.PostServiceImpl;
import org.iesalixar.servidor.service.UserService;
import org.iesalixar.servidor.service.UserServiceImpl;
import org.iesalixar.servidor.utils.HibernateUtils;

public class main {
	public static void main(String[] args) {
		
		Session session  = HibernateUtils.getSessionFactory().openSession();
		
		UserService userService = new UserServiceImpl(session);
		PostService postService = new PostServiceImpl(session);
		CommentsService commenstService = new CommentsServiceImpl(session);
		
		User usuario1 = new User();
		
		usuario1.setUserName("ManoloLama67");
		usuario1.setPassword("ManoloLama67");
		usuario1.setFirstName("Manolo");
		usuario1.setLastName("Manolo");
		usuario1.setEmail("manololama@gmail.com");
		
		User usuario2 = new User();
		
		usuario2.setUserName("PacoGonzalez56");
		usuario2.setPassword("PacoGonzalez56");
		usuario2.setFirstName("Paco");
		usuario2.setLastName("Gonzalez");
		usuario2.setEmail("pacogonzale@gmail.com");
		
		userService.insertNewUser(usuario1);
		userService.insertNewUser(usuario2);
		
		
		
		session.close();
		}
	}
