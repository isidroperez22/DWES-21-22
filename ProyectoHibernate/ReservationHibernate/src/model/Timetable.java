package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "timetable")
public class Timetable implements Serializable {
	
	@Id
	@Column(name="timetable_id")
	private int timetable_id;
	
	@Column(name="description")
	private String description;

	public Timetable() {
		
	}
	
	public Timetable(int id, String description) {
		setTimetable(id);
		setDescription(description);
	}
	
	public int getTimetable() {
		return timetable_id;
	}
	public void setTimetable(int timetable) {
		this.timetable_id = timetable;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Timetable Id: " +getTimetable() + " | Description: " + getDescription();
	}

}
