package org.iesalixar.aleal.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.iesalixar.aleal.helper.Helper;
import org.iesalixar.aleal.helper.HibernateUtil;
import org.iesalixar.aleal.model.Customer;
import org.iesalixar.aleal.model.Order;

public class Main {

	public static void main(String[] args) {
		
		HibernateUtil.buildSessionFactory();
		HibernateUtil.openSessionAndBindToThread();
		Session session = null;
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
			Customer customer1 = new Customer();
			customer1.setFirstName("Pepito");
			customer1.setLastName("Apellido 1 Apellido 2");
			customer1.setAddress("street name - street number - more details - ZIP code - city/town name");
			customer1.setEmail("customer1@test.com");
			
			Customer customer2 = new Customer();
			customer2.setFirstName("Juanito");
			customer2.setLastName("Apellido 1 Juanito Apellido 2 Juanito");
			customer2.setAddress("street name - street number - more details - ZIP code - city/town name");
			customer2.setEmail("customer2@test.com");
		
		session.save(customer1);
		session.save(customer2);
		
			Order order1 = new Order();
			order1.setCustomerId(customer1.getId());
			order1.setCustomer(customer1);
			order1.setTotalPrice(235.4);
			order1.setOrderDate(Helper.fromStringToDate("01/01/2020"));
			
			Order order2 = new Order();
			order2.setCustomerId(customer1.getId());
			order2.setCustomer(customer1);
			order2.setTotalPrice(125.2);
			order2.setOrderDate(Helper.fromStringToDate("03/01/2020"));
			
			Order order3 = new Order();
			order3.setCustomerId(customer1.getId());
			order3.setCustomer(customer1);
			order3.setTotalPrice(75.3);
			order3.setOrderDate(Helper.fromStringToDate("06/01/2020"));
			
			Set<Order> orders = new HashSet<Order>();
			orders.add(order1);
			orders.add(order2);
			orders.add(order3);
		
		session.save(order1);
		session.save(order2);
		session.save(order3);
		
		customer1.setOrders(orders);
		session.save(customer1);
		
		
		session.getTransaction().commit();
		session.clear();
		
		HibernateUtil.openSessionAndBindToThread();
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Customer example = session.find(Customer.class, Long.parseLong("1"));
		
		System.out.println(example.getOrders().size());
		
		session.clear();
		HibernateUtil.closeSessionAndUnbindFromThread();
		HibernateUtil.closeSessionFactory();
	}

}
