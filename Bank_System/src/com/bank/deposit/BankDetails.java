package com.bank.deposit;

public class BankDetails {
	String accountNo;
	String name;
	String location;
	String mobileNo;
	String depositerName;
	String Ifsc;
	double depositAmount,accountBalance;
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getDepositerName() {
		return depositerName;
	}
	public void setDepositerName(String depositerName) {
		this.depositerName = depositerName;
	}
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}
	public String getIfsc() {
		return Ifsc;
	}
	public void setIfsc(String ifsc) {
		Ifsc = ifsc;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
}
