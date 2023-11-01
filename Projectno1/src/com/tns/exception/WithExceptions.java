package com.tns.exception;
// program to emonstrate try
public class WithExceptions {

	public static void divide() {
		// TODO Auto-generated method stub

		int a=6,b=0,c;
		try {// exception is raised
		c=a/b;
	}
	catch(ArithmeticException e) {// exception is handled and e is object of exception
		System.out.println("Exception Caught"+e.getMessage());
	}
		

	}

	}