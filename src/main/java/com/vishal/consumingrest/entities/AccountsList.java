package com.vishal.consumingrest.entities;

public class AccountsList {
	
	private String  accountNumber;
	private String  accountName;
	private String  outstandingBalance;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getOutstandingBalance() {
		return outstandingBalance;
	}
	public void setOutstandingBalance(String outstandingBalance) {
		this.outstandingBalance = outstandingBalance;
	}
	
}
