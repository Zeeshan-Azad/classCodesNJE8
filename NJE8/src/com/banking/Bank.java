package com.banking;

import java.util.Scanner;

public class Bank {
	String accountHolderName;
	String bankName;
	long accountNumber;
	long mobileNumber;
	int balanceAmount;
	int pin;
	long uid;
	int counterWrongPin;
	
	{
		counterWrongPin = 0;
	}
	
	public Bank(String accountHolderName, String bankName, long accountNumber, long mobileNumber, int balanceAmount,
			int pin, long uid) {
		super();
		this.accountHolderName = accountHolderName;
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.mobileNumber = mobileNumber;
		this.balanceAmount = balanceAmount;
		this.pin = pin;
		this.uid = uid;
	}

	public Bank(String accountHolderName, String bankName, long accountNumber, long mobileNumber, long uid) {
		super();
		this.accountHolderName = accountHolderName;
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.mobileNumber = mobileNumber;
		this.uid = uid;
	}
	
	
	/*
	 * constructor to create Bank object without any details as guest account to be updated
	 */
	public Bank() {
		
	}
	
	
	/**
	 * 
	 */
	public void checkBalance() {
		System.out.println("Your account balance is Rs " + this.balanceAmount);
	}
	
	
	/**
	 * 
	 * @param pin
	 */
	public void checkBalance(int pin) {
		if(counterWrongPin<3) {
			if(this.pin == pin) {
				checkBalance();
				counterWrongPin = 0;
			}
			else {
				System.out.println("Invalid pin");
				counterWrongPin++;
			}
		}
		else {
			System.out.println("You are blocked. Please consult in your nearest branch");
		}
	}
	
	
	
	/**
	 * 
	 * @param accountNumber
	 * @param amount
	 */
	public void deposit(long accountNumber, int amount) {
		if(this.accountNumber == accountNumber) {
			this.balanceAmount = this.balanceAmount + amount;
			System.out.println("Your account is credited with Rs " + amount);
			checkBalance();
		}
		else {
			System.out.println("Incorrect account details. Please verify");
		}
	}
	
	/**
	 * 
	 * @param accountNumber
	 * @param pin
	 * @param amount
	 */
	public void withdraw(long accountNumber, int pin, int amount) {
		if(counterWrongPin<3) {
			if(this.accountNumber == accountNumber) {
				if(this.pin == pin) {
					counterWrongPin = 0;
					if(amount<=this.balanceAmount) {
						System.out.println("Your account is debited with Rs " + amount);
						this.balanceAmount = this.balanceAmount-amount;
						checkBalance();
					}
					else {
						System.out.println("Insufficient fund");
					}
				}
				else {
					System.out.println("Incorrect pin");
					counterWrongPin++;
				}
			}
			else {
				System.out.println("Incorrect account details. Please verify");
			}
		}
		else {
			System.out.println("You are blocked. Please consult in your nearest branch");
		}
	}
	
	/**
	 * 
	 */
	public void changePin() {
		System.out.println("Please enter new pin");
		counterWrongPin = 0;
		int newPin = new Scanner(System.in).nextInt();
		this.pin = newPin;
	}
	
	
	/**
	 * 
	 * @param oldPin
	 */
	public void changePin(int oldPin) {
		if(this.pin == oldPin) {
			changePin();
		}
		else {
			System.out.println("Incorrect pin");
			counterWrongPin++;
		}
	}
	
	public void forgotPin(long accountNumber, long mobileNumber) {
		if(this.accountNumber == accountNumber && this.mobileNumber == mobileNumber) {
			changePin();
		}
		else {
			System.out.println("Incorrect mobile or account or both");
		}
	}
	
	
	
	
	
}