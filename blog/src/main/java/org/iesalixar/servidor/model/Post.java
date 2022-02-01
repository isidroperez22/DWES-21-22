package org.iesalixar.servidor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="post")
public class Post {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="title",unique=false,nullable=false)
	private String title;
	
	@Column(name="content",unique=false,nullable=false)
	private String content;
	
	@Column(name="date",unique=false,nullable=false)
	private String date;
	
	public Post() {
		// TODO Auto-generated constructor stub
	}

	public Post(Long id, String title, String content, String date) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
