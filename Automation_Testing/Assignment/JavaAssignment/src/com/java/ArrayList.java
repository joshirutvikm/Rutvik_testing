//WAP to iterate through all elements in an array list
package com.java;

import java.util.Arrays;
import java.util.List;

public class ArrayList 
{
	public static void main(String[] args) 
	{
		List<Integer> num=Arrays.asList(1,2,3,4,5,6,7,8);
		for(int i=1; i<=num.size(); i++)
		{
			System.out.print((i) + " ");
		}
	}

}
