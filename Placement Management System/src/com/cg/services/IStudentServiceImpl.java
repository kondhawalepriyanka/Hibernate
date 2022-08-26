package com.cg.services;

import java.security.Certificate;

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
	public boolean addCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.addCertificate(certificate);
		dao.commitTransaction();
		return true;
	}
	
	@Override
	public boolean updateCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.updateCertificate(certificate);
		dao.commitTransaction();
		return true;
	}

	@Override
	public boolean deleteStudent(long id) {
		dao.beginTransaction();
		dao.deleteStudent(id);
		dao.commitTransaction();
		return false;
	}

	
		
	

}
