package com.generation.ecommercedb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id", unique=true, nullable=false)
	private Long id;
	private String userName;
	private String password;
	public User(Long id, String userName, String password) {
		this.id = id;
		this.setUserName(userName);
		this.setPassword(password);
	}// constructor
	
	public User(){}//default constructor

    public Long getId() {
        return id;
    }//getId

    public void setId(Long id) {
        this.id = id;
    }//setId

	public String getUserName() {
		return userName;
	} //getUserName

	public void setUserName(String userName) {
		this.userName = userName;
	} //setUserName

	public String getPassword() {
		return password;
	} //getPassword

	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + "]";
	}

} // class user
