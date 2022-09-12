package com.cg.ClassPerTable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClassPerTableTest {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//creating first Employee
		EmployeeN emp2=new EmployeeN();
		emp2.setName("Priyanka");
		emp2.setSalary(25000);
		em.persist(emp2); //to add the row
		
		//creating second Employee
		EmployeeN emp3=new EmployeeN();
		emp2.setName("Abhishek");
		emp2.setSalary(45000);
		em.persist(emp3); //to add the row
		
		em.getTransaction().commit();
		System.out.print("The data is added successfully in database");
		em.close();
		factory.close();

	}

}
