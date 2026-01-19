package superKeyword;

public class Student extends Person {
	double gpa;
	
	Student(String name,int age, double gpa){
		super(name,age);
		this.gpa = gpa;
	}
	
	void showGpa() {
		System.out.println("This student name is " + name + " and " + age + " years old and " + "GPA is " + gpa);
	}

}
