package com.cg.JoinInheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="MGR_table2")
public class ManagerK extends EmployeeK{
	@SuppressWarnings("unused")
	private static final long serialVersionUID=1L;
	private String deptName;
	
	//getter and setter methods
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	

}
