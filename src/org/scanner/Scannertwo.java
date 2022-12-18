package org.scanner;

import java.util.Scanner;

public class Scannertwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Student id: ");
		int id=scan.nextInt();
		scan.nextLine();
		System.out.println("Student name");
		String name=scan.nextLine();
		int a=0;
		int count=0;
		int b=0;
		for(int i=0;i<5;i++) {
		System.out.println("Marks: ");
		int sum=scan.nextInt();
		a=sum+a;
		count++;
		b=a/count;
		}
		System.out.println("Total: "+a);
		System.out.println("Average: "+b);
		
	}

}
