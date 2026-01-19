package com.jdc.app.model;

public class StudentSearchController {
	
	private StudentRegistry registry;
	
	public StudentSearchController() {
		registry = StudentRegistry.getRegistry();
	}
	
	
	
	
	public void showAll() {
		var students = registry.getAll();
		
		for (var student : students) {
			System.out.println(student);
		}
		
	}
}
