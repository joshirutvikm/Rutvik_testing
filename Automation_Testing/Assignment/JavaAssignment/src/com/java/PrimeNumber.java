//WAP to compute the sum of the first 100 prime numbers.
package com.java;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		int count,sum=0;
		for(int n=1; n<=100; n++)
		{
			count=0;
			for(int i=2; i<=n/2; i++)
			{
				if(n%i==0)
				{
					count++;
					break;
				}
			}
			if(count==0 && n!=1)
			{
				sum=sum+n;
			}
		}
		System.out.println("Sum of prime number of 100 is: " + sum);
	}
}