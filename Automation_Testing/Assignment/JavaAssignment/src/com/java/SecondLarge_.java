//WAP to find the second largest element in an array
package com.java;

public class SecondLarge_ 
{
	public static void main(String[] args) 
	{
		int temp,size;
		int a[]= {10,55,45,199,3};
		size=a.length;
		for(int i=0; i<size; i++)
		{
			for(int j=i+1; j<size; j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Second Largest number : " + a[size-2]);
	}

}
