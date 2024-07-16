package com.chainsys.model;

public class Employee {

	private int employeeId;
	private String name;
	private String branch;
	private double rating;
	private boolean companyTransport;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public boolean isCompanyTransport() {
		return companyTransport;
	}
	public void setCompanyTransport(boolean companyTransport) {
		this.companyTransport = companyTransport;
	}
	public Employee(int employeeId, String name, String branch, double rating, boolean companyTransport) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.branch = branch;
		this.rating = rating;
		this.companyTransport = companyTransport;
	}
}
