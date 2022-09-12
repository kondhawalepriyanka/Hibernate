package com.client;

import com.entities.Employee;
import com.service.IEmployeeService;
import com.service.EmployeeServiceImpl;

public class Client {

	public static void main(String[] args) {
		IEmployeeService service=new EmployeeServiceImpl();
		Employee emp = new Employee();
		emp.setId(2);
		emp.setName("PQRS");
		service.addEmployee(emp);
	}

}
