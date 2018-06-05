package com.Bank.Application.Domain;

public class Bank {
private int bankId;
private String bankName;
public Bank(int bankId, String bankName) {
	this.bankId = bankId;
	this.bankName = bankName;
}//bank
public int getBankId() {
	return bankId;
}
public void setBankId(int bankId) {
	this.bankId = bankId;
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}

}//class Bank
