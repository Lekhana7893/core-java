package com.tnsif.prog;

import java.util.Scanner;

import com.tns.programs.Encapsulation;

public class Exec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Encapsulation ob= new Encapsulation();//object creation and default constructor invoked
		 // one constructor will be called and that constructor is default constructor
		 ob.name="swetha";
		 ob.serialno=40;
		  ob.age=22;
		  ob.show();// accessing the mem functions

	}

}
