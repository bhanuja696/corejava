package com.oracle.project1.module;
/**
 * 
 * @author bsuresh5678
 * 
 *Person Class takes person information and prints on console.
 */
public class Person {
//variables --used to hold the information
	String name;
	int age;
	boolean isProgrammer;
	char gender;

	// method:actions, logic...etc
/*
 * prints all the person related information
 */
	void printPerson() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		//System.out.println("height:"+height);
		System.out.println("is programmer:"+isProgrammer);
		System.out.println("Gender:"+gender);
	}

}
