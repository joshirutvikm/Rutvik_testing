package com.java;

public class Armstrong_Number 
{
	public static void main(String[] args) 
	{
		int no=153,n1,rem,res=0;
		n1=no;
		while(n1!=0)
		{
			rem=n1%10;
			res+=Math.pow(rem, 3);
			n1/=10;
		}
		if(res==n1)
		{
			System.out.println(no+"is an armstrong number");
		}
		else
		{
			System.out.println(no+"is not an armstrong number");
		}	
	}
}
