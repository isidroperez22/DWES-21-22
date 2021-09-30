import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Tablas.Payments;

public class ClassicModels {
	Connection con = ConexionBD.getConnection();
	
	public static List<Payments> getPayments() {
		Connection con = ConexionBD.getConnection();
		ArrayList<Payments> list_payments = new ArrayList<Payments>();

		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from payments");

			while (rs.next()) {
				Payments p = new Payments(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4));
				list_payments.add(p);
			}

		} catch (SQLException throwables) {
			
		}

		return list_payments;

	}

}
