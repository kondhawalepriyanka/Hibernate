package com.cg.repository;
import java.security.Certificate;

import com.cg.entities.Student;

public interface IStudentRepository
{
	public Student addStudent(Student std);
	public Student addCertificate(Certificate certificate);
	public Student updateStudent(Student std);
	public Student updateCertificate(Certificate certificate);
	public Student searchStudentByID(int ID);
	public Student searchStudentByHallticket(int HALLTICKET);
	public boolean deleteStudent(long std);
	void commitTransaction();
	void beginTransaction();

}