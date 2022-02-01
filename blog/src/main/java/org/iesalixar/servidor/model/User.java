package org.iesalixar.servidor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="userName",unique=true,nullable=false)
	private String userName;
	
	@Column(name="password",unique=false,nullable=false)
	private String password;
	
	@Column(name="firstName",unique=false,nullable=false)
	private String firstName;
	
	@Column(name="lastName",unique=false,nullable=false)
	private String lastName;
	
	@Column(name="email",unique=false,nullable=false)
	private String email;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	

	public User(Long id, String userName, String password, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
}
