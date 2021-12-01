package dany.fmi.master.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "description")
public class DescriptionEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	
	@Column(name = "description", length = 1000)
	private String description;
	
	@Column(name = "genre", length = 255, nullable = false)
	private String genre;
	
	@Column(name = "author", length = 255, nullable = false)
	private String author;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
	private UserEntity user;

	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public String getGenre() {
		return genre;
	}

	public String getAuthor() {
		return author;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

}


