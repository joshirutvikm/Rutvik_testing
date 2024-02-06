//WAP to remove the third element from a array list.
package com.java;

import java.util.List;

public class RemoveEle_ 
{
	public static void main(String[] args) 
	{
		List<String> li=new java.util.ArrayList();
		li.add("Red");
		li.add("Purple");
		li.add("Black");
		li.add("White");
		System.out.println(li);
		li.remove(2);
		System.out.println("After removing Third element: "+li);
	}

}
