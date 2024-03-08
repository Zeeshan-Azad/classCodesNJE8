package com.banking;

import java.util.Scanner;

public class ATM {
	
	static void printDetail(Bank b) {
		System.out.println("Welcome " + b.accountHolderName + " to AXIS bank ATM");
	}
	
	public static void swipeCard(Bank b) { //upcasting
		printDetail(b);
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter what you want to do");
		int input = sc.nextInt();
		
		if(input==1) {
			System.out.println("Your are going to withdraw");
			System.out.println("Enter account number");
			long account = sc.nextLong();
			
			System.out.println("Enter pin");
			int pin = sc.nextInt();
			
			System.out.println("Enter amount");
			int amount = sc.nextInt();
			
			b.withdraw(account, pin, amount);
			
			if(b instanceof SBI) {
				SBI s = (SBI)b;
				s.loanOffer();
			}
			else if(b instanceof ICICI) {
				ICICI i = (ICICI)b;
				i.creditCardOffer();
			}
			else if(b instanceof HDFC) {
				
			}
			else {
				
			}
			
		}
		
		else if(input==2) {
			System.out.println("You want to check Balance");
			System.out.println("Enter pin");
			int pin = sc.nextInt();
			b.checkBalance(pin);
		}
	}
}