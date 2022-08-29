package com.service;

import com.entities.Employee;

public interface IEmployeeService {
	void addEmployee(Employee emp);//to create
	void updateEmployee(Employee emp);//to update
	Employee getEmployeeByID(int ID);//to retrieve
	void removeEmployee(Employee emp);//to delete
}
