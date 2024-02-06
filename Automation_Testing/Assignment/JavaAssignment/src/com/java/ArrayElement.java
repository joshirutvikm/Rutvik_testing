//WAP to calculate the average value of array elements.
package com.java;

public class ArrayElement 
{
	public static void main(String[] args) 
	{
		int[] no=new int[]{90,-60,15,40,60,-20};
		int sum=0;
		for(int i=0; i<no.length; i++)
		{
			sum=sum+no[i];
		}
		double avg=sum/no.length;
		System.out.println("average value of an elements is: " +avg);
	}

}
