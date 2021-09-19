// Java Program to Count Number of Digits in a Number using While Loop 


import java.util.Scanner;

public class CountDigits {
	
	public static void main(String[] args) {
		int Number, Count=0;
		Scanner sc = new Scanner(System.in);		
		System.out.println("\n Please Enter any Number: ");
		Number = sc.nextInt();
		
		while(Number > 0) {
			Number = Number / 10;
			Count = Count + 1; 
		}
		System.out.print("Number of Digits in a Given Number = " +Count);
	}
}