package com.spring.container.core.beans;

//this is my POJO class
public class Student {

	private int roll;
	private String name;
	private String address;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}

	// This method we calling for print data to console
	public void display() {
		System.out.println("name- " + name);
		System.out.println("Roll- " + roll);
		System.out.println("Address- " + address);
		System.out.println("---------------------------------------");
	}

}
