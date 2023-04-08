package org.simple;

import java.util.Scanner;

public class Testing {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String name = s.nextLine();
		System.out.println("Employee name is:"+name);
		int empId = s.nextInt();;
		System.out.println("Employee id is:"+empId);
	
		long phone = s.nextLong();
		System.out.println("Employee phone is:"+phone);
		String name2 = s.next();
		System.out.println("Employee name is:"+name2);
	}

}
