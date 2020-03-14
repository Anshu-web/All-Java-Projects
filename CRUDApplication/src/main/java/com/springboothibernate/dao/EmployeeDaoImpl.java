package com.springboothibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.hibernate.Query;
//import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboothibernate.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private EntityManager entitimanager;

	@Override
	public List<Employee> getAll() {
		
	
		
	TypedQuery<Employee> qu=entitimanager.createQuery(" from Employee", Employee.class);
	    List<Employee> li=qu.getResultList();
	    return li;
		 
		/*
		 * Session currentsession=entitimanager.unwrap(Session.class);
		 * org.hibernate.query.Query<Employee>
		 * query=currentsession.createQuery("from Employee",Employee.class);
		 * List<Employee> list=query.getResultList(); return list;
		 */
	}

	@Override
	public Employee getOneEmployee(int id) {
		Session currentsession=entitimanager.unwrap(Session.class);
		Employee employeeobj=currentsession.get(Employee.class, id);
		return employeeobj;
	}

	@Override
	public void deleteById(int id) {
 
		Session currentSession=entitimanager.unwrap(Session.class);
		 Employee employeeobj=currentSession.get(Employee.class, id);
		 currentSession.delete(employeeobj);
	}

	@Override
	public void saveEmployee(Employee employee) {
		
		Session currentsession=entitimanager.unwrap(Session.class);

		 currentsession.saveOrUpdate(employee);
		 
	}
	
 

}
