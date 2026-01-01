package com.jdc.app.model;

import java.util.Scanner;

public class StudentRegistrationController {
	
	private Scanner scanner;
	private StudentRegistry registry; 

	public StudentRegistrationController(){
		scanner = new Scanner(System.in);
//		registry = new StudentRegistry();
		registry = StudentRegistry.getRegistry();

	}

		public void addNewStudent() {
			System.out.print("Please enter student name : ");
			String name = scanner.nextLine();
			registry.addNew(name);
		}
}
