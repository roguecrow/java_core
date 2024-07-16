package com.chainsys.model;

public class Company {
	private String companyName;
	private Employee[] employees;
	private int numEmployees;
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Employee[] getEmployees() {
		return employees;
	}
	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}
	public int getNumEmployees() {
		return numEmployees;
	}
	public void setNumEmployees(int numEmployees) {
		this.numEmployees = numEmployees;
	}
	
	public Company(String companyName, Employee[] employees, int numEmployees) {
		super();
		this.companyName = companyName;
		this.employees = employees;
		this.numEmployees = numEmployees;
	}
	
	public double getAverageSalary() {
		double totalSalary = 0;
		for(Employee empDetails :employees) {
			totalSalary += empDetails.getSalary();
		}
		
		return (totalSalary/numEmployees);
		
	}
	
	public double getMaxSalary() {
		double maxSalary = 0;
		for(Employee empDetails :employees) {
			if(maxSalary<empDetails.getSalary())
			maxSalary = empDetails.getSalary();
		}
		return maxSalary;
		
	}
	public Employee[] getEmployeesByDesignation(String designation){
		for(Employee empDetails :employees) {
			if(empDetails.getDesignation().equalsIgnoreCase(designation)) {
				System.out.println("Id:" +empDetails.getId()+", Name:" +empDetails.getName()+ ", Designation:" + empDetails.getDesignation()+", Salary:"+ empDetails.getSalary());
			}
		}
		return employees;
		
	}
}
