package com.emp.details;

public class EmployeeInfo {
	int empId;
	String empName;
	String mailId;
	String location;
	int phoneNo;
	int experience;
	double salary;
	String desigination;
	
//	public EmployeeInfo(int empId, String empName, String mailId, String location, int phoneNo, int experience,
//			double salary, String desigination) {
//	
//		this.empId = empId;
//		this.empName = empName;
//		this.mailId = mailId;
//		this.location = location;
//		this.phoneNo = phoneNo;
//		this.experience = experience;
//		this.salary = salary;
//		this.desigination = desigination;
//	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesigination() {
		return desigination;
	}
	public void setDesigination(String desigination) {
		this.desigination = desigination;
	}
	@Override
	public String toString() {
		return "EmployeeInfo [empId=" + empId + ", empName=" + empName + ", mailId=" + mailId + ", location=" + location
				+ ", phoneNo=" + phoneNo + ", experience=" + experience + ", salary=" + salary + ", desigination="
				+ desigination + "]";
	}
}
