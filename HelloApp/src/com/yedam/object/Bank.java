package com.yedam.object;

//private(내혼자) <-> public(공용)
public class Bank {
	private String accountNo; //unique 계좌번호
	private String owner; // 예금주 
	private int balance; // 잔고
	//메소드. getter / setter
	public String getAccountNo() {
		return accountNo;
	}
	public String getOwner() {
		return owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	 
	 
}
