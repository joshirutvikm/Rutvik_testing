//WAP to find the maximum and minimum value of an array.
package com.java;

import java.util.Scanner;

public class ArrayValue 
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("Enter elements in array: ");
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<=9;i++)
		{
			
			arr[i]=sc.nextInt();
			if(arr[i]<min)
			{
				min=arr[i];
			}
			if(arr[i]>max)
			{
				max=arr[i];

			}
			System.out.println("The maximum number is: "+max);
			System.out.println();
			System.out.println("The minimum number is: "+min);
		}
	}
}

