package com.banking;

public class SBI extends Bank{
	

	public SBI() {
		super();
	}

	public SBI(String accountHolderName, String bankName, long accountNumber, long mobileNumber, int balanceAmount,
			int pin, long uid) {
		super(accountHolderName, bankName, accountNumber, mobileNumber, balanceAmount, pin, uid);
	}

	public SBI(String accountHolderName, String bankName, long accountNumber, long mobileNumber, long uid) {
		super(accountHolderName, bankName, accountNumber, mobileNumber, uid);
	}
	
	public void loanOffer() {
		System.out.println("You are eligible for a special loan with us");
	}
}
