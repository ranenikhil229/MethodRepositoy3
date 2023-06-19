package Homework2;

import java.util.Scanner;

public class Spy_Or_Not {

	public static void main(String[] args) {
		
		int num;
		int lastDigit;
		int product = 1;
		int sum=0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any number..");
		
		num=sc.nextInt();
		
		while(num>0)
		{
		lastDigit = num%10;
		sum = sum+lastDigit;
		product = product*lastDigit;
		num = num/10;
	
		}
		if(sum == product)
		{
			System.out.println("the given number is spy number..");
		}
		else
		{
			System.out.println("the given number is not spy number...");
		}
		

	}

}
