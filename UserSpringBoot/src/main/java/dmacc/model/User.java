package dmacc.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the users database table.
 * 
 */
@Embeddable
@Table(name="users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	private String country;

	private String email;

	private String name;

	public User() {
		super();
	}
	

	public User(String country, String email, String name) {
		super();
		this.country = country;
		this.email = email;
		this.name = name;
	}

	public User( String country, String email) {
		super();
		this.country = country;
		this.email = email;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [ country=" + country + ", email=" + email + ", name=" + name + "]";
	}

}