package com.actualcare.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Bean is incomplete
 * Add as much feature to it
 * @author haris
 *
 */

@Entity
@Table(name="Admin")
public class Admin {
	
	//Admin Id
	@Id
	@Column(name = "admin_id")
	@SequenceGenerator(sequenceName="ADMIN_SEQ", name="ADMIN_SEQ")
	@GeneratedValue(generator="ADMIN_SEQ", strategy=GenerationType.SEQUENCE)
	private Integer A_Id;
	
	//One to One relation with LoginInfo table
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="Login_id")
	private LoginInfo login;
	
	//Empty Constructor
	public Admin() {
		super();
	}
	
	//Constructor with Id
	public Admin(Integer a_Id, LoginInfo login) {
		super();
		A_Id = a_Id;
		this.login = login;
	}
	
	//Constructor without Id
	public Admin(LoginInfo login) {
		super();
		this.login = login;
	}
	
	//Getters & Setters
	public Integer getA_Id() {
		return A_Id;
	}

	public void setA_Id(Integer a_Id) {
		A_Id = a_Id;
	}

	public LoginInfo getLogin() {
		return login;
	}

	public void setLogin(LoginInfo login) {
		this.login = login;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((A_Id == null) ? 0 : A_Id.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		if (A_Id == null) {
			if (other.A_Id != null)
				return false;
		} else if (!A_Id.equals(other.A_Id))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Admin [A_Id=" + A_Id + ", login=" + login + "]";
	}
	
	
}