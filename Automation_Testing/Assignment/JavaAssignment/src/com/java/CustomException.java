package com.java;
import java.util.Scanner;
class RutvikException extends Exception
{
	double amount;
	public RutvikException(double amount)
	{
		this.amount=amount;
	}
}
class ATM
{
	double balance;
	public void deposite(double amount)
	{
		balance=balance+amount;
		System.out.println("Account Balance is Rs."+amount);
	}
	public void withdrawal(double amount)throws RutvikException
	{
		if(amount<=balance)
		{
			balance=balance-amount;
			System.out.println(amount+"rs withdrawal successfully");
		}
		else
		{
			double needs=amount-balance;
			throw new RutvikException(needs);
		}
	}
	
}
public class CustomException
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ATM a1=new ATM();
		System.out.println("Enter value for Deposite: ");
		double amount=sc.nextDouble();
		a1.deposite(amount);
		
		System.out.println("Enter value for Withdrawal: ");
		amount=sc.nextDouble();
		try
		{
			a1.withdrawal(amount);
		}catch(RutvikException e)
		{
			System.out.println("if you enter"+e.amount+"rs more into your account then you withdrwal "+amount+"rs");
			e.printStackTrace();
			
		}
		sc.close();
	}
}
