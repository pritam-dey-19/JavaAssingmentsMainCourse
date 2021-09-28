// write a java program to either adding two numbers or multiplication of two numbers


import java.util.*;

public class SumOrMultiplication {
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int multi(int a, int b) {
		return a*b;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter the first number : ");
		int a=in.nextInt();
		
		System.out.println(" Enter the 2nd number : ");
		int b=in.nextInt();
		
		System.out.println("Enter your oparation choice : ");
		in.nextLine();
		String op=in.nextLine();
		
		String ad="+";
		String mu="*";
		
		if(op.equals(ad)) {
			int sum=add(a,b);
			System.out.println(sum);
		}
		else if(op.equals(mu)) {
			int pr=multi(a,b);
			System.out.println(pr);
		}
		
		else {
			System.out.println("Invalid oparator selected");
		}

	}

}
