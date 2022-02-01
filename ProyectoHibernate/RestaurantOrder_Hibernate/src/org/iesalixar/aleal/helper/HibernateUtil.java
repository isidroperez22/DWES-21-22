package org.iesalixar.aleal.helper;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.context.internal.ThreadLocalSessionContext;
import org.hibernate.service.ServiceRegistry;

import org.iesalixar.aleal.model.Customer;
import org.iesalixar.aleal.model.Order;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	
	public static synchronized void buildSessionFactory() {
		if (sessionFactory == null) {
			try {
			Configuration configuration = new Configuration();
	        configuration.configure("hibernate.cfg.xml");
	        
	        configuration.addAnnotatedClass(Order.class);
	        configuration.addAnnotatedClass(Customer.class);
	        
	        configuration.setProperty("hibernate.current_session_context_class", "thread");
	        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
	        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			}catch(Exception e) {
				e.printStackTrace();
			}
	     }
	 }
		
     public static void openSessionAndBindToThread() {
    	 Session session = sessionFactory.openSession();
         ThreadLocalSessionContext.bind(session);
     }
		
		
     public static SessionFactory getSessionFactory() {
    	 if (sessionFactory==null)  {
             buildSessionFactory();
         }
         return sessionFactory;
     }

     public static void closeSessionAndUnbindFromThread() {
         Session session = ThreadLocalSessionContext.unbind(sessionFactory);
         if (session!=null) {
             session.close();
         }
     }

     public static void closeSessionFactory() {
         if ((sessionFactory!=null) && (sessionFactory.isClosed()==false)) {
             sessionFactory.close();
         }
     }
	
}

