package com.storeprocedure.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

 import com.storeprocedure.model.User;

@Repository
public class UserDao {
	
	@Autowired
	EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<User> getAllUsers()
	{
		//Instaed of using hibernate will be using storeprocedure to get the data from the database;
		
		
		/*
		 * Session currentSession=entityManager.unwrap(Session.class);
		 * 
		 * Query<User> query=currentSession.createQuery("from User", User.class);
		 * 
		 * List<User> list=query.getResultList();
		 * 
		 * return list;
		 */
		 
		
		//*****************************************************************//
		
		
		//return entityManager.createStoredProcedureQuery("getUsers").getResultList();
		
		 return entityManager.createNamedStoredProcedureQuery("firstProcedure").getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<User> getUserById(String name)
	
	{
		return entityManager.createStoredProcedureQuery("getUserByName").setParameter("ByName", name).getResultList();
	//	return entityManager.createStoredProcedureQuery("igyu").setp
				
	}

}
