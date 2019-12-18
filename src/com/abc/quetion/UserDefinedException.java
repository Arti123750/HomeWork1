package com.abc.quetion;

import java.util.Scanner;

class Bank extends Exception {

	public Bank() {
		super("Insufficient Balance");
	}
}

class Test
{
public void ATM(int m)throws Bank
{
int money=m;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Withdraw Amount: ");
int wid=sc.nextInt();
if(money<wid)
{
throw new Bank();	
}
else
{
int remain=money-wid;
System.out.println("Take your cash Rs."+wid+" your remaining Balance is: "+remain);

}
}

}
public class UserDefinedException {

	public static void main(String[] args) {
		
		Bank b1=new Bank();
		Test t1=new Test();
		try
		{
			t1.ATM(10000);
		}
		catch(Bank e)
		{
			System.out.println("please Enter Correct amount");
			
		}

	}

}
