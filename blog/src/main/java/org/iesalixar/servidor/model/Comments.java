package org.iesalixar.servidor.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Comments {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="title",unique=true,nullable=false)
	private String title;
	
	@Column(name="content",unique=false,nullable=false)
	private String content;
	
	@ManyToOne
    private User userC;

    @ManyToOne
    private Post postC;
    

	public Comments() {
		// TODO Auto-generated constructor stub
	}

    
	public User getUserC() {
		return userC;
	}

	public void setUserC(User userC) {
		this.userC = userC;
	}

	public Post getPostC() {
		return postC;
	}

	public void setPostC(Post postC) {
		this.postC = postC;
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

}
