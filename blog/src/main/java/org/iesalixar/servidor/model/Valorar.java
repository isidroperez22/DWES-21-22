package org.iesalixar.servidor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="post")
public class Valorar {
	
	@Id
	@ManyToOne
	@JoinColumn(name="user", insertable = false, updatable = false)
	private User user;

    @Id
    @ManyToOne
    @JoinColumn(name="post",insertable = false, updatable = false)
    private Post post;
    
    @Column
    private Integer puntuacion;
    
    
    public Valorar() {
		// TODO Auto-generated constructor stub
	}

	public Valorar(User user, Post post, Integer puntuacion) {
		super();
		this.user = user;
		this.post = post;
		this.puntuacion = puntuacion;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public Integer getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(Integer puntuacion) {
		this.puntuacion = puntuacion;
	}
    
}
