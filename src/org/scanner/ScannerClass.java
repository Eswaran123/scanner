package org.scanner;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Emp id: ");
		int id=scan.nextInt();
		scan.nextLine();
		System.out.println("Emp Name: ");
		String name=scan.nextLine();
		System.out.println("Emp phNo: ");
		int phNo=scan.nextInt();
		System.out.println("Emp salary: ");
		int salary=scan.nextInt();
		scan.nextLine();
		System.out.println("Emp Gender: ");
		String gender=scan.nextLine();
		System.out.println("Emp city: ");
		String city=scan.nextLine();
		
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(phNo);
		System.out.println(salary);
		System.out.println(gender);
		System.out.println(city);
	}
}
