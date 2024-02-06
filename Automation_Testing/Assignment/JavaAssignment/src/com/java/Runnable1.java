//WAP to create one thread by implementing Runnable interface in Class.
package com.java;
class Demo implements Runnable
{
	@Override
	public void run() 
	{
		System.out.println("Thread is running ");
	}
}

public class Runnable1 
{
	public static void main(String[] args) 
	{
		Demo d1=new Demo();
		Thread t1=new Thread();
		t1.start();
		{
			System.out.println("Thread is running ");
		}
	}
}

