package com.Bank.Application.Domain;

public class Account {
private int accountId;
private Bank bank;
private Patron patron;
public Account(int accountId, Bank bank, Patron patron) {
	this.accountId = accountId;
	this.bank = bank;
	this.patron = patron;
}//account
public int getAccountId() {
	return accountId;
}
public void setAccountId(int accountId) {
	this.accountId = accountId;
}
public Bank getBank() {
	return bank;
}
public void setBank(Bank bank) {
	this.bank = bank;
}
public Patron getPatron() {
	return patron;
}
public void setPatron(Patron patron) {
	this.patron = patron;
}

}//class Account
