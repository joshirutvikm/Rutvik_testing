//W.A.J.P to Take three numbers from the user and print the greatest number.
package com.java;

import java.util.Scanner;

public class Greatest_Number 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int n1=in.nextInt();
		System.out.println("Enter the Second number: ");
		int n2=in.nextInt();
		System.out.println("Enter the Third number: ");
		int n3=in.nextInt();
		
		if(n1>n2 && n1>n3)
		{
			System.out.println("Number 1 is greatest: "+n1);
		}
		else if(n2>n3)
		{
			System.out.println("Number 2 is greatest: "+n2);
		}
		else
		{
			System.out.println("Number 3 is greatest: "+n3);
		}
	}
}


