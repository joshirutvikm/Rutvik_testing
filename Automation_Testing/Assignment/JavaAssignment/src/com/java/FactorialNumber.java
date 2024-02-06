package com.java;

import java.util.Scanner;

public class FactorialNumber 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number :");
		int no=in.nextInt();
		int i,fact=1;
		for(i=1; i<=no; i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of"+ no +"is:"+fact);
	}
}
