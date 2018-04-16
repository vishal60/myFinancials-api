package com.vishal.consumingrest.entities;

import java.util.ArrayList;

public class UserAccount {

    private String cust_account_id;
    private String account_number;
    private String account_name;
    private String outstanding_balance;
    private String party_number;
    private String party_id;
    private ArrayList<ParentParty> parent_party = new ArrayList<ParentParty>();
    private String currency_code;
    private ArrayList<Address> addresses = new ArrayList<Address>();
    
    public UserAccount(){}
    
	public String getCust_account_id() {
		return cust_account_id;
	}
	public void setCust_account_id(String cust_account_id) {
		this.cust_account_id = cust_account_id;
	}
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	public String getOutstanding_balance() {
		return outstanding_balance;
	}
	public void setOutstanding_balance(String outstanding_balance) {
		this.outstanding_balance = outstanding_balance;
	}
	public String getParty_number() {
		return party_number;
	}
	public void setParty_number(String party_number) {
		this.party_number = party_number;
	}
	public String getParty_id() {
		return party_id;
	}
	public void setParty_id(String party_id) {
		this.party_id = party_id;
	}
	public ArrayList<ParentParty> getParent_party() {
		return parent_party;
	}
	public void setParent_party(ParentParty parent_party) {
		this.parent_party.add(parent_party);
	}
	public String getCurrency_code() {
		return currency_code;
	}
	public void setCurrency_code(String currency_code) {
		this.currency_code = currency_code;
	}

	public ArrayList<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Address address) {
		this.addresses.add(address);
	}

	@Override
	public String toString() {
		return "Greeting [\ncust_account_id=" + cust_account_id + "\n" + "account_number=" + account_number + "\n" + "account_name="
				+ account_name + "\n" + "outstanding_balance=" + outstanding_balance + "\n" + "party_number=" + party_number
				+ "\n" + "party_id=" + party_id + "\n" + "parent_party=" + parent_party + "\n" + "currency_code=" + currency_code
				+ "\n" + "addresses=" + addresses + "\n" + "getCust_account_id()=" + getCust_account_id()
				+ "\n" + "getAccount_number()=" + getAccount_number() + "\n" + "getAccount_name()=" + getAccount_name()
				+ "\n" + "getOutstanding_balance()=" + getOutstanding_balance() + "\n" + "getParty_number()=" + getParty_number()
				+ "\n" + "getParty_id()=" + getParty_id() + "\n" + "getParent_party()=" + getParent_party()
				+ "\n" + "getCurrency_code()=" + getCurrency_code() + "\n" + "getAddresses()=" + getAddresses() + "\n" + "]";
	}

}