package com.oracle.project1.module4;

public class Bank {

	String name;
	int accountNumber;
	boolean isActiveAccount;
	char accountType;

	void printBank() {
		System.out.println(name);
		System.out.println(accountNumber);
		System.out.println(isActiveAccount);
		System.out.println(accountType);
	}
}
