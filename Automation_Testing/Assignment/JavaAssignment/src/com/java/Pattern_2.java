package com.java;
/*
1
01
101
0101
10101
 */
public class Pattern_2 
{
	public static void main(String[] args) 
	{
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(((i+j)%2)+" ");
			}
			System.out.println();
		}
	}
}
