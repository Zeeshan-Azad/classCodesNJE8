package com.banking;

public class TestBanking {
	public static void main(String[] args) {
		
		ICICI i1 = new ICICI("Ani", "ICICI", 98979897989799l, 8789878988l, 100000, 1431, 898786858788l);
		SBI s1 = new SBI("Zani", "BI", 78979897989789l, 7789878988l, 100000, 1431, 678786858744l);
		
		i1.checkBalance(1431);
		s1.checkBalance(1431);
		
		ATM.swipeCard(s1);
		ATM.swipeCard(i1);
	}
}
