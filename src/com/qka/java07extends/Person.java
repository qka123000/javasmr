package com.qka.java07extends;

public class Person {
	private String name;
	private String age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public void eat(){
		System.out.println("eat");
	}
	
	public void walk(){
		System.out.println("walk");
	}
	
	public static void main(String[] args) {
		
	}
}
