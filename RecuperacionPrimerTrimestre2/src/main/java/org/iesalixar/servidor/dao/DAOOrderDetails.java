package org.iesalixar.servidor.dao;

import java.util.ArrayList;

import org.iesalixar.servidor.models.OrderDetail;

public interface DAOOrderDetails {
	
	public ArrayList<OrderDetail> getDetailsFromOrder(int orderNumber);
}
