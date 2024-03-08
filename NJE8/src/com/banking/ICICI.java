package com.banking;

public class ICICI extends Bank{

	public ICICI() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ICICI(String accountHolderName, String bankName, long accountNumber, long mobileNumber, int balanceAmount,
			int pin, long uid) {
		super(accountHolderName, bankName, accountNumber, mobileNumber, balanceAmount, pin, uid);
		// TODO Auto-generated constructor stub
	}

	public ICICI(String accountHolderName, String bankName, long accountNumber, long mobileNumber, long uid) {
		super(accountHolderName, bankName, accountNumber, mobileNumber, uid);
		// TODO Auto-generated constructor stub
	}
	
	public void creditCardOffer() {
		System.out.println("You are eligible for Coral Cards");
	}

}
