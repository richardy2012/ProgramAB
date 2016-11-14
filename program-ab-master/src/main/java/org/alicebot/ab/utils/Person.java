package org.alicebot.ab.utils;

public class Person {

	private String Name;
	private int Age;
	public Person (String Name, int Age){
		this.Name = Name;
		this.Age = Age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
	
}
