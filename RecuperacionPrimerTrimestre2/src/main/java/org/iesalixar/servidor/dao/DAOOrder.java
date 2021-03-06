package org.iesalixar.servidor.dao;

import java.util.ArrayList;

import org.iesalixar.servidor.models.Order;

public interface DAOOrder {
	
	public Order getOrder(int orderNumber);
	public ArrayList<Order> getAllOrders();
	public boolean updateOrder(Order customer);

}
