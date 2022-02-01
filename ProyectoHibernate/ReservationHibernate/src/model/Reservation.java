package model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reservation")
public class Reservation implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3042985562385470624L;

	@Id
	@Column(name="reservation_id")
	private int id;
	
	@Column(name="reservation_date")
	private Date reservation_date;
	
	@Column(name="comment")
	private String comment;
	
	@Column(name="classroom_id")
	private int classroom;
	
	@OneToOne   
	@JoinColumn(name = "timetable_id")
	private Timetable timetable;
	
	public Timetable getTimetable() {
		return timetable;
	}

	public void setTimetable(Timetable timetable) {
		this.timetable = timetable;
	}

	public Reservation() {
		
	}
	
	public Date getReservation_date() {
		return reservation_date;
	}
	public void setReservation_date(Date reservationDate) {
		this.reservation_date = reservationDate;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public int getClassroom() {
		return classroom;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Classroom: " + getClassroom() + " | Reservation date: " +getReservation_date() + " | Timetable: " + getTimetable().getDescription() + " |  Comment: " + getComment();
	}

}
