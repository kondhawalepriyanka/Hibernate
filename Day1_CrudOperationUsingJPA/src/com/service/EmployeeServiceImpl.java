package com.service;

import com.dao.EmployeeRepositoryImpl;
import com.dao.IEmployeeRepository;
import com.entities.Employee;

public class EmployeeServiceImpl implements IEmployeeService
{
	private IEmployeeRepository dao;
	

	public EmployeeServiceImpl() {
		super();
		dao=new EmployeeRepositoryImpl();
	}

	@Override
	public void addEmployee(Employee emp) {
		dao.beginTransaction();
		dao.addEmployee(emp);
		dao.commitTransaction();
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		dao.beginTransaction();
		dao.commitTransaction();
		
	}

	@Override
	public Employee getEmployeeByID(int ID) {
		Employee emp=dao.getEmployeeByID(ID);
		return emp;
	}

	@Override
	public void removeEmployee(Employee emp) {
		dao.beginTransaction();
		dao.removeEmployee(emp);
		dao.commitTransaction();
		
	}
	

}
