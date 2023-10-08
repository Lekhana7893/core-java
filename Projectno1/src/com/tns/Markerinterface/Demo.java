package com.tns.Markerinterface;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(1,"geeta");
		if(s instanceof Registerable)
			System.out.println("student registerable");
		else
			System.out.println("student Not registerable");
			
	}

}