package com.java;

import java.util.Scanner;

public class DisplayGrades 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks(out of 100):");
		int marks=sc.nextInt();
		dis(marks);
		sc.close();
	}

	private static void dis(int marks) 
	{
		System.out.println("Marks:" + marks + " - Grades");
		if(marks >= 91 && marks <=100)
		System.out.println("AA");
		else if(marks >= 81 && marks <= 90)
		System.out.println("AB");
		else if(marks >= 71 && marks <= 80)
		System.out.println("BB");
		else if(marks >= 61 && marks <= 70)
		System.out.println("BC");
		else if(marks >= 51 && marks <= 60)
		System.out.println("CD");
		else if(marks >= 41 && marks <= 50)
		System.out.println("DD");
		else
		System.out.println("FAIL");
	}

}
