package org.iesalixar.servidor.dao;

import java.util.ArrayList;

import org.iesalixar.servidor.models.Employee;


public interface DAOEmployee {
	public ArrayList<Employee> getAllEmployees();
	public boolean insertEmployee(Employee employee);
	
	public ArrayList<Employee> getAllJefes();
	public Employee getEmpleado(int nombre);
}
