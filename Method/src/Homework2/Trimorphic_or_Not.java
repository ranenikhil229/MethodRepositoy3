package Homework2;

import java.util.Scanner;

public class Trimorphic_or_Not {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number ..");
		int num = sc.nextInt();
		
		int cube = num*num*num;
		while(num!=0)
		{
			if(num%10 != cube%10)
			{
				System.out.println("number is not trimorphic..");	
				break;
			}
			
			num = num/10;
			cube = cube/10;
		}
		
		if(num==0)
		{
			System.out.println("the number is trimorphic");
		}
		

	}

}
