package com.storedprocedurejava.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@Entity
@NamedStoredProcedureQueries(
		{@NamedStoredProcedureQuery(name="getAllUser",procedureName="get_all_users"),
			@NamedStoredProcedureQuery(name="specificUser",procedureName="specific_user",
			parameters= {@StoredProcedureParameter(mode=ParameterMode.IN,name="tusername",type = String.class)})})

public class User {
	@Id
	private Long id;
	
	private String username;
	private String password;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
