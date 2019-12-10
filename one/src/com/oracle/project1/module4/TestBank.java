package com.oracle.project1.module4;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b = new Bank();
		b.name = "SBI";
		b.accountNumber = 123456;
		b.isActiveAccount = true;
		b.accountType = 'S';
	
		b.printBank();
	}

}
