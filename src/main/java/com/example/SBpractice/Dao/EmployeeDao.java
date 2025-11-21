package com.example.SBpractice.Dao;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.SBpractice.Entity.Employee;

@Repository
public class EmployeeDao {
	
	@Autowired
	SessionFactory factory;
	
	private static final Logger logger=LoggerFactory.getLogger(EmployeeDao.class);

	public boolean insertEmployee(Employee employee) {
	
		Session session=factory.openSession();
		session.persist(employee);
		session.beginTransaction().commit();
		session.close();
		
		return true;
	}

	public Employee display(int id) {
		
		Session session=factory.openSession();
		
		Employee e=session.get(Employee.class, id);
		
		logger.info("Employee Datails:"+e);
		logger.warn("I am in warn (WARNING)");
		logger.error("This is in the error log (ERROR)");
		logger.debug("This is debug log (DEBUG)");
		
		session.close();
		
		return e;
	}

}
