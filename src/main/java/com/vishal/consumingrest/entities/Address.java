package com.vishal.consumingrest.entities;

public class Address {
	private String address_id;
	private String fraud_bankruptcy;
	private String concatenated_address;
	private String branch_name;
	
	public String getAddress_id() {
		return address_id;
	}
	public void setAddress_id(String address_id) {
		this.address_id = address_id;
	}
	public String getFraud_bankruptcy() {
		return fraud_bankruptcy;
	}
	public void setFraud_bankruptcy(String fraud_bankruptcy) {
		this.fraud_bankruptcy = fraud_bankruptcy;
	}
	public String getConcatenated_address() {
		return concatenated_address;
	}
	public void setConcatenated_address(String concatenated_address) {
		this.concatenated_address = concatenated_address;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
}
