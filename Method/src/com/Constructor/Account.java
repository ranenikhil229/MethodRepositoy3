package com.Constructor;

public class Account {

	
	public long accountNo;
	public String customerName;
	
	public Account()
	{
		accountNo=10002;
		customerName="suresh";
		System.out.println(accountNo+" "+customerName);
	}
	
	public Account(long accountNo, String customerName)
	{
		
		this.accountNo=accountNo;
		this.customerName=customerName;
		System.out.println("i am in parameterised constructor");
		System.out.println(accountNo+" "+customerName);
		
	}
	
	public static void main(String[] args) {
		
		Account a1 = new Account();
		Account a3 = new Account(12343, "harshal");
		Account a4 = new Account(455574754, "sumit");

	}

}
