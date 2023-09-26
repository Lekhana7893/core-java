// Program to illustrate Data Encapsulation
package com.tnsif.prog;

public class Encapsulation {
	   protected int serialno;// datamembers
     public String name;
     int age;
     public void show()  //membersfunction
     {
  System.out.println("serial number"+ serialno+ "\t"+ "name"+ name+ "\t"+ "age"+ age);
 }
 public Encapsulation(){// explici default constructor
	System.out.println("hello");
}
}
