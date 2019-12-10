package com.oracle.project1.module;

public class TestPerson {

	public static void main(String[] args) {
		Person p = new Person();
		p.name = "Bhanuja";
		p.age = 22;
		//p.height = 5.6;
		p.isProgrammer = true;
		p.gender = 'F';

		p.printPerson();

	}

}
