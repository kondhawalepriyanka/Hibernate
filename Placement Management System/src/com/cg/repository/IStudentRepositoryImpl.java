package com.cg.repository;
import java.security.Certificate;

import javax.persistence.EntityManager;
import com.cg.entities.Student;

public class IStudentRepositoryImpl implements IStudentRepository
{
	private static final Student student=null;
	private EntityManager em;
	

	public IStudentRepositoryImpl() 
	{
		super();
		em=JPAUtil.getEntityManager();		
	}
	@Override
	public Student addStudent(Student std) {
		em.persist(std);
		return std;
	}

	@Override
	public Student updateStudent(Student std) {
		em.merge(std);
		return std;
	}
	
	@Override
	public Student searchStudentByID(int ID) {
		Student std = em.find(Student.class, ID);
		return std;
	}

	@Override
	public Student searchStudentByHallticket(int HALLTICKET) {
		Student std = em.find(Student.class, HALLTICKET);
		return std;
	}

	@Override
	public void commitTransaction() 
	{
		em.getTransaction().commit();
			}

	@Override
	public void beginTransaction() 
	{
		em.getTransaction().begin();
		}
	@Override
	public boolean deleteStudent(long std) {
		em.remove(std);
		return false;
	}
	@Override
	public Student addCertificate(Certificate certificate) {
		em.persist(certificate);
		return null;
	}
	@Override
	public Student updateCertificate(Certificate certificate) {
		em.merge(certificate);
		return null;
	}
}
