package superKeyword;

public class Person {
  String name;
  int age;
  
  Person(String name, int age){
	  this.name = name;
	  this.age = age;
  }
  
  void showPerson() {
	  System.out.println("He is " + name + "and " + age +  " years old");
  }
}
