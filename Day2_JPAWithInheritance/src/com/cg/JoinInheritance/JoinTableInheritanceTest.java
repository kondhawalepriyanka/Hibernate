package com.cg.JoinInheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JoinTableInheritanceTest {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//creating first employee
		EmployeeK emp3=new EmployeeK();
		emp3.setName("Siddhi");
		emp3.setSalary(28000);
		em.persist(emp3);
		
		//creating second employee
		EmployeeK emp4=new EmployeeK();
		emp4.setName("Atharva");
		emp4.setSalary(30000);
		em.persist(emp4);
		
		//creating a manager
		ManagerK m=new ManagerK();
		m.setDeptName("Sheela");
		m.setSalary(50000);
		m.setDeptName("HR");
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("The data is added successfully in the Database");
		em.close();
		factory.close();
	}

}
