package com.cg.client;

import com.cg.entities.Student;
import com.cg.services.IStudentService;
import com.cg.services.IStudentServiceImpl;

public class Client 
{

	public static void main(String[] args) 
	{
		Student std=new Student();
		IStudentService service = new IStudentServiceImpl();
		
		// creating DB
		
	    std.setID(2);
		std.setNAME("Priya");
		std.setROLLNO(8);
		std.setQUALIFICATION("BE");
		std.setCOURSE("CSE");
		std.setYEAR(2022);
		std.setCERTIFICATE("JAVA-Full Stack");
		std.setHALLTICKET(100);
		std.setCOLLEGE("PCCOE");
		service.addStudent(std);
		
		//Retrieve
		/*std =service.searchStudentByID(1);
		System.out.println("ID is " +std.getID());
		System.out.println("NAME is "+std.getNAME());
		System.out.println("COLLEGE is "+std.getCOLLEGE());*/
				
		//Update
		/*std = service.searchStudentByID(1);
		std.setROLLNO(55);
		service.updateStudent(std);*/
		
		
		//Delete
		/*std= service.searchStudentByID(1);
		service.deleteStudent(std);*/
	}

}
