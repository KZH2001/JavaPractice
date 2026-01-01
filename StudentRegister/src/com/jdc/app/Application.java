package com.jdc.app;

import java.util.*;
import com.jdc.app.model.*;

public class Application {
	
	private Scanner scanner;
	private StudentRegistrationController registrationController;
	private StudentSearchController searchController;
	
	public Application() {
		scanner = new Scanner(System.in);
		registrationController = new StudentRegistrationController();
		searchController = new StudentSearchController();
	}
	public static void main (String[] args) {
		new Application().launch();
		
	}
	
	public void launch() {
		
		showGreetingMessage("Welcome");
		
		while(true) {
			showOperations();
			
			String operationId = getUserInput();
			if (!operationId.equals("1") &&  !operationId.equals("2")) {
				break;
			}
			
			if(operationId.equals("1")) {
				addNewStudent();
			}
			if(operationId.equals("2")) {
				showAllStudents();
			}
			System.out.println();
		}
		showGreetingMessage("Good Bye");
		
	}
	private void addNewStudent() {
		System.out.println("Add New Student Operation");
		registrationController.addNewStudent();
	}
	
	private void showAllStudents() {
		System.out.println("Show All Students");
		searchController.showAll();
	}
	
	private void showGreetingMessage(String message) {
		System.out.println("================================");
		System.out.println(message);
		System.out.println("================================");
		System.out.println();
		
	}
	private void showOperations() {
		System.out.println("Operators");
		System.out.println("1. Add New Student");
		System.out.println("2. Show All");
		System.out.println();
		
	}
	
	private String getUserInput() {
		
			System.out.println("Operation ID : ");
			return scanner.nextLine();
	}
}
