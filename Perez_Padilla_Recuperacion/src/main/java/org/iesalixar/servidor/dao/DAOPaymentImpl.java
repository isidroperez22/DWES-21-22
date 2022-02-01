package org.iesalixar.servidor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.iesalixar.servidor.bd.PoolDB;
import org.iesalixar.servidor.models.Payment;


public class DAOPaymentImpl implements DAOPayment {


	@Override
	public Payment getPayment(int customerName) {

		Payment payment = null;
		Connection con = null;
		
		PoolDB pool = new PoolDB();
		
		con = pool.getConnection();

		try {

			String sql = "select c.customerNumber, count(p.amount) as pedidos from payments p inner join customer c on p.customerNumber = c.customerNumber where c.customerName LIKE ? ";
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setInt(1, customerName);
			ResultSet rs = statement.executeQuery();

			// Como el campo de búsqueda es la clave solo debería obtener un resultado
			// si no es así estaremos machacando cada vez el valor de customer y
			while (rs.next()) {

				payment = new Payment();

				payment.setCustomerNumber(rs.getInt("customerNumber"));
				payment.setCheckNumber(rs.getString("checkNumber"));
				payment.setDate(rs.getString("paymentDate"));
				payment.setAmount(rs.getDouble("pedidos"));

			}


		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return payment;
	}


}
