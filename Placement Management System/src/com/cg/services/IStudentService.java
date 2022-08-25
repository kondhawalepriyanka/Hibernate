package com.cg.services;

import java.security.Certificate;

import com.cg.entities.Student;

public interface IStudentService {
	
	public Student  addStudent(Student std);
	public Student updateStudent(Student std);
	public Student searchStudentByID(int Id);
	public Student searchStudentByHALLTICKET(int HALLTICKET);
	public boolean addCertificate(Certificate certificate);
	public boolean updateCertificate(Certificate certificate);
	public boolean deleteStudent(long id);
}
