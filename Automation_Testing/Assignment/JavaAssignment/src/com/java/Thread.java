//WAP to create one thread by extending Thread class in another Class

package com.java;

class t1 extends Thread
{
	public void run()
	{
		System.out.println("thread is running");
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}
}

public class Thread
{
	public static void main(String[] args) 
	{
		t1 d1=new t1();
		d1.start();
		{
			System.out.println("thread is running");
		}
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}
}
	
	


