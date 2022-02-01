package dao;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.hibernate.Session;

import model.Reservation;
import model.User;

public class ReservationDAO {
	
	public static List<Reservation> getReservationHibernate(boolean onlyPendingReservations,String username){
		
		Session hibernateSession = Hibernate.getPersistenceSession();			
		hibernateSession.beginTransaction();
		
		String now = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
		String selectSQL = "";
		
		List<Reservation> selectList;
		
		
		
		if(username.equals("")) { // //only present and future reservations about everybody
			selectSQL = "SELECT r FROM Reservation As r WHERE r.reservation_date >=:param1";
					//"SELECT r FROM Reservation r INNER JOIN r.timetable_id" + " WHERE r.reservation_date >=:param1";
		}else { // reservations made by specified user
			if(getUserRoleHibernate(username).equals("admin")) { // about admin user
				if(onlyPendingReservations) // admin user - present and future reservations
					selectSQL = "FROM Reservation,Timetable "
							+ "  WHERE reservation_date >= '" + Date.valueOf(now) + "' "
									+ "AND reservation.timetable_id = timetable.timetable_id";
				else { // admin user - past, present and future reservations
					selectSQL = "FROM Reservation,Timetable "
							+ "  WHERE reservation.timetable_id = timetable.timetable_id";
					
				}
			}else { // about non admin user
				if(onlyPendingReservations) // non-admin user - present and future reservations
					selectSQL = "FROM Reservation, Timetable, User "
							+ "  WHERE reservation_date >= '" + Date.valueOf(now) + "' "
									+ "AND reservation.user_id = user.user_id AND user.username = '" + username + "'";
				else // non-admin user - past, present and future reservations
					selectSQL = "FROM Reservation, Timetable, User "
							+ "  WHERE reservation.user_id = user.user_id "
							+ "     AND timetable.timetable_id = reservation.timetable_id"
							+ "     AND user.username = '" + username + "'";
			}			
		}
		
		selectList = hibernateSession.createQuery(selectSQL, Reservation.class)//	.list();
												.setParameter("param1",Date.valueOf(now)).list();
		hibernateSession.getTransaction().commit();
		return selectList;
		
	}
	
	private static String getUserRoleHibernate(String username) {
		Session hibernateSession = Hibernate.getPersistenceSession();			
		hibernateSession.beginTransaction();
		
		String selectSQL = "SELECT U.role FROM User as U WHERE username ='" + username + "'";
		
		List<User> selectList = hibernateSession.createQuery(selectSQL, User.class).list();
		hibernateSession.getTransaction().commit();
		return selectList.get(0).getRole()==null ? "" : selectList.get(0).getRole();
	}
	
	public static List<Reservation> getReservationHibernateTEST(){
		
		Session hibernateSession = /*HibernateUtil.getSessionFactory().getCurrentSession();*/Hibernate.getPersistenceSession();			
		hibernateSession.beginTransaction();
		
		String selectSQL = "";
		
		selectSQL = "FROM Reservation";
		
		
		List<Reservation> selectList = hibernateSession.createQuery(selectSQL, Reservation.class).list();
		hibernateSession.getTransaction().commit();
		
		
		return selectList;
		
	}

}
