package org.iesalixar.servidor.dao;

import java.util.List;

import org.iesalixar.servidor.models.ProductLines;


public interface DAOproductLines {
	
	public List<ProductLines> getAllProductLine();
	public ProductLines getProductLines(String productLine);
	public boolean removeProductLines(String productLine);
	public boolean updateProductLines(ProductLines productLines);
	public boolean insertProductLines(String prudctLine, String textDescription, String htmlDescription);
}
