package com.qka.java07extends;

public class Student extends Person{
//	private String name;
//	private String age;
//	
	public Student(){
		
	}
	
	public Student(String name , String age){
		this.setAge(age);
		this.setName(name);
	}
	
	public void eat(){
		System.out.println("�����Ӫ����");
	}
	
	public void walk(){
		System.out.println("�����");
	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getAge() {
//		return age;
//	}
//
//	public void setAge(String age) {
//		this.age = age;
//	}
}
