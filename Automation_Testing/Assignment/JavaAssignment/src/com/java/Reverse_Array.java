//WAP to reverse an array of integer values.

package com.java;

public class Reverse_Array 
{
	public static void main(String[] args) 
	{
		int [] arr=new int[] {0,1,2,3,4,5,6};
		System.out.println("Original array: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Array in reverse order: ");
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.println(arr[i] + " ");
		}
	}
}


