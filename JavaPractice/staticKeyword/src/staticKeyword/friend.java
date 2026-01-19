package staticKeyword;

public class friend {
	String name;
	int age;
	static int totalPerson;

	friend(String name,int age){
		this.name = name;
		this.age = age;
		totalPerson++;
		System.out.println("This student is " + name + " and he is " + age + " years old. So there is " + totalPerson);
	

};
}
