//check the number weather the input number lies in given range or not

import java.util.*;

public class CheckNumber {
	/*
	public  void check(int num) {
		
		if(num>100) {
			System.out.println(" The number is  < 100");
			if(num>150) {
				System.out.println(" The number is > 150");
				
			}
			else {
				System.out.println(" The number is > 150");
			}
		}
		else {
			System.out.println(" The number is > 100");
			if(num>50) {
				System.out.println(" The number is > 50");
			}
			else {
				System.out.println(" The number is < 50");
			}
		}
		
	}
		
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number: ");
		int n=sc.nextInt();
		
		check(n);
		
		
	}
	
	public static void check(int n)
	{
		if(n<100)
		{
			if(n>50)
			{
				System.out.println("n is greater then 50 but less then 100");
			}
			else
			{
				System.out.println("n is less then 50 ");
			}
		}
		else
		{
			if(n>150)
			{
				System.out.println("n is greater then 150");
			}
			else
			{
				System.out.println("n is less then 150 but greater then 100");
			}
		}
		
		
			
		}


}
