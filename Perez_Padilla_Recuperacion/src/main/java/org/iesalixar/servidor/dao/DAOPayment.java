package org.iesalixar.servidor.dao;

import java.util.List;

import org.iesalixar.servidor.models.Payment;


public interface DAOPayment {
	
	public Payment getPayment(int customerNumber);

}
