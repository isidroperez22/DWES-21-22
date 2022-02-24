package org.iesalixar.servidor.dao;

import java.util.ArrayList;

import org.iesalixar.servidor.models.Customer;



public interface DAOCustomer {
	
	public ArrayList<Customer> getAllCustomers();
	public Customer getCustomer(Integer Name);
	public boolean insertCustomer(Customer customer);

}
