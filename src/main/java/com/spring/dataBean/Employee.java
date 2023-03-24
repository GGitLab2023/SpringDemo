package com.spring.dataBean;

public class Employee {
	private String empName, empAddress;
	private int empId, empSal;
	

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee Information [My Name is " + empName  + " , My address is " + empAddress + " , My employee Id is " + empId + " and My salary is " + empSal
				+ "]";
	}

	


}
