//WAP to update specific array element by given element.
package com.java;

import java.util.List;
import java.util.Set;

public class UpdateArrayEle_ 
{
	public static void main(String[] args) 
	{
		List<String> li=new java.util.ArrayList<String>();
		li.add("Black");
		li.add("Red");
		li.add("Green");
		li.add("Purple");
		System.out.println(li);
		li.set(2, "Pink");
		li.set(1, "White");
		System.out.println("Updated array element is: "+li);
	}
}
