package com.Bank.Application.Domain;

public class Transaction {
private int transactionId;
private Account account;
private Double amount;
private AccountType accountType;
public Transaction(int transactionId, Account account, Double amount, AccountType accountType) {
	this.transactionId = transactionId;
	this.account = account;
	this.amount = amount;
	this.accountType = accountType;
}//Transaction
public int getTransactionId() {
	return transactionId;
}
public void setTransactionId(int transactionId) {
	this.transactionId = transactionId;
}
public Account getAccount() {
	return account;
}
public void setAccount(Account account) {
	this.account = account;
}
public Double getAmount() {
	return amount;
}
public void setAmount(Double amount) {
	this.amount = amount;
}
public AccountType getAccountType() {
	return accountType;
}
public void setAccountType(AccountType accountType) {
	this.accountType = accountType;
}

}//class Transaction 
