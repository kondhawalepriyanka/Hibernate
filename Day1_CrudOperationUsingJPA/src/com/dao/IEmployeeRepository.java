package com.dao;

import com.entities.Employee;

public interface IEmployeeRepository {
	void  addEmployee(Employee emp);// to create
	void updateEmployee(Employee emp);//To update
	Employee getEmployeeByID(int ID);//To retrieve
	void removeEmployee(Employee emp);// to delete
	void commitTransaction();
	void beginTransaction();

}
