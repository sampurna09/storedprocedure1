package com.storedprocedurejava.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.storedprocedurejava.domain.User;




@Repository
public class UserRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<User> getUsers(){
		return entityManager.createNamedStoredProcedureQuery("getAllUser").getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<User> getSpecificUser(String input) {
		return entityManager.createNamedStoredProcedureQuery("specificUser").setParameter("tusername", input).getResultList();
	}

	
}
