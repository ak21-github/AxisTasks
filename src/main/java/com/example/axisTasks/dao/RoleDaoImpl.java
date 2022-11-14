package com.example.axisTasks.dao;


import javax.persistence.EntityManager;

import com.example.axisTasks.entity.Role;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;




@Repository
public class RoleDaoImpl implements RoleDao {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public Role findRoleByName(String theRoleName) {
		
		Session currentSession=entityManager.unwrap(Session.class);
		
		Query<Role> theQuery=currentSession.createQuery("from Role where name=:rname",Role.class);
		
		theQuery.setParameter("rname",theRoleName);
		
		Role theRole=null;
		try {
			theRole=theQuery.getSingleResult();
		}
		catch(Exception exc) {
			theRole=null;
		}
		
		return theRole;
		
	}

	

}
