//WAP to demonstrate multiple catch blocks
package com.java;

import java.util.Scanner;

public class Multi_Catch 
{
	public static void main(String[] args) 
	{
		try
		{
			int a[]=new int[7];
			//a[7]=35/5;
			a[7]=35/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occur");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		}
		catch(Exception e)
		{
			System.out.println("Parent Exception occurs");
		}
		System.out.println("rest of the code");
	}		
}

	