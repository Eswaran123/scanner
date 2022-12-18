package org.scanner;

import java.util.Scanner;

public class Scannerthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Student id");
		int id=scan.nextInt();
		scan.nextLine();
		System.out.println("Student Name");
		String name=scan.nextLine();
		System.out.println("Student Email");
		String email=scan.nextLine();
		System.out.println("Student phno");
		int phno=scan.nextInt();
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(phno);
	}

}
