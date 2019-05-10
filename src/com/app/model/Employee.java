package com.app.model;

public class Employee {
	
	private int eid;
	private String empName;
	public Employee() {
		super();
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		eid = eid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [Eid=" + eid + ", empName=" + empName + "]";
	}
	

}
