package com.cg.services;

import com.cg.entities.Student;
import com.cg.repository.IStudentRepository;
import com.cg.repository.IStudentRepositoryImpl;


public class IStudentServiceImpl implements IStudentService 
{
	private IStudentRepository dao;
	
	public IStudentServiceImpl() 
	{
		dao = new IStudentRepositoryImpl();
	}
	
	@Override
	public Student addStudent(Student std) {
		dao.beginTransaction();
		dao.addStudent(std);
		dao.commitTransaction();
		return std;
	}

	@Override
	public Student updateStudent(Student std) {
		dao.beginTransaction();
		dao.updateStudent(std);
		dao.commitTransaction();
		return std;
	}
	
	@Override
	public Student searchStudentByID(int Id) {
		Student std= dao.searchStudentByID(Id);
		return std;
	}

	@Override
	public Student searchStudentByHALLTICKET(int HALLTICKETD) {
		Student std=  dao.searchStudentByHallticket(HALLTICKETD);
		return std;
	}

	@Override
	public Student addCertificate(Student std) {
		dao.beginTransaction();
		dao.addCertificate(std);
		dao.commitTransaction();
		return std;
	}
	
	@Override
	public Student updateCertificate(Student std) {
		dao.beginTransaction();
		dao.addCertificate(std);
		dao.commitTransaction();
		return std;
	}

	@Override
	public Student deleteStudent(Student std) {
		dao.beginTransaction();
		dao.deleteStudent(std);
		dao.commitTransaction();
		return std;
		
	}

}
